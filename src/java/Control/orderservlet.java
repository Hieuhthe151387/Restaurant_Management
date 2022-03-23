package Control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.DBconnect;
import Model.Customer;
import Model.ListProduct;
import Model.Order;
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
public class orderservlet extends HttpServlet {

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
            out.println("<title>Servlet orderservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet orderservlet at " + request.getContextPath() + "</h1>");
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
        DBconnect db = new DBconnect();
        ArrayList<Product> list = db.getListProduct();
        request.getSession().removeAttribute("listcust");
        ArrayList<Customer> custlist = db.getListCustomer();
        request.getSession().setAttribute("listcust", custlist);
        request.getSession().setAttribute("listfood", list);
        String req = request.getParameter("req");
        if(req==null){req="";}
        if(req.equals("addf")){
            request.getSession().setAttribute("cart", request.getSession().getAttribute("orderview"));
        }else{
            Order cart = new Order();
            cart.setId(db.getNewId(4));
            request.getSession().setAttribute("cart", cart);
        }
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("createorder.jsp").forward(request, response);// path without /
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
         DBconnect db = new DBconnect();
        String req = request.getParameter("req");
        String fid = request.getParameter("fid");
        request.getSession().getAttribute("cart");
        ListProduct foodlist = new ListProduct();
        ArrayList<Product> list = db.getListProduct();
        foodlist.setList(list);
        Order cart = (Order)request.getSession().getAttribute("cart");
        switch(req){
            case "add": cart.addProduct(foodlist.getProductById(fid));
                        break;
            case "update":int quan = Integer.parseInt(request.getParameter("quantity"));
                        cart.getProduct(fid).setQuantity(quan);
                        if(quan==0) cart.removeProduct(fid);
                break;
            case "submit":
//                           db.addneworder(cart);
//                           request.getSession().removeAttribute("cart");
        }
//        request.getSession().setAttribute("cart", cart);
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("createorder.jsp").forward(request, response);// path without /
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
