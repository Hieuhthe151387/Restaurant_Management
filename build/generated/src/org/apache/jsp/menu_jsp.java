package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Admin Dashboard</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/menu.css\">\n");
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
      out.write("        ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navigation\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"home\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\">\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-cutlery\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\t<h2>Cây đa quán</h2>\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"home\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tDashboard\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"menu\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-th-large\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tMenu\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"order\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-book\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tOrders\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"employee\">\n");
      out.write("\t\t\t\t\t<span class=\"icon\"><i class=\"fa fa-users\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t<span class=\"title\">\n");
      out.write("\t\t\t\t\t\tEmployee\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("                                    <a href=\"customer\">\n");
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
      out.write("            <form name=\"formfood\" hidden></form>\n");
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
      out.write("\t\t\t<div class=\"details\">\n");
      out.write("\t\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t\t<div class=\"menuHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Menu</h2>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"rightCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Top 10 most ordered items</h2>\n");
      out.write("                                                <p>This month</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div class=\"imgBx\"><img src=\"images/foods.png\"></div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><h4>Lẩu cay</h4><span>250k VNĐ</span></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div class=\"imgBx\"><img src=\"images/foods.png\"></div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><h4>Xôi mẹt</h4><span>100k VNĐ</span></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div class=\"imgBx\"><img src=\"images/foods.png\"></div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><h4>Gà nướng</h4><span>250k VNĐ</span></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div class=\"imgBx\"><img src=\"images/foods.png\"></div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><h4>Canh cá</h4><span>30k VNĐ</span></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><div class=\"imgBx\"><img src=\"images/foods.png\"></div></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><h4>Canh chua</h4><span>30k VNĐ</span></td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            <div class=\"tag createTag ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t<h2>Add new food</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"details\">\t\t\t\n");
      out.write("                                                <form method=\"post\" action=\"menu\">\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">ID</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"id\" id=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Name</span>\n");
      out.write("                                                        <input type=\"text\" name=\"name\" id=\"name\" required/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Price</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"price\" id=\"price\" required/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Cost</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"cost\" id=\"cost\" required/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Quantity</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"number\" name=\"quantity\" id=\"quantity\" required/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"footer\">\n");
      out.write("                                                    <input type=\"hidden\" name=\"req\" value=\"s\"/>\n");
      out.write("   \t\t\t\t\t\t\t<button class=\"btn\" id=\"create\" >Create</button>\n");
      out.write("  \t\t\t\t\t\t\t <button class=\"btn\" id=\"cancel\" type=\"button\" onclick=\"cancelcreate()\">Cancel</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("   \t\t\t</div>\n");
      out.write("                            <div class=\"tag update updateTag ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t<h2>Food infomation</h2>\n");
      out.write("\t\t\t\t\t<span class=\"close\" onclick=\"closeCard()\">X</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"details\">\n");
      out.write("                                    <form name=\"foodedit\" action=\"menu\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">ID</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"id\" id=\"eid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${foodview.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Name</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" id=\"ename\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${foodview.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly />\n");
      out.write("\t\t\t\t\t\t\t<label for=\"price\" id=\"ename\" class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Price</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"price\" id=\"eprice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${foodview.getprice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  readonly />\n");
      out.write("\t\t\t\t\t\t\t<label for=\"price\" id=\"eprice\" class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Cost</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"cost\" id=\"ecost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${foodview.getcost()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly />\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cost\" id=\"ecost\" class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"inputBx\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"title\">Quantity</span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"number\" name=\"quan\" id=\"ecost\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${foodview.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly />\n");
      out.write("\t\t\t\t\t\t\t<label for=\"cost\" id=\"ecost\" class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>        \n");
      out.write("\t\t\t\t\t\t<div class=\"footer\">\n");
      out.write("                                                    <input type=\"hidden\" name=\"req\" value=\"u\"/>\n");
      out.write("<button class=\"btn\" id=\"updatef\" disabled>Update</button>\n");
      out.write("<button class=\"btn\" id=\"deletef\" type=\"button\" onclick=\"delfood('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.viewId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("')\" >Delete</button>\n");
      out.write("<button class=\"btn\" id=\"cancelf\" type=\"button\" onclick=\"cancelupdate()\" disabled>Cancel</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      out.write("\t\t// menu\n");
      out.write("\t\tlet viewdata=document.getElementsByClassName('viewdata');\n");
      out.write("\t\tfor(let i = 0; i<viewdata.length;i++){\n");
      out.write("\t\t\tviewdata[i].addEventListener('click',viewdetail);\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction viewdetail(){\n");
      out.write("\t\t\tcloseCard();\n");
      out.write("                        console.log(\"non direct!\"+this.id);\n");
      out.write("\t\t\tlet foodform = document.formfood;\n");
      out.write("\t\t\tfoodform.action=\"menu?req=v&id=\"+this.id;\n");
      out.write("                        foodform.submit();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction closeCard(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet close = document.querySelector('.close');\n");
      out.write("\t\t\tlet session = document.querySelector('.updateTag');\n");
      out.write("\t\t\tclose.classList.toggle('hidden');\n");
      out.write("\t\t\tsession.classList.toggle('hidden');\n");
      out.write("\t\t}\n");
      out.write("\t\t// ?\n");
      out.write("\t\tlet updatef = document.getElementById('updatef');\n");
      out.write("\t\tlet cancelf = document.getElementById('cancelf');\n");
      out.write("\t\tlet editspan = document.getElementsByClassName('icon');\n");
      out.write("\t\tfor(let i = 0; i<editspan.length;i++){\n");
      out.write("\t\t\teditspan[i].addEventListener('click',editlabel);\n");
      out.write("\t\t}\n");
      out.write("\t\tconst remeber=[];\n");
      out.write("\t\tlet checkedit = false;\n");
      out.write("\t\tfunction editlabel() {\n");
      out.write("\t\t\tconsole.log('had click to edit!');\n");
      out.write("\t\t\tlet element = document.getElementById(this.id);\n");
      out.write("\t\t\telement.removeAttribute('readonly');\n");
      out.write("\t\t\tconsole.log('hadclick'+(remeber.length));\n");
      out.write("\t\t\tremeber[remeber.length] = element;\n");
      out.write("\t\t\tupdatef.removeAttribute('disabled');\n");
      out.write("\t\t\tcancelf.removeAttribute('disabled');\n");
      out.write("\t\t\tcheckedit=true;\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction cancelupdate(){\n");
      out.write("\t\t\tlet updatef = document.getElementById('updatef');\n");
      out.write("\t\t\tlet cancelf = document.getElementById('cancelf');\n");
      out.write("\t\t\tfor(let i = 0; i<remeber.length;i++){\n");
      out.write("\t\t\t\t\tremeber[i].setAttribute('readonly',true);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tcheckedit=false;\n");
      out.write("\t\t\tdocument.foodedit.reset();\n");
      out.write("\t\t\tupdatef.setAttribute('disabled',true);\n");
      out.write("\t\t\tcancelf.setAttribute('disabled',true);\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction createfood(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet foodform = document.formfood;\n");
      out.write("\t\t\tfoodform.action = \"menu?req=c\";\n");
      out.write("\t\t\tfoodform.submit();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction cancelcreate(){\n");
      out.write("\t\t\tlet cancelf = document.getElementById('cancelc');\n");
      out.write("\t\t\tlet createTag = document.querySelector('.createTag');\n");
      out.write("\t\t\tcreateTag.classList.toggle('create');\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction delfood(id){\n");
      out.write("\t\t\tif(!confirm(\"Thao tác này sẽ gây mất dữ liệu và không thể khôi phục lại. Bạn có muốn tiếp tục xoá bản ghi này?\")) return;\n");
      out.write("\t\t\tlet foodform = document.formfood;\n");
      out.write("\t\t\tfoodform.action = \"menu?req=r&id=\"+id;\n");
      out.write("\t\t\tfoodform.submit();\n");
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
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.foodview}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setVar("foodview");
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
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listproduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("session");
    _jspx_th_c_set_1.setVar("listproduct");
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
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.asidelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_2.setScope("request");
    _jspx_th_c_set_2.setVar("asidelist");
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_3.setScope("request");
    _jspx_th_c_set_3.setVar("newId");
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<table>\n");
        out.write("\t\t\t\t\t\t<thead>\n");
        out.write("\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t<td>STT</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Food image</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Name</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Price</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Cost</td>\n");
        out.write("\t\t\t\t\t\t\t</tr>\n");
        out.write("\t\t\t\t\t\t</thead>\n");
        out.write("\t\t\t\t\t\t<tbody>\n");
        out.write("                                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\t\t\t\t\t\t\t\t\t\n");
        out.write("\t\t\t\t\t\t</tbody>\n");
        out.write("\t\t\t\t\t</table>\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"create\" onclick=\"createfood()\">New food +</div>\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct.size()-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<tr class=\"viewdata\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct.get(i).id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td><div class=\"imageBx\"><img src=\"images/foods.png\" alt=\"foods\"/></div></td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct.get(i).name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct.get(i).price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listproduct.get(i).cost}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_0);
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${newId!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("create");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${foodview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
}
