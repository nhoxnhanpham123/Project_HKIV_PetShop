/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Accessories;
import entity.AccessoriesFacadeLocal;
import entity.Animals;
import entity.AnimalsFacadeLocal;
import entity.CateES;
import entity.CateESFacadeLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@WebServlet(name = "accessoriesController", urlPatterns = {"/Accessories/*"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50)
public class accessoriesController extends HttpServlet {

    @EJB
    private CateESFacadeLocal cateESFacade;
    @EJB
    private AnimalsFacadeLocal animalsFacade;

    @EJB
    private AccessoriesFacadeLocal accessoriesFacade;
    public static final String SAVE_DIRECTORY = "ImageItems";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Part part;

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
                case "/Detail":
                    getViewDetail(request, response);
                    break;
                case "/PrintReport":
                    printReport(request, response);
                    break;
                default:
                    getViewError(request, response);
                    break;
            }

        }
    }

    private String extracFile(Part part) {
        String i = part.getHeader("content-disposition");//form-data; name="file"; filename="Avatar.jpg"
        String[] items = i.split(";");//cat chuoi thanh mang sau mỗi dấu ;
        for (String s : items) {
            if (s.trim().startsWith("filename")) {//tìm chuoi bat dau bang filename
                String newS = s.substring(s.indexOf("=") + 2, s.length() - 1);//cat chuoi
                newS = newS.replace("\\", "/");
                int a = newS.lastIndexOf("/");
                return newS.substring(a + 1);
            }
        }
        return null;

    }

    private void saveToFolder(String savePath) {
        try {
            InputStream is = part.getInputStream();
            FileOutputStream fos = new FileOutputStream(savePath);
            byte[] buf = new byte[1024];
            int len;
            while ((len = is.read(buf)) > 0) {
                fos.write(buf, 0, len);
            }
        } catch (Exception e) {

        }
    }

    private String getFullPath(HttpServletRequest request, HttpServletResponse response) {
        String path = request.getServletContext().getRealPath("");
        path = path.replace("\\", "/");
        path = path.replace("build/", "");
        String fullPath = null;
        if (path.endsWith("/")) {
            fullPath = path + SAVE_DIRECTORY;
        } else {
            fullPath = path + File.separator + SAVE_DIRECTORY;
        }
        return fullPath;
    }

    private void printReport(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setAttribute("list", accessoriesFacade.selectAcc());
        request.getRequestDispatcher("/Admin/report/Accessories/topAccessories.jsp").forward(request, response);
    }
    
    private void insert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String id = request.getParameter("accessoreis_id");
            String msg = null;
            String msgPrice = null;
            if (accessoriesFacade.find(id) == null) {
                String name = request.getParameter("accessoreis_name");
                int price = Integer.parseInt(request.getParameter("price"));
                String description = request.getParameter("description");
                part = request.getPart("image");
                String fileName = extracFile(part);
                int cFId = Integer.parseInt(request.getParameter("animals"));
                int cEId = Integer.parseInt(request.getParameter("category"));
                Animals animals = animalsFacade.find(cFId);
                CateES cateEs = cateESFacade.find(cEId);

                if (price > 0 && price < 1000000) {
                    Accessories accessories = new Accessories(id, name, price, description, fileName, animals, cateEs);
                    accessoriesFacade.create(accessories);
                    String savePath = getFullPath(request, response) + File.separator + fileName;
                    saveToFolder(savePath);
                    response.sendRedirect("List");
                } else {
                    msgPrice = "Price must be between 0 - 100000000";
                    request.setAttribute("msgPrice", msgPrice);
                    request.setAttribute("animals", animalsFacade.findAll());
                    request.setAttribute("category", cateESFacade.findAll());
                    request.getRequestDispatcher("/Admin/accessories/addAccessories.jsp").forward(request, response);
                }

            } else {
                msg = "Id already exists";
                request.setAttribute("msg", msg);
                request.setAttribute("animals", animalsFacade.findAll());
                request.setAttribute("category", cateESFacade.findAll());
                request.getRequestDispatcher("/Admin/accessories/addAccessories.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void show(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", accessoriesFacade.findAll());
        request.getRequestDispatcher("/Admin/accessories/accessoriesList.jsp").forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String id = request.getParameter("id");
            Accessories accessories = accessoriesFacade.find(id);
            String dePath = getFullPath(request, response) + File.separator + accessories.getImage();
            File fileDe = new File(dePath);
            fileDe.delete();
            accessoriesFacade.remove(accessories);
            response.sendRedirect("List");
        } catch (Exception ex) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            String id = request.getParameter("accessories_id");
            String name = request.getParameter("accessories_name");
            int price = Integer.parseInt(request.getParameter("price"));
            String description = request.getParameter("description");
            part = request.getPart("image");
            String fileName = extracFile(part);
            int cFId = Integer.parseInt(request.getParameter("animals"));
            int cEId = Integer.parseInt(request.getParameter("category"));
            Animals animals = animalsFacade.find(cFId);
            CateES cateEs = cateESFacade.find(cEId);
            Accessories accessoriesDE = accessoriesFacade.find(id);
            String fileDe = accessoriesDE.getImage();
            String dePath = getFullPath(request, response) + File.separator + fileDe;
            File file = new File(dePath);
            file.delete();
            Accessories accessories = new Accessories(id, name, price, description, fileName, animals, cateEs);
            accessoriesFacade.edit(accessories);
            String savePath = getFullPath(request, response) + File.separator + fileName;
            saveToFolder(savePath);
            response.sendRedirect("List");
        } catch (Exception ex) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }
    }

    private void getListView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", accessoriesFacade.findAll());
        request.getRequestDispatcher("/Admin/accessories/accessoriesList.jsp").forward(request, response);
    }

    private void getCreateView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("animals", animalsFacade.findAll());
        request.setAttribute("category", cateESFacade.findAll());
        request.getRequestDispatcher("/Admin/accessories/addAccessories.jsp").forward(request, response);
    }

    private void getEditView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
                response.sendRedirect("List");
            } else {
                String id = request.getParameter("id");
                Accessories accessories = accessoriesFacade.find(id);
                request.setAttribute("animals", animalsFacade.findAll());
                request.setAttribute("cateES", cateESFacade.findAll());
                request.setAttribute("accessories", accessories);
                request.getRequestDispatcher("/Admin/accessories/updateAccessories.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
        }

    }

    private void getViewError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/Admin/404.jsp").forward(request, response);
    }

    private void getViewDetail(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            if (request.getParameter("id") == null || request.getParameter("id").trim().isEmpty()) {
                response.sendRedirect("List");
            } else {
                String id = request.getParameter("id");
                request.setAttribute("acc", accessoriesFacade.find(id));
                request.getRequestDispatcher("/Admin/accessories/detail.jsp").forward(request, response);
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
