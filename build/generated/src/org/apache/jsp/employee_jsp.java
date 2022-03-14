package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/home.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>Admin Dashboard</title>\n");
      out.write("<!--\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">-->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("         ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("             ");

                 request.setAttribute("error", "Access denied! Please login!");
                 response.sendRedirect(request.getContextPath()+"/login");
             
          out.write("\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navigation\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"home.jsp\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-cutlery\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t<h2>Cây đa quán</h2>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tDashboard\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-th-large\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tMenu\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-book\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tOrders\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-bar-chart\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tAnalysis\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tEmployee\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tCustomer\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tLogout\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("   \t\t<div class=\"main\">\n");
      out.write("   \t\t\t<div class=\"topbar\">\n");
      out.write("   \t\t\t\t<div class=\"toggle\"onclick=\"toggleMenu();\">\n");
      out.write("   \t\t\t\t</div>\n");
      out.write("   \t\t\t\t<div class=\"search\">\n");
      out.write("   \t\t\t\t\t<label>\n");
      out.write("   \t\t\t\t\t\t<i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("   \t\t\t\t\t\t<input type=\"text\"\n");
      out.write("   \t\t\t\t\t\tplaceholder=\"Search here!\" name=\"\">\n");
      out.write("   \t\t\t\t\t</lable>\n");
      out.write("   \t\t\t\t</div>\n");
      out.write("   \t\t\t\t<div class=\"user\">\n");
      out.write("   \t\t\t\t\t<img src=\"images/user.png\" alt=\"user\">\n");
      out.write("   \t\t\t\t</div>\n");
      out.write("   \t\t\t</div>\n");
      out.write("   \t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction toggleMenu(){\n");
      out.write("\t\t\tlet toggle = document.querySelector('.toggle');\n");
      out.write("\t\t\tlet navigation = document.querySelector('.navigation');\n");
      out.write("\t\t\tlet main = document.querySelector('.main');\n");
      out.write("\t\t\ttoggle.classList.toggle('active');\n");
      out.write("\t\t\tnavigation.classList.toggle('active');\n");
      out.write("\t\t\tmain.classList.toggle('active')\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
