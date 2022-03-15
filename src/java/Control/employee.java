/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DBconnect;
import Model.Employee;
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
public class employee extends HttpServlet {

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
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet employee</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            
//            out.println("<h1>Servlet employee at " + request.getParameter("id")+
//        request.getParameter("name")+request.getParameter("sname")+" gender"+request.getParameter("gender")+request.getParameter("role") 
//        +request.getParameter("salary")+request.getParameter("dob")+request.getParameter("phonenum")
//        +request.getParameter("address0") 
//        +request.getParameter("address1")
//        +request.getParameter("address2")
//        +request.getParameter("address3") + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
          response.sendRedirect("employee");
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
        ArrayList<Employee> list = db.getListEmployees();
        request.getSession().setAttribute("listemployee", list);
        request.getRequestDispatcher("/employee.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Employee parseEmployee(HttpServletRequest request){
            Employee em = new Employee();
        try {
            request.setCharacterEncoding("UTF-8");
            em.setID(request.getParameter("id"));
            em.setName(request.getParameter("name"));
            em.setShortname(request.getParameter("sname"));
            em.setGender((request.getParameter("gender").equals("male")));
            em.setRole(request.getParameter("role"));
            em.setSalary(request.getParameter("salary"));
            em.setDob(request.getParameter("dob"));
            em.setPhoneNumber(request.getParameter("phonenum"));
            String a0 = request.getParameter("address0");
            String a1 = request.getParameter("address1");
            String a2 = request.getParameter("address2");
            String a3 = request.getParameter("address3");
            em.setAddress(a0+", "+a1+", "+a2+", "+a3);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        }
            return em;
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String req = request.getParameter("req");
        DBconnect db = new DBconnect();
        Employee em = new Employee();
        String id="",newid;
        if(req.equals("v")||req.equals("r")) {id=request.getParameter("id");}
        switch(req){
            case "v": em = db.getEmployeeById(id);
                      request.setAttribute("id", id);
                      request.setAttribute("employeeview", em);
                break;
            case "u": em = parseEmployee(request);
                      db.updateEmployee(em);
                      request.setAttribute("message", "updated");
//                      response.sendRedirect("employee");
                      processRequest(request, response);
                break;
//                remove an em 
            case "r":db.deleteEmployee(id);
                break;
//            request create new em
            case "c": newid = db.getNewId(1);
                      request.setAttribute("newId",newid);
                break;
//            request submit info of new em had been create
            case "s": em = parseEmployee(request);
                      db.addEmployee(em);
                      request.setAttribute("message", "added");
                break;
            default: break;
        }
        if(req.equals("v")||req.equals("c")){
        request.getRequestDispatcher("/employee.jsp").forward(request, response);
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
