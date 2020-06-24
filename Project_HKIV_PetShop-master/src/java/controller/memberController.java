/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.xml.ws.transport.tcp.io.OutputWriter;
import entity.Feedbacks;
import entity.FeedbacksFacadeLocal;
import entity.Members;
import entity.MembersFacadeLocal;
import entity.OdersDetailsFacadeLocal;
import entity.Orders;
import entity.OrdersFacadeLocal;
import entity.PethotelFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "memberController", urlPatterns = {"/Member/*"})
public class memberController extends HttpServlet {
    @EJB
    private FeedbacksFacadeLocal feedbacksFacade;
    @EJB
    private PethotelFacadeLocal pethotelFacade;
    @EJB
    private OdersDetailsFacadeLocal odersDetailsFacade;
    @EJB
    private OrdersFacadeLocal ordersFacade;

    @EJB
    private MembersFacadeLocal membersFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String path = request.getPathInfo();
            switch (path) {
                case "/List":
                    getListView(request, response);
                    break;
                case "/ListProfile":
                    getListProfile(request, response);
                    break;
                case "/Delete":
                    delete(request, response);
                    break;
                case "/Update":
                    update(request, response);
                    break;
                case "/updateProfile":
                    getListupdatePro(request, response);
                    break;
                case "/Edit":
                    getViewEdit(request, response);
                    break;
                case "/Create":
                    getViewCreate(request, response);
                    break;
                case "/Store":
                    insert(request, response);
                default:
                    getViewError(request, response);
                    break;
            }
        }
    }

    private void getViewError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
    }

    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String name = request.getParameter("members_name");
            String mail = request.getParameter("mail");
            String password = request.getParameter("password");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            Members members = new Members(name, mail, password, phone, address);
            membersFacade.create(members);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private Members findById(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        return membersFacade.find(id);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            Members members = membersFacade.find(id);
            for(Orders o : members.getOrdersCollection()){
                odersDetailsFacade.deleteByOrder(o);
            }
            feedbacksFacade.deleteByUser(members);
            ordersFacade.deleteByUser(members);
            pethotelFacade.deleteByUser(members);
            membersFacade.remove(members);
            request.setAttribute("list", membersFacade.findAll());
            request.getRequestDispatcher("/Admin/member/memberList.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("members_name");
            String mail = request.getParameter("mail");
            String password = request.getParameter("password");
            String phone = request.getParameter("phone");
            String address = request.getParameter("address");
            Members members = new Members(id, name, mail, password, phone, address);
            membersFacade.edit(members);
            response.sendRedirect("List");
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", membersFacade.findAll());
        request.getRequestDispatcher("/Admin/member/memberList.jsp").forward(request, response);
    }

    private void getViewCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Login/register.jsp").forward(request, response);
    }

    private void getViewEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
//            request.getRequestDispatcher("/Admin/member/memberList.jsp").forward(request, response);
                response.sendRedirect("List");
            } else {
                int id = Integer.parseInt(request.getParameter("id"));
                request.setAttribute("member", membersFacade.find(id));
                request.getRequestDispatcher("/Admin/member/updateMem.jsp").forward(request, response);
            }
        } catch (Exception e) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }

    }

    public memberController() {
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

    private void getListProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        
        request.setAttribute("list", membersFacade.find(id));
        request.getRequestDispatcher("/Profile/profile.jsp").forward(request, response);
    }

    private void getListupdatePro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        Members members = new Members(id, name, mail, password, phone, address);
        HttpSession session = request.getSession();
        membersFacade.edit(members);
        session.setAttribute("username", members);
        request.setAttribute("list", membersFacade.find(id));
        request.getRequestDispatcher("/Profile/profile.jsp").forward(request, response);
        
    }

}
