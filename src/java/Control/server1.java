/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.DBconnect;
import Model.Account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class server1 extends HttpServlet {

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
            out.println("<title>Servlet server1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet server1 at " + request.getContextPath() + "</h1>");
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
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        if(account!=null) doPost(request, response);
        else{
            response.setContentType("text/html;charset=UTF-8");
            request.getRequestDispatcher("signin.jsp").forward(request, response);
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
        DBconnect db = new DBconnect();
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String check = request.getParameter("check");
        Account a = db.getAccount(account, password);
        if(a!=null){
            if (check!=null){
                Cookie cooky1,cooky2;
                cooky1 = new Cookie("acc", account);
                cooky2 = new Cookie("pass", password);
                cooky1.setMaxAge(24*3600);
                response.addCookie(cooky1);
                cooky2.setMaxAge(24*3600);
                response.addCookie(cooky2);
            }
            response.setContentType("text/html;charset=UTF-8");
            request.setAttribute("error", "Login successful!"+check);
            request.getSession().setAttribute("user", a);
        }else{
            response.setContentType("text/html;charset=UTF-8");
            request.setAttribute("error", "Login false!Check you account");
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        };
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
