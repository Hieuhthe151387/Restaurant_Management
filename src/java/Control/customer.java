/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DBconnect;
import Model.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class customer extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Customer</title>");            
            out.println("</head>");
            out.println("<body>");
//            out.println("This record had been "+((Customer)request.getAttribute("message")).getAddress());
            out.println("This record had been "+request.getAttribute("message"));
            out.println("<a href=\"customer\">Go back</a>");
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
        request.getSession().removeAttribute("listcust");
        ArrayList<Customer> list = new DBconnect().getListCustomer();
        request.getSession().setAttribute("listcust", list);
        request.getRequestDispatcher("customer.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Customer parseCust(HttpServletRequest request){
           Customer c = new Customer();
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            c.setID(request.getParameter("id"));
            c.setName(request.getParameter("name"));
            c.setAge(Integer.parseInt(request.getParameter("age")));
            c.setGender(request.getParameter("gender").equals("male"));
            c.setShortname(request.getParameter("sname"));
            c.setPhoneNumber(request.getParameter("phonenum"));
            String a0 = request.getParameter("address0");
            String a1 = request.getParameter("address1");
            String a2 = request.getParameter("address2");
            if (a2==null) {a2="H ";}
            String a3 = request.getParameter("address3");
            c.setAddress(a0+", "+a1+", "+a2+", "+a3);
            return c;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String req = request.getParameter("req");
        DBconnect db = new DBconnect();
        Customer cust = new Customer();
        String id="",newid;
        if(req.equals("v")||req.equals("r")) {id=request.getParameter("id");}
        switch(req){
            case "v": cust = db.getCustomerById(id);
                      request.setAttribute("id", id);
                      request.setAttribute("custview", cust);
                break;
            case "u": cust = parseCust(request);
                      db.updateCust(cust);
                      request.setAttribute("message", "updated");
                break;
//                remove an cust 
            case "r":db.deleteCust(id);
                    request.setAttribute("message", "removed");
                break;
//            request create new cust
            case "c": newid = db.getNewId(3);
                      request.setAttribute("newId",newid);
                break;
//            request submit info of new cust had been create
            case "s": 
                      cust=parseCust(request);
                      db.createCust(cust);
                      request.setAttribute("message", "created");
                break;
            default: break;
        }
        if(req.equals("v")||req.equals("c")){
        request.getRequestDispatcher("/customer.jsp").forward(request, response);
        }
        else {
            request.setAttribute("topage", "customer");
            request.getRequestDispatcher("temp").forward(request, response);
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
