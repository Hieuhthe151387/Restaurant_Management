package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>Employees</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/employee.css\">\n");
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
      out.write("\t\t<div class=\"navigation\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"index.html\">\n");
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
      out.write("                    <form method=\"post\" name=\"femployee\" hidden></form>\n");
      out.write("\t\t\t<div class=\"details\">\n");
      out.write("\t\t\t\t<div class=\"recentOrders leftCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Nhân Viên</h2>\n");
      out.write("\t\t\t\t\t\t<div onclick=\"createemployee()\" class=\"btn\">Thêm</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"rightCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Employee Detail</h2>\n");
      out.write("\t\t\t\t\t\t<span class=\"close\" onclick=\"closeCard()\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <div class=\"empty ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"icon\"><i class=\"fa fa-archive\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"h2\">Choose one employee to see this one's info</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"session ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" name=\"employeedetails\">\n");
      out.write("            <div class=\"info\">\n");
      out.write("\t\t<div class=\"imgBx\">\n");
      out.write("\t\t\t<img src=\"images/user.png\" alt=\"user\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Id:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeview.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Họ và tên:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"name\" name=\"name\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeview.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t<label for=\"name\" id=\"name\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Biệt danh:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"sname\" name=\"sname\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeview.shortname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t<label for=\"sname\" id=\"sname\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Giới tính</span>\n");
      out.write("\t\t\t\t<select name=\"gender\" disabled>\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.gender?\"Nam\":\"Nữ\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" hidden>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.gender?\"Nam\":\"Nữ\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("\t\t\t\t\t<option value=\"male\">Nam</option>\n");
      out.write("\t\t\t\t\t<option value=\"female\">Nữ</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t\t<label for=\"gender\" id=\"gender\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Chức vụ:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"role\" name=\"role\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t<label for=\"role\" id=\"role\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Mức lương:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"salary\"  name=\"salary\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.salary/1000000}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" triệu\"/>\n");
      out.write("\t\t\t\t<label for=\"salary\" id=\"salary\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx \">\n");
      out.write("\t\t\t\t<span>Ngày sinh</span>\n");
      out.write("\t\t\t\t<input type=\"date\" id=\"dob\"  name=\"dob\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.getDoB()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t<label for=\"dob\" id=\"dob\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Số điện thoại</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"phonenum\" name=\"phonenum\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.phonenumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.getAddress(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address0\" id=\"address0\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Xã, thị trấn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address1\" name=\"address1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.getAddress(1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address1\" id=\"address1\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Quận,huyện</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address2\" name=\"address2\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.getAddress(2)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address2\" id=\"address2\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Tỉnh, thành phố</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"address3\" name=\"address3\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.getAddress(3)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("\t\t\t\t\t<label for=\"address0\" id=\"address3\" class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\t\t\t\n");
      out.write("\t</div>\t\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<button class=\"btnf\" id=\"update\" type=\"submit\" disabled>Update<span class=\"icon\"></span></button>\n");
      out.write("\t\t<button class=\"btnf\" id=\"delete\" type=\"submit\">Delete<span class=\"icon\"></span></button>\n");
      out.write("\t\t<button class=\"btnf\" id=\"cancel\" onclick=\"cancelupdate()\" disabled>Cancel<span class=\"icon\"></span></button>\n");
      out.write("\t</div>\t\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                            <div class=\"newemployee ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<header>\n");
      out.write("\t\t\t\t\t\t\t<h2>Create new employees</h2>\n");
      out.write("\t\t\t\t\t\t</header>\n");
      out.write("                                                <form name=\"addemployee\" method=\"post\">\n");
      out.write("\t<div class=\"info\">\n");
      out.write("\t\t<div class=\"imgBx\">\n");
      out.write("\t\t\t<img src=\"images/user.png\" alt=\"user\"/>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Id:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"nid\" readonly value=\"EM02\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Họ và tên:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"nname\" name=\"nname\" required placeholder=\"Tên đầy đủ\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Biệt danh:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"nsname\" name=\"nsname\" required placeholder=\"Tên hay gọi\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx short\">\n");
      out.write("\t\t\t\t<span>Giới tính</span>\n");
      out.write("\t\t\t\t<select name=\"ngender\">\n");
      out.write("\t\t\t\t\t<option value=\"male\">Nam</option>\n");
      out.write("\t\t\t\t\t<option value=\"female\">Nữ</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Chức vụ:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"nrole\" name=\"nrole\" required placeholder=\"Chức vụ\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Mức lương:</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"nsalary\"  name=\"nsalary\" required placeholder=\"10 triệu or 10 000 000\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx \">\n");
      out.write("\t\t\t\t<span>Ngày sinh</span>\n");
      out.write("\t\t\t\t<input type=\"date\" id=\"ndob\"  name=\"ndob\" required value=\"2000-01-20\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t<span>Số điện thoại</span>\n");
      out.write("\t\t\t\t<input type=\"text\" id=\"nphonenum\" name=\"nphonenum\" required placeholder=\"Phone number...\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"session\">\n");
      out.write("\t\t\t<div class=\"addressBx\">\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Thôn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"naddress0\" name=\"naddress0\" required placeholder=\"Thôn, làng (VD: Cống Khê)\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Xã, thị trấn</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"naddress1\" name=\"naddress1\" required placeholder=\"Xã,thị trấn\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Quận,huyện</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"naddress2\" name=\"naddress2\" required placeholder=\"Quận,huyện\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t<span>Tỉnh, thành phố</span>\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"naddress3\" name=\"naddress3\" required placeholder=\"tỉnh, thành\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t\t\t\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<button class=\"btnf\" id=\"create\" type=\"submit\">Create<span class=\"icon\"></span></button>\n");
      out.write("\t\t<button class=\"btnf\" id=\"cancel\" onclick=\"cancelcreate()\">Cancel<span class=\"icon\"></span></button>\n");
      out.write("\t</div>\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction toggleMenu(){\n");
      out.write("\t\t\tlet toggle = document.querySelector('.toggle');\n");
      out.write("\t\t\tlet navigation = document.querySelector('.navigation');\n");
      out.write("\t\t\tlet main = document.querySelector('.main');\n");
      out.write("\t\t\ttoggle.classList.toggle('active');\n");
      out.write("\t\t\tnavigation.classList.toggle('active');\n");
      out.write("\t\t\tmain.classList.toggle('active');\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// --------------------------------------------------------------------------\n");
      out.write("\t\tlet emdata=document.getElementsByClassName('emdata');\n");
      out.write("\t\tfor(let i = 0; i<emdata.length;i++){\n");
      out.write("\t\t\temdata[i].addEventListener('click',viewdetail);\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction viewdetail(){\n");
      out.write("\t\t\tcloseCard();\n");
      out.write("\t\t\tf.action=\"employee?req=v\";\n");
      out.write("                        f.submit();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction closeCard(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet close = document.querySelector('.close');\n");
      out.write("\t\t\tlet session = document.querySelector('.session');\n");
      out.write("\t\t\tlet empty = document.querySelector('.empty');\n");
      out.write("\t\t\tclose.classList.toggle('hidden');\n");
      out.write("\t\t\tsession.classList.toggle('hidden');\n");
      out.write("\t\t\tempty.classList.toggle('hidden');\n");
      out.write("\t\t}\n");
      out.write("\t\t// variable of employee page\n");
      out.write("\t\tlet updatef = document.getElementById('update');\n");
      out.write("\t\tlet cancelf = document.getElementById('cancel');\n");
      out.write("\t\tlet editspan = document.getElementsByClassName('icon');\n");
      out.write("\t\tfor(let i = 0; i<editspan.length;i++){\n");
      out.write("\t\t\teditspan[i].addEventListener('click',editemployee);\n");
      out.write("\t\t}\n");
      out.write("\t\tconst remeber=[];\n");
      out.write("\t\tlet checkedit = false;\n");
      out.write("\t\tfunction editemployee() {\n");
      out.write("\t\t\tlet element = document.getElementById(this.id);\n");
      out.write("\t\t\tif(this.id == 'gender'){\n");
      out.write("\t\t\t\telement = document.getElementsByTagName('select')[0];\n");
      out.write("\t\t\t\telement.removeAttribute('disabled');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telse{\n");
      out.write("\t\t\t\telement.removeAttribute('readonly');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tconsole.log('hadclick'+(remeber.length));\n");
      out.write("\t\t\tremeber[remeber.length] = element;\n");
      out.write("\t\t\tupdatef.removeAttribute('disabled');\n");
      out.write("\t\t\tcancelf.removeAttribute('disabled');\n");
      out.write("\t\t\tcheckedit=true;\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction cancelupdate(){\n");
      out.write("\t\t\tlet updatef = document.getElementById('update');\n");
      out.write("\t\t\tlet cancelf = document.getElementById('cancel');\n");
      out.write("\t\t\tfor(let i = 0; i<remeber.length;i++){\n");
      out.write("\t\t\t\tif(remeber.id=='gender'){\n");
      out.write("\t\t\t\t\tremeber.remoneAttribute('disabled');\n");
      out.write("\t\t\t\t} else{\n");
      out.write("\t\t\t\t\tremeber.remoneAttribute('readonly');\n");
      out.write("\t\t\t\t}\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tcheckedit=false;\n");
      out.write("\t\t\tdocument.employeedetails.reset();\n");
      out.write("\t\t\tupdatef.setAttribute('disabled',true);\n");
      out.write("\t\t\tcancelf.setAttribute('disabled',true);\n");
      out.write("\t\t}\n");
      out.write("\t\t// --------------------------------- js for add form-------------\n");
      out.write("\t\tfunction createemployee(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want redirect to create new employee\")){return;}\n");
      out.write("\t\t\t\telse cancelupdate();\n");
      out.write("\t\t\t}\n");
      out.write("                        let f = document.femployee;\n");
      out.write("                        f.action=\"create?req=c\";\n");
      out.write("                        f.submit();\n");
      out.write("//\t\t\tlet createpanel = document.querySelector('.newemployee');\n");
      out.write("//\t\t\tcreatepanel.classList.toggle('create');\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction cancelcreate(){\n");
      out.write("\t\t\tdocument.addemployee.reset();\n");
      out.write("\t\t\tlet createpanel = document.querySelector('.newemployee');\n");
      out.write("\t\t\tcreatepanel.classList.toggle('create');\n");
      out.write("\t\t\tconsole.log('canceled create!');\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
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
    _jspx_th_c_set_0.setVar("listemployee");
    _jspx_th_c_set_0.setScope("session");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listemployee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_1.setVar("employeeview");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.employeeview}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_2.setVar("employeecreate");
    _jspx_th_c_set_2.setScope("request");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.employeecreate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listemployee!=null&&listemployee.size()!=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("                                        \n");
        out.write("\t\t\t\t\t<table>\n");
        out.write("\t\t\t\t\t\t<thead>\n");
        out.write("\t\t\t\t\t\t\t<tr >\n");
        out.write("\t\t\t\t\t\t\t\t<td>STT</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Họ và tên</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Biệt danh</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Chức danh</td>\n");
        out.write("\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t</thead>\n");
        out.write("\t\t\t\t\t\t<tbody>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t\t</tbody>\n");
        out.write("\t\t\t\t\t</table>\n");
        out.write("                                        ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("employee");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listemployee}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <tr class=\"emdata\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.getID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>1</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.shortname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employee.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t</tr>\n");
          out.write("                                                    ");
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
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("hidden");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeecreate!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("create");
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
}
