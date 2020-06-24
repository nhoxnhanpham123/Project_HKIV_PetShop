/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Breeds;
import entity.BreedsFacadeLocal;
import entity.PetsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "breedController", urlPatterns = {"/Breeds/*"})
public class breedController extends HttpServlet {

    @EJB
    private PetsFacadeLocal petsFacade;

    @EJB
    private BreedsFacadeLocal breedsFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String path = request.getPathInfo();

            switch (path) {
                case "/List":
                    getListView(request, response);
                    break;
                case "/Create":
                    getCreateView(request, response);
                    break;
                case "/Store":
                    insert(request, response);
                    break;
                case "/Edit":
                    getEditView(request, response);
                    break;
                case "/Update":
                    update(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                default:
                    getViewError(request, response);
                    break;
            }
        }
    }

    private void getViewError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", breedsFacade.findAll());
        request.getRequestDispatcher("/Admin/breed/breedList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String name = request.getParameter("breeds_name");
            String msg = null;
            boolean check = false;
            for (Breeds breeds : breedsFacade.findAll()) {
                if (breeds.getName().equals(name)) {
                    msg = name + " already in database";
                    check = true;
                    request.setAttribute("msg", msg);
                    request.getRequestDispatcher("/Admin/breed/addBreed.jsp").forward(request, response);
                }
            }
            if (check == false) {
                Breeds br = new Breeds(name);
                breedsFacade.create(br);
                response.sendRedirect("List");
            }

        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Breeds br = breedsFacade.find(id);
            petsFacade.deleteBYBreed(br);
            breedsFacade.remove(br);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("breeds_id"));
            String name = request.getParameter("breeds_name");
            Breeds br = new Breeds(id, name);
            breedsFacade.edit(br);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getCreateView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/breed/addBreed.jsp").forward(request, response);
    }

    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
                request.getRequestDispatcher("/Admin/breed/breedList.jsp").forward(request, response);
            } else {
                int id = Integer.parseInt(request.getParameter("id"));
                Breeds bd = breedsFacade.find(id);
                request.setAttribute("bd", bd);
                request.getRequestDispatcher("/Admin/breed/updateBreed.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
