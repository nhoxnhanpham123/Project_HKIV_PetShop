/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.AccessoriesFacadeLocal;
import entity.Admins;
import entity.AdminsFacadeLocal;
import entity.FeedbacksFacadeLocal;
import entity.FoodsFacadeLocal;
import entity.PethotelFacadeLocal;
import entity.PetsFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "adminController", urlPatterns = {"/Admins/*"})
public class adminController extends HttpServlet {

    @EJB
    private FeedbacksFacadeLocal feedbacksFacade;
    @EJB
    private PethotelFacadeLocal pethotelFacade;
    @EJB
    private AccessoriesFacadeLocal accessoriesFacade;
    @EJB
    private FoodsFacadeLocal foodsFacade;
    @EJB
    private PetsFacadeLocal petsFacade;

    @EJB
    private AdminsFacadeLocal adminsFacade;

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
                case "/Login":
                    getViewLogin(request, response);
                    break;
                case "/Index":
                    getViewIndex(request, response);
                    break;
                case "/Check":
                    login(request, response);
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
        request.setAttribute("list", adminsFacade.findAll());
        request.getRequestDispatcher("/Admin/admin/adminList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String mail = request.getParameter("admins_mail");
            String password = request.getParameter("admins_pass");
            Admins ad = new Admins(mail, password);
            adminsFacade.create(ad);
            response.sendRedirect("Login");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Admins ad = adminsFacade.find(id);
            adminsFacade.remove(ad);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String mail = request.getParameter("admins_mail");
            String password = request.getParameter("admins_pass");
            Admins ad = new Admins(mail, password);
            adminsFacade.edit(ad);
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getCreateView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/register_admin.jsp").forward(request, response);
    }

    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.getRequestDispatcher("/Admin/admin/updateAdmin.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getViewLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/admin_Login.jsp").forward(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mail = request.getParameter("txtMail");
        String password = request.getParameter("txtPassword");
        boolean check = false;
        // tao Session
        HttpSession session = request.getSession();

        for (Admins admin : adminsFacade.findAll()) {
            if (mail.equals(admin.getMail()) && password.equals(admin.getPassword())) {
                // luu vao session
                session.setAttribute("admin", admin);

                // tao Cookie lay thong tin cua nguoi dung de nho lai
                Cookie user = new Cookie("user", mail);
                Cookie pass = new Cookie("pass", password);
                if (request.getParameter("chkRemember") != null) {
                    user.setMaxAge(60 * 60 * 24);
                    pass.setMaxAge(60 * 60 * 24);
                } else {
                    user.setMaxAge(0);
                    pass.setMaxAge(0);
                }
                response.addCookie(user);
                response.addCookie(pass);
                response.sendRedirect("Index");
                check = true;
            }
        }
        if (check == false) {
            request.setAttribute("error", "Username or Password invalid !");
            response.sendRedirect("Login");
        }
    }

    private void getViewIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("totalPet", petsFacade.findAll().size());
        request.setAttribute("fa", (foodsFacade.findAll().size() + accessoriesFacade.findAll().size()));
        request.setAttribute("hotel", pethotelFacade.findAll().size());
        request.setAttribute("feedback", feedbacksFacade.findAll().size());
        request.getRequestDispatcher("/Admin/index.jsp").forward(request, response);
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
