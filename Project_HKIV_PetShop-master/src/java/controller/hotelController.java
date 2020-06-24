/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Members;
import entity.MembersFacadeLocal;
import entity.Pethotel;
import entity.PethotelFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "hotelController", urlPatterns = {"/Hotel/*"})
public class hotelController extends HttpServlet {

    @EJB
    private PethotelFacadeLocal pethotelFacade;

    @EJB
    private MembersFacadeLocal membersFacade;

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String path = request.getPathInfo();

            switch (path) {
                case "/List":
                    getListView(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                case "/Edit":
                    getEditView(request, response);
                    break;
                case "/Store":
                    insert(request, response);
                    break;
                case "/Update":
                    update(request, response);
                    break;
                case "/PrintBill":
                    printBill(request, response);
                    break;
                default:
                    out.print("Sai ùi");
                    break;
            }

        }
    }

    private void printBill(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("hotel") != null) {
            Pethotel hotel = (Pethotel) session.getAttribute("hotel");
            request.setAttribute("hotel", hotel);
            PrintWriter out = response.getWriter();
            request.getRequestDispatcher("/Customer/petHotel/colorlib-regform-3/printBill.jsp").forward(request, response);
        }
    }

    private void getViewError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("hotelList", pethotelFacade.findAll());
        request.getRequestDispatcher("/Admin/hotel/hotelList.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        if (session.getAttribute("username") != null) {
            String namePet = request.getParameter("name");
            String dateEnd = request.getParameter("dateEnd");
            String status = request.getParameter("status");
            String msg = null;
            Date date = new Date(System.currentTimeMillis());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String hihi = dateFormat.format(date);

            Members member = (Members) session.getAttribute("username");
            Pethotel hotel = new Pethotel(namePet, hihi, dateEnd, null, status, member);

            Date d = dateFormat.parse(dateEnd);
            long day = (d.getTime() - date.getTime()) / (24 * 3600 * 1000);
            if (day < 0) {
                msg = "Invalid Date";
                request.setAttribute("msg", msg);
                request.getRequestDispatcher("/Customer/petHotel/colorlib-regform-3/index.jsp").forward(request, response);
            } else {
                pethotelFacade.create(hotel);
                session.setAttribute("hotel", hotel);
                response.sendRedirect("PrintBill");
            }

        } else {
            request.getRequestDispatcher("/Login/loginCustomer/Login_v11/index.jsp").forward(request, response);
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String id = request.getParameter("id");
            Pethotel hoPethotel = pethotelFacade.find(id);
            pethotelFacade.remove(hoPethotel);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            String namePet = request.getParameter("namePet");
            String dateStart = request.getParameter("dateStart");
            String dateEnd = request.getParameter("dateEnd");
            int price = Integer.parseInt(request.getParameter("price"));
            String status = request.getParameter("status");
            String mId = request.getParameter("MId");
            Members member = membersFacade.find(mId);
            Pethotel hotel = new Pethotel();
            pethotelFacade.edit(hotel);
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
                response.sendRedirect("List");
            } else {
                String id = request.getParameter("id");
                request.setAttribute("members", membersFacade.findAll());
                request.setAttribute("hotel", pethotelFacade.find(id));

                request.getRequestDispatcher("/Admin/hotel/updateHotel.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(hotelController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(hotelController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
