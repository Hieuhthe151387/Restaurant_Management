package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/signin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        ");
 
            boolean logout = request.getParameter("logout")==null;
            if(request.getCookies().length>1&&logout){
                String account="",password="";
                for(Cookie c :request.getCookies()){
                    if(c.getName().equals("acc")){
                        account = c.getValue();
                        request.setAttribute("account", c.getValue());
                    }
                    if(c.getName().equals("pass")){
                        request.setAttribute("password", c.getValue());
                        password = c.getValue();
                    }
                }
                response.sendRedirect("login?account="+account+"&&password="+password);
            }
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"image\">\n");
      out.write("            <div>\n");
      out.write("                <h1>Cây đa quán</h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("                    <form action=\"login\" method=\"post\">\n");
      out.write("                   <div class=\"inputBox\">\n");
      out.write("                       <input type=\"text\" id=\"acc\" onchange=\"console.log(this.value)\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.account}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"account\" required title=\"nhập đúng tài khoản\">\n");
      out.write("                       <label for=\"acc\">Username</label>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"inputBox\">\n");
      out.write("                       <input type=\"password\" id=\"pass\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required title=\"nhập đúng mật khẩu\">\n");
      out.write("                       <label for=\"pass\">Password</label>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                   <div class=\"checkBox\">\n");
      out.write("                       <input type=\"checkbox\" name=\"check\" value=\"remember\"><span class=\"title\">Remember me.</span>\n");
      out.write("                   </div>\n");
      out.write("                   <input type=\"submit\" value=\"Login\">\n");
      out.write("               </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
