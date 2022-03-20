/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DBconnect;
import Model.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class menu extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet menu</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("This record had been "+request.getAttribute("message"));
            out.println("<a href=\"menu\">Go back</a>");
            out.println("</body>");
            out.println("</html>");
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
        response.setContentType("text/html;charset=UTF-8");
        request.getSession().removeAttribute("listproduct");
        ArrayList<Product> list = new DBconnect().getListProduct();
        request.getSession().setAttribute("listproduct", list);
        request.getRequestDispatcher("menu.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    private Product parseProduct(HttpServletRequest request){
           Product p = new Product();
            p.setId(request.getParameter("id"));
            p.setName(request.getParameter("name"));
            p.setPrice(request.getParameter("price"));
            p.setCost(request.getParameter("cost"));
            p.setQuantity(Integer.parseInt(request.getParameter("quan")));
            return p;
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String req = request.getParameter("req");
        DBconnect db = new DBconnect();
        Product p = new Product();
        String id="",newid;
        if(req.equals("v")||req.equals("r")) {id=request.getParameter("id");}
        
        switch(req){
            case "v": p = db.getProductById(id);
                      request.setAttribute("viewid", id);
                      request.setAttribute("productview", p);
                break;
           case "u": p = parseProduct(request);
                      db.updateProduct(p);
                      request.setAttribute("message", "updated");
//                      response.sendRedirect("customer");
                      processRequest(request, response);
                break;
//                remove an cust 
            case "r":db.deleteProduct(id);
                    request.setAttribute("message", "removed");
                break;
//            request create new cust
            case "c": newid = db.getNewId(2);
                      request.setAttribute("newId",newid);
                break;
//            request submit info of new cust had been create
             case "s":p = parseProduct(request);
                      db.createProduct(p);
                      request.setAttribute("message","create");
                break;
            default: break;
        }
        if(req.equals("v")||req.equals("c")){
        request.getRequestDispatcher("/menu.jsp").forward(request, response);
        }
        else processRequest(request, response);
 /*        */
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
