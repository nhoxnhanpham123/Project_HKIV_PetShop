/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cusController;

import entity.AnimalsFacadeLocal;
import entity.BreedsFacadeLocal;
import entity.FoodsFacadeLocal;
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
@WebServlet(name = "cusFoodController", urlPatterns = {"/FoodProduct/*"})
public class cusFoodController extends HttpServlet {

    @EJB
    private BreedsFacadeLocal breedsFacade;
    @EJB
    private AnimalsFacadeLocal animalsFacade;
    @EJB
    private FoodsFacadeLocal foodsFacade;

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
                case "/All":
                    getViewAll(request, response);
                    break;
                case "/Detail":
                    getDetailView(request, response);
                    break;
                case "/Search":
                    search(request, response);
                    break;
                case "/SearchByPrice":
                    searchByPrice(request, response);
                    break;
                case "/ShowByAnimals":
                    getViewAnimals(request, response);
                    break;
                case "/Compare":
                    getCompareView(request, response);
                    break;
                default:
                    out.print("Huhu");
                    break;
            }
        }
    }

    private void searchByPrice(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameter("price") == null || request.getParameter("price").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            String price = request.getParameter("price");
            int from;
            int to;
            if (price.equals("value1")) {
                from = 10;
                to = 50;
                request.setAttribute("list", foodsFacade.searchByPrice(from, to));
                request.setAttribute("forAnimals", animalsFacade.findAll());
                request.setAttribute("breed", breedsFacade.findAll());
                request.getRequestDispatcher("/Customer/Foods/index.jsp").forward(request, response);
            }
            if (price.equals("value2")) {
                from = 50;
                to = 100;
                request.setAttribute("list", foodsFacade.searchByPrice(from, to));
                request.setAttribute("forAnimals", animalsFacade.findAll());
                request.setAttribute("breed", breedsFacade.findAll());
                request.getRequestDispatcher("/Customer/Foods/index.jsp").forward(request, response);
            }
            if (price.equals("value3")) {
                from = 100;
                request.setAttribute("list", foodsFacade.searchByMaxPrice(from));
                request.setAttribute("forAnimals", animalsFacade.findAll());
                request.setAttribute("breed", breedsFacade.findAll());
                request.getRequestDispatcher("/Customer/Foods/index.jsp").forward(request, response);
            }
        }
    }

    private void getViewAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", foodsFacade.findAll());
        request.setAttribute("forAnimals", animalsFacade.findAll());
        request.setAttribute("breed", breedsFacade.findAll());
        request.getRequestDispatcher("/Customer/Foods/index.jsp").forward(request, response);
    }

    private void getDetailView(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            String id = request.getParameter("id");
            request.setAttribute("food", foodsFacade.find(id));
            request.setAttribute("list", foodsFacade.recommentFood(foodsFacade.find(id).getCFId()));
            request.setAttribute("breed", breedsFacade.findAll());
            request.setAttribute("forAnimals", animalsFacade.findAll());
            request.getRequestDispatcher("/Customer/Foods/detail.jsp").forward(request, response);

        }

    }

    private void getViewAnimals(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("animlas", animalsFacade.find(id));
            request.setAttribute("forAnimals", animalsFacade.findAll());
            request.setAttribute("breed", breedsFacade.findAll());
            request.getRequestDispatcher("/Customer/Foods/showByAnimals.jsp").forward(request, response);
        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameter("txtName") == null || request.getParameter("txtName").trim().isEmpty()) {
            response.sendRedirect("All");
        } else {
            String name = request.getParameter("txtName");
            request.setAttribute("list", foodsFacade.searchByName(name));
            request.setAttribute("forAnimals", animalsFacade.findAll());
            request.setAttribute("breed", breedsFacade.findAll());
            request.getRequestDispatcher("/Customer/Foods/index.jsp").forward(request, response);
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

    private void getCompareView(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getParameter("id_1") == null || request.getParameter("id_1").trim().isEmpty()) {
            if (request.getParameter("id_2") == null || request.getParameter("id_2").trim().isEmpty()) {
                response.sendRedirect("All");
            }
        } else {
            String id_1 = request.getParameter("id_1");
            String id_2 = request.getParameter("id_2");
            request.setAttribute("food", foodsFacade.find(id_1));
            request.setAttribute("compare", foodsFacade.find(id_2));
            request.setAttribute("list", foodsFacade.recommentFood(foodsFacade.find(id_1).getCFId()));
            request.getRequestDispatcher("/Customer/Foods/compare.jsp").forward(request, response);
        }
    }

}
