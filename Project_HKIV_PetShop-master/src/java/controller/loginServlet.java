/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Members;
import entity.MembersFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nhan
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    @EJB
    private MembersFacadeLocal membersFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String mail = request.getParameter("txtMail");
            String password = request.getParameter("txtPassword");
            boolean check = false;
            // tao Session
            HttpSession session = request.getSession();
          
            for (Members member : membersFacade.findAll()) {
                if (mail.equals(member.getMail()) && password.equals(member.getPassword())) {
                    // luu vao session
                    session.setAttribute("username", member);

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
                    RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
                    dis.forward(request, response);
                    check = true;
                }
            }
            if (check == false) {
                request.setAttribute("error", "Username or Password invalid !");
                request.getRequestDispatcher("Login/login.jsp").forward(request, response);
            }

        } finally {
            out.close();
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
