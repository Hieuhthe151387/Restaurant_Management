/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DBconnect;
import Model.Customer;
import Model.Order;
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
public class order extends HttpServlet {

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
            out.println("<a href=\"order\">Go back</a>");
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
        DBconnect db = new DBconnect();
        ArrayList<Customer> custlist = db.getListCustomer();
        request.getSession().setAttribute("listcust", custlist);
        ArrayList<Order> listorder = db.getOrderList();
        request.getSession().setAttribute("listorder", listorder);
        request.getSession().setAttribute("newid", db.getNewId(4));
        request.getRequestDispatcher("order.jsp").forward(request, response);// path without /
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
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String req = request.getParameter("req");
        DBconnect db = new DBconnect();
        Order order = new Order();
        String oid="",cid="";
        if(req.equals("v")||req.equals("r")||req.equals("st")) 
        {oid=request.getParameter("oid");}
       switch(req){
            case "v": order = db.getOrderById(oid);  
                      Customer custorder = db.getCustomerById(order.getCustid());
                      request.getSession().setAttribute("orderview", order);
                      request.getSession().setAttribute("custorder", custorder);
                      break;
            case "st": db.setStatus(oid, Integer.parseInt(request.getParameter("st")));   
                      request.setAttribute("message", "have changed status");
//                      response.sendRedirect("customer");
                      processRequest(request, response);
                break;
//                remove an cust 
            case "r":db.deleteOrder(oid);
                    request.setAttribute("message", "removed");
                break;
//            request create new order
/*            case "c":
                      request.setAttribute("newId",newid);
                break;
//            request submit info of new cust had been create
             case "s":p = parseProduct(request);
                      db.createProduct(p);
                      request.setAttribute("message","create");
                break;
   */         default: break;
        }
        if(req.equals("v")||req.equals("st")){
        request.getRequestDispatcher("/order.jsp").forward(request, response);
        }
        else processRequest(request, response);
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
