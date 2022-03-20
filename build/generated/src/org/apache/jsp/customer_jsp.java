package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>Customer</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/employee.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/customer.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navigation active\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"home.jsp\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-cutlery\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t<h2>Cây đa quán</h2>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"Home.jsp\">\n");
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
      out.write("\t\t\t\t\t<a href=\"employee\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tEmployee\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"customer\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tCustomer\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"signin.jsp?logout=out\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tLogout\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("   \t\t<div class=\"main active\">\n");
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
      out.write("                    <form method=\"post\" name=\"fcust\" hidden></form>\n");
      out.write("\t\t\t<div class=\"details\">\n");
      out.write("\t\t\t\t<div class=\"recentOrders leftCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Khách hàng</h2>\n");
      out.write("                                                 ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"rightCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Thông tin khách hàng</h2>\n");
      out.write("\t\t\t\t\t\t<span class=\"close ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\" onclick=\"closeCard()\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"empty ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"icon\"><i class=\"fa fa-archive\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"h2\">Chọn một khách hàng để xem chi tiết</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"session ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                                     <form method=\"post\" action=\"customer\" name=\"custdetails\">\n");
      out.write("\t<div class=\"info\">\n");
      out.write("\t\t<div class=\"imgBx\">\n");
      out.write("\t\t\t<img src=\"images/user.png\" alt=\"user\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Id:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Họ và tên:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\" name=\"name\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \"/>\n");
      out.write("\t\t\t\t<label for=\"name\" id=\"name\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Giới tính</span>\n");
      out.write("\t\t\t\t<select name=\"gender\" disabled>\n");
      out.write("                                    <option hidden value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.gender?\"male\":\"female\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.gender?\"Nam\":\"Nữ\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("\t\t\t\t\t<option value=\"male\">Nam</option>\n");
      out.write("\t\t\t\t\t<option value=\"female\">Nữ</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<label for=\"gender\" id=\"gender\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Số đơn đặt hàng</span>\n");
      out.write("\t\t\t\t<input type=\"number\" id=\"ordernum\"  name=\"ordernum\" readonly value=\"10\"/>\n");
      out.write("                                <label for=\"ordernum\" id=\"gender\" class=\"addorder\" onclick=\"console.log('you have direct!')\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx \">\n");
      out.write("\t\t\t\t<span>Tuổi</span>\n");
      out.write("\t\t\t\t<input type=\"number\" id=\"age\"  name=\"age\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.getAge()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t<label for=\"age\" id=\"age\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Số điện thoại</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"phonenum\" name=\"phonenum\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t<label for=\"phonenum\" id=\"phonenum\" class=\"icon\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"session\">\n");
      out.write("\t\t\t<div class=\"addressBx\">\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Thôn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address0\" name=\"address0\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.getAddress(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address0\" id=\"address0\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Xã, thị trấn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address1\" name=\"address1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.getAddress(1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address1\" id=\"address1\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Quận,huyện</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address2\" name=\"address2\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.getAddress(2)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address2\" id=\"address2\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Tỉnh, thành phố</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address3\" name=\"address3\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview.getAddress(3)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address3\" id=\"address3\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\t\t\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("                <input type=\"hidden\" name=\"req\" id=\"req\" value=\"u\"/>\n");
      out.write("                <input type=\"submit\" value=\"Update\" class=\"btnf\" disabled id=\"updatec\"/>\n");
      out.write("                <button class=\"btnf\" id=\"delete\" type=\"button\" onclick=\"deletecust('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\">Delete</button>\n");
      out.write("                <button class=\"btnf\" id=\"cancelc\" type=\"button\" onclick=\"cancelupdate()\" disabled>Cancel</button>\n");
      out.write("\t</div>\t\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"newcust ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>Thêm khách hàng</h2>\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("                                                <form name=\"addcust\" action=\"customer\" method=\"post\">\n");
      out.write("\t<div class=\"info\">\n");
      out.write("\t\t<div class=\"imgBx\">\n");
      out.write("\t\t\t<img src=\"images/user.png\" alt=\"user\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Id:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Họ và tên:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\" name=\"name\" required placeholder=\"Tên đầy đủ\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Giới tính</span>\n");
      out.write("\t\t\t\t<select name=\"gender\">\n");
      out.write("\t\t\t\t\t<option value=\"male\">Nam</option>\n");
      out.write("\t\t\t\t\t<option value=\"female\">Nữ</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Tuổi</span>\n");
      out.write("\t\t\t\t<input type=\"number\" id=\"age\" name=\"age\" required placeholder=\"18,19,..\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Số điện thoại</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"phonenum\" name=\"phonenum\" required placeholder=\"Phone number...\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--<div class=\"session\">-->\n");
      out.write("\t\t\t<div class=\"addressBx\">\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Thôn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address0\" name=\"address0\" required placeholder=\"Thôn, làng (VD: Cống Khê)\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Xã, thị trấn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address1\" name=\"address1\" required placeholder=\"Xã,thị trấn\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Quận,huyện</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address2\" name=\"address2\" required placeholder=\"Quận,huyện\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Tỉnh, thành phố</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address3\" name=\"address3\" required placeholder=\"tỉnh, thành\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<!--</div>-->\t\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("                <input type=\"hidden\" name=\"req\" value=\"s\"/>\n");
      out.write("\t\t<button class=\"btnf\" id=\"create\" type=\"submit\">Create</button>\n");
      out.write("\t\t<button class=\"btnf\" id=\"cancel\" onclick=\"cancelcreate()\">Cancel<span class=\"icon\"></span></button>\n");
      out.write("\t</div>\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        function toggleMenu(){\n");
      out.write("\t\t\tlet toggle = document.querySelector('.toggle');\n");
      out.write("\t\t\tlet navigation = document.querySelector('.navigation');\n");
      out.write("\t\t\tlet main = document.querySelector('.main');\n");
      out.write("\t\t\ttoggle.classList.toggle('active');\n");
      out.write("\t\t\tnavigation.classList.toggle('active');\n");
      out.write("\t\t\tmain.classList.toggle('active');\n");
      out.write("\t\t}\n");
      out.write("        \n");
      out.write("        let viewdata=document.getElementsByClassName('viewdata');\n");
      out.write("\t\tfor(let i = 0; i<viewdata.length;i++){\n");
      out.write("\t\t\tviewdata[i].addEventListener('click',viewdetail);\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction viewdetail(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return false;\n");
      out.write("\t\t\t}\n");
      out.write("                        let f = document.fcust;\n");
      out.write("\t\t\tf.action=\"customer?req=v&id=\"+this.id;\n");
      out.write("                        f.submit();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction closeCard(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet close = document.querySelector('.close');\n");
      out.write("\t\t\tlet session = document.querySelector('.session');\n");
      out.write("\t\t\tlet empty = document.querySelector('.empty');\n");
      out.write("\t\t\tclose.classList.toggle('hidden');\n");
      out.write("\t\t\tsession.classList.toggle('hidden');\n");
      out.write("\t\t\tempty.classList.toggle('hidden');\n");
      out.write("\t\t}\n");
      out.write("\t\t// variable of employee page\n");
      out.write("\t\tlet updatef = document.getElementById('updatec');\n");
      out.write("\t\tlet cancelf = document.getElementById('cancelc');\n");
      out.write("\t\tlet editspan = document.getElementsByClassName('icon');\n");
      out.write("\t\tfor(let i = 0; i<editspan.length;i++){\n");
      out.write("\t\t\teditspan[i].addEventListener('click',editdata);\n");
      out.write("\t\t}\n");
      out.write("\t\tconst remeber=[];\n");
      out.write("\t\tlet checkedit = false;\n");
      out.write("\t\tfunction editdata() {\n");
      out.write("\t\t\tlet element = document.getElementById(this.id);\n");
      out.write("\t\t\te = document.getElementsByTagName('select')[0];\n");
      out.write("                        e.removeAttribute('disabled');\n");
      out.write("\t\t\telement.removeAttribute('readonly');\n");
      out.write("\t\t\tconsole.log('hadclick'+(remeber.length));\n");
      out.write("\t\t\tremeber[remeber.length] = element;\n");
      out.write("\t\t\tupdatef.removeAttribute('disabled');\n");
      out.write("\t\t\tcancelf.removeAttribute('disabled');\n");
      out.write("\t\t\tcheckedit=true;\n");
      out.write("\t\t};\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        function deletecust(id){\n");
      out.write("                    if(confirm(\"Bạn muốn tiếp tục xoá bản ghi này? Thao tác này có thế gây mất dữ liệu!\")){\n");
      out.write("                    let f = document.fcust;\n");
      out.write("                    f.action=\"customer?req=r&id=\"+id;\n");
      out.write("                    f.submit();\n");
      out.write("                }\n");
      out.write("                };\n");
      out.write("\tfunction cancelupdate(){\n");
      out.write("            let updatef = document.getElementById('updatec');\n");
      out.write("            let cancelf = document.getElementById('cancelc');\n");
      out.write("            for(let i = 0; i<remeber.length;i++){\n");
      out.write("            if(remeber[i].id==='gender'){\n");
      out.write("\t\tremeber[i].setAttribute('disabled',true);\n");
      out.write("            } else{\n");
      out.write("\t\tremeber[i].setAttribute('readonly',true);\n");
      out.write("            }\t\n");
      out.write("            }\n");
      out.write("            document.custdetails.reset();\n");
      out.write("            updatef.setAttribute('disabled',true);\n");
      out.write("            cancelf.setAttribute('disabled',true);\n");
      out.write("\t}\n");
      out.write("        function cancelcreate(){\n");
      out.write("            document.addcust.reset();\n");
      out.write("            let createpanel = document.querySelector('.newcust');\n");
      out.write("            createpanel.classList.toggle('create');\n");
      out.write("            console.log('canceled create!');\n");
      out.write("\t}\n");
      out.write("        function createcust(){\n");
      out.write("        if (checkedit) {\n");
      out.write("\t\tif(!confirm(\"Some changed in updating form with be discard? You want redirect to create new employee\")){return;}\n");
      out.write("\t\telse cancelupdate();\n");
      out.write("\t}\n");
      out.write("        console.log('click here');\n");
      out.write("        let fcust = document.fcust;\n");
      out.write("        fcust.action=\"customer?req=c\";\n");
      out.write("        fcust.submit();\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("custview");
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.custview}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("newId");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.newId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("listcust");
    _jspx_th_c_set_2.setScope("request");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listcust}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div onclick=\"createcust()\" class=\"btn\">Thêm</div>");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust!=null&&listcust.size()!=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <table>\n");
        out.write("\t\t\t\t\t\t<thead>\n");
        out.write("\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t<td>STT</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Họ và tên</td>\n");
        out.write("\t\t\t\t\t\t\t\t<!--<td>Giới tính</td>-->\n");
        out.write("\t\t\t\t\t\t\t\t<td>Số điện thoại</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Địa chỉ</br>(thôn,làng)</td>\n");
        out.write("\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t</thead>\n");
        out.write("\t\t\t\t\t\t<tbody>\n");
        out.write("                                                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</tbody>\n");
        out.write("\t\t\t\t\t</table>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust.size()}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <tr class=\"viewdata\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust.get(i-1).ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust.get(i-1).name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                                ");
          out.write("\n");
          out.write("                                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust.get(i-1).phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust.get(i-1).getAddress(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("hidden");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("hidden");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("hidden");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newId!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("create");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
