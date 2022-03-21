package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\t<title>Order</title>\n");
      out.write("        <link href=\"css/order.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/order.css\">-->\n");
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
      out.write("        ");
      if (_jspx_meth_c_set_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navigation\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"home\">\n");
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
      out.write("    <form name=\"orderform\" hidden></form>\n");
      out.write("    <div class=\"main\">\n");
      out.write("   \t<div class=\"topbar\">\n");
      out.write("            <div class=\"toggle\"onclick=\"toggleMenu();\">\n");
      out.write("            </div>\n");
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
      out.write("\t\t\t\t<div class=\"leftCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Danh sách đơn hàng</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"btn\" onclick=\"addorder()\">Thêm</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"rightCard\">\n");
      out.write("\t\t\t\t\t<div class=\"cardHeader\">\n");
      out.write("\t\t\t\t\t\t<h2>Thông tin hoá đơn</h2>\n");
      out.write("\t\t\t\t\t\t<span class=\"close ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\" onclick=\"closeCard()\"><i class=\"fa fa-times\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"empty ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"icon\"><i class=\"fa fa-archive\" aria-hidden=\"true\"></i></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"h2\">Chọn một Hoá đơn để xem chi tiết</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <div class=\"session ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("            </div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\t<script>\n");
      out.write("// \t\tintial global \n");
      out.write("\t\tlet updatef = document.getElementById('update');\n");
      out.write("\t\tlet cancelf = document.getElementById('cancel');\n");
      out.write("\t\tlet setf = document.getElementById('set');\n");
      out.write("\t\tlet editspan = document.getElementsByClassName('icon');\n");
      out.write("\t\tlet remeber=[];\n");
      out.write("\t\tlet checkedit = false;\n");
      out.write("\t\tlet change = false;\n");
      out.write("\t\tlet changep=false;\n");
      out.write("\n");
      out.write("\t\tfunction toggleMenu(){\n");
      out.write("\t\t\tlet toggle = document.querySelector('.toggle');\n");
      out.write("\t\t\tlet navigation = document.querySelector('.navigation');\n");
      out.write("\t\t\tlet main = document.querySelector('.main');\n");
      out.write("\t\t\ttoggle.classList.toggle('active');\n");
      out.write("\t\t\tnavigation.classList.toggle('active');\n");
      out.write("\t\t\tmain.classList.toggle('active');\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("// --------------------------------------------------------------------------\n");
      out.write("\t\tlet orderdata=document.getElementsByClassName('orderdata');\n");
      out.write("\t\tfor(let i = 0; i<orderdata.length;i++){\n");
      out.write("\t\t\torderdata[i].addEventListener('click',viewdetail);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction viewdetail(){\n");
      out.write("\t\t\tlet oform = document.orderform;\n");
      out.write("\t\t\toform.action=\"order?req=v&&oid=\"+this.id;\n");
      out.write("\t\t\toform.method = \"post\";\n");
      out.write("                        oform.submit();\n");
      out.write("\t\t}\n");
      out.write("                function changestatus(){\n");
      out.write("\t\t\tchange=true;\n");
      out.write("\t\t\tcancelf.removeAttribute('disabled');\n");
      out.write("\t\t\tsetf.removeAttribute('disabled');\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction addfood(){\n");
      out.write("\t\t\tlet oform = document.orderform;\n");
      out.write("\t\t\tif (checkedit||change) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\toform.action = \"createorder.jsp?req=addf\";\n");
      out.write("                        oform.method=\"get\";\n");
      out.write("\t\t\t// orderform.submit();\n");
      out.write("\t\t\tconsole.log('you have been clicked off from this page2!');\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction addorder(){\n");
      out.write("\t\t\tlet oform = document.orderform;\n");
      out.write("\t\t\tif (checkedit||change) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("                        oform.action = \"createorder.jsp?req=addo\";\n");
      out.write("                        oform.method=\"get\";\n");
      out.write("\t\t\t// orderform.submit();\n");
      out.write("\t\t\tconsole.log('you have been clicked off from this page1!');\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction closeCard(){\n");
      out.write("\t\t\tif (checkedit||change) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet close = document.querySelector('.close');\n");
      out.write("\t\t\tlet session = document.querySelector('.session');\n");
      out.write("\t\t\tlet empty = document.querySelector('.empty');\n");
      out.write("\t\t\tchange=checkedit=false;\n");
      out.write("\t\t\tclose.classList.toggle('hidden');\n");
      out.write("\t\t\tsession.classList.toggle('hidden');\n");
      out.write("\t\t\tempty.classList.toggle('hidden');\n");
      out.write("\t\t}\n");
      out.write("\t\t// change cust\n");
      out.write("\t\tfunction changecust(){\n");
      out.write("\t\t\tlet name = document.getElementById('custname');\n");
      out.write("\t\t\tconsole.log(name.options[name.selectedIndex+1].value);\n");
      out.write("\t\t\tlet phonenum = document.getElementById('phonenum');\n");
      out.write("\t\t\tlet a=[];\n");
      out.write("\t\t\tfor(let j =0;j<4;j++){\n");
      out.write("\t\t\t\ta[j]=document.getElementById('address'+j);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet s = name.options[name.selectedIndex+1].value.split(',');\n");
      out.write("\t\t\tphonenum.value = s[0];\n");
      out.write("\t\t\tfor(let z = 1; z<s.length;z++){\n");
      out.write("\t\t\t\ta[z-1].value=s[z].trim();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction setstatus(){\n");
      out.write("\t\t\tif (checkedit) {\n");
      out.write("\t\t\t\tif(!confirm(\"Some changed in updating form with be discard? You want to close this card!\")) return;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tlet status = document.getElementById('status');\n");
      out.write("\t\t\tlet oform = document.orderform;// get hidden form\n");
      out.write("\t\t\tlet oid = document.getElementById('orderid').value;\n");
      out.write("\t\t\toform.action =\"order?req=st&oid=\"+oid+\"&st=\"+status.value;\n");
      out.write("                        oform.method=\"post\";\n");
      out.write("\t\t\tconsole.log('you have setstatus');\n");
      out.write("\t\t\tconsole.log(oform.action);\n");
      out.write("\t\t\toform.submit();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction deleteorder(){\n");
      out.write("\t\t\tif(!confirm('Thao tác này sẽ gây mât dữ liệu! Bạn muốn tiếp tục xoá bản ghi này không ?')) return;\n");
      out.write("\t\t\tlet oform = document.orderform;// get hidden form\n");
      out.write("\t\t\tlet oid = document.getElementById('orderid').value;\n");
      out.write("\t\t\toform.action=\"order?req=r&&oid=\"+oid;\n");
      out.write("                        oform.method=\"post\";\n");
      out.write("\t\t\toform.submit();\n");
      out.write("\t\t}\n");
      out.write("\t\tfor(let i = 0; i<editspan.length;i++){\n");
      out.write("\t\t\teditspan[i].addEventListener('click',editorder);\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction editorder() {\n");
      out.write("\t\t\tlet element = document.getElementById(this.id);\n");
      out.write("\t\t\tlet select = document.getElementsByTagName('select');\n");
      out.write("\t\t\tfor(let i = 0 ;i<select.length;i++){\n");
      out.write("\t\t\t\tselect[i].removeAttribute('disabled');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\telement.removeAttribute('readonly');\n");
      out.write("\t\t\tconsole.log('hadclick'+(remeber.length));\n");
      out.write("\t\t\tremeber[remeber.length] = element;\n");
      out.write("\t\t\tupdatef.removeAttribute('disabled');\n");
      out.write("\t\t\tcancelf.removeAttribute('disabled');\n");
      out.write("\t\t\tcheckedit=true;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction changepos(){\n");
      out.write("\t\t\tchangep=true;\n");
      out.write("\t\t\tlet pos = document.getElementById('position');\n");
      out.write("\t\t\tlet btn = document.querySelector('.before');\n");
      out.write("\t\t\tlet abox = document.querySelector('.addressBx');\n");
      out.write("\t\t\tlet ibox = document.querySelector('.infor');\n");
      out.write("\t\t\tconsole.log(pos.value+change);\n");
      out.write("\t\t\t// ibox.classList.toggle('hidden');\t\n");
      out.write("\t\t\tif(pos.value===1){\n");
      out.write("\t\t\t\tibox.classList.add('hidden');\n");
      out.write("\t\t\t\tabox.classList.remove('hidden');\n");
      out.write("\t\t\t\tabox.classList.add('show');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(pos.value!==1){\n");
      out.write("\t\t\t\tabox.classList.remove('show');\n");
      out.write("\t\t\t\tabox.classList.add('hidden');\n");
      out.write("\t\t\t\tibox.classList.remove('hidden');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction showaddress(){\n");
      out.write("\t\t\tlet btn = document.querySelector('.before');\n");
      out.write("\t\t\tlet abox = document.querySelector('.addressBx');\n");
      out.write("\t\t\tlet ibox = document.querySelector('.infor');\n");
      out.write("\t\t\tabox.classList.toggle('show');\n");
      out.write("\t\t\tibox.classList.toggle('hidden');\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction updateorder(){\n");
      out.write("\t\t\tlet updateform = document.orderdetails;\n");
      out.write("\t\t\tconsole.log(\"you\\'re done.\");\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction cancelupdate(){\n");
      out.write("\t\t\tconsole.log('here');\n");
      out.write("\t\t\tlet updatef = document.getElementById('update');\n");
      out.write("\t\t\tlet cancelf = document.getElementById('cancel');\n");
      out.write("\t\t\tlet select = document.getElementsByTagName('select');\n");
      out.write("\t\t\tfor(let i = 0 ;i<select.length;i++){\n");
      out.write("\t\t\t\tselect[i].removeAttribute('disabled');\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tfor(let i = 0; i<remeber.length;i++){\n");
      out.write("\t\t\t\t\tremeber[i].setAttribute('readonly',true);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tdocument.orderdetails.reset();\n");
      out.write("\t\t\tif(changep===true) changepos();//rest class address and infor of rtag\n");
      out.write("\t\t\tchangep = false;\n");
      out.write("\t\t\tcheckedit=false;\n");
      out.write("\t\t\tupdatef.setAttribute('disabled',true);\n");
      out.write("\t\t\tcancelf.setAttribute('disabled',true);\n");
      out.write("\t\t\tsetf.setAttribute('disabled',true);\n");
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
    _jspx_th_c_set_0.setVar("orderview");
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.orderview}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_1.setVar("custorder");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.custorder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_2.setScope("session");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listcust}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_set_3.setVar("listorder");
    _jspx_th_c_set_3.setScope("session");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.listorder}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_set_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent(null);
    _jspx_th_c_set_4.setVar("newid");
    _jspx_th_c_set_4.setScope("session");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.newid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.size()>0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t<table>\n");
        out.write("\t\t\t\t\t\t<thead>\n");
        out.write("\t\t\t\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t\t\t\t<td>STT</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Khách hàng</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Nhân viên</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Ngày</td>\n");
        out.write("\t\t\t\t\t\t\t\t<td>Trạng thái</td>\n");
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
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("i");
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.size()-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <tr class=\"orderdata\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.get(i).id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.get(i).getCustName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.get(i).getEmName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.get(i).date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t<td><span class=\"status ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.get(i).getClassStatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listorder.get(i).getstatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></td>\n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t\t\t\t\t<form method=\"post\" action=\"order\" name=\"orderdetails\">\n");
        out.write("<div class=\"content\">\n");
        out.write("\t\t<div class=\"header\">\n");
        out.write("\t\t\t<input type=\"text\" id=\"emid\" name=\"emid\" readonly value=\"EM02\" hidden />\n");
        out.write("\t\t\t<div class=\"inputBx short\">\n");
        out.write("\t\t\t\t<span>Order Id:</span>\n");
        out.write("\t\t\t\t<input type=\"text\" name=\"orderid\" id=\"orderid\" readonly value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t<span>Họ và tên:</span>\n");
        out.write("\t\t\t\t<select name=\"name\" id=\"custname\" onchange=\"changecust()\" disabled />\n");
        out.write("                                <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custorder.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custorder.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t</select>\n");
        out.write("\t\t\t\t<!-- <input type=\"text\" id=\"name\" name=\"name\" readonly value=\"Hoàng \"/> -->\n");
        out.write("\t\t\t\t<label for=\"name\" id=\"name\" class=\"icon\">\n");
        out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
        out.write("\t\t\t\t</label>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t<span>Số điện thoại</span>\n");
        out.write("\t\t\t\t<input type=\"text\" id=\"phonenum\" name=\"phonenum\" readonly value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${custorder.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"inputBx short\" onchange=\"changepos()\">\n");
        out.write("\t\t\t\t<span>Đơn hàng</span>\n");
        out.write("\t\t\t\t<select name=\"position\" id=\"position\" disabled>\n");
        out.write("                                    <option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.gettype()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("\t\t\t\t\t<option value=\"0\">Tại quán</option>\n");
        out.write("\t\t\t\t\t<option value=\"1\">Ship</option>\n");
        out.write("\t\t\t\t</select>\n");
        out.write("\t\t\t\t<label for=\"position\" id=\"position\" class=\"icon\">\n");
        out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
        out.write("\t\t\t\t</label>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"inputBx \">\n");
        out.write("\t\t\t\t<span>Ngày</span>\n");
        out.write("\t\t\t\t<input type=\"date\" id=\"dateorder\"  name=\"dateorder\" readonly value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("\t\t\t\t<label for=\"dateorder\" id=\"dateorder\" class=\"icon\">\n");
        out.write("\t\t\t\t\t<i class=\"fa fa-pencil-square-o\" aria-hidden=\"true\"></i>\n");
        out.write("\t\t\t\t</label>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t\t<span>Status</span>\n");
        out.write("\t\t\t\t\t<select name=\"status\" id=\"status\" onchange=\"changestatus()\">\n");
        out.write("\t\t\t\t\t<option value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.getClassStatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.getstatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</option>\n");
        out.write("\t\t\t\t\t<option value=\"0\">Chưa nhận</option>\n");
        out.write("\t\t\t\t\t<option value=\"1\">Đang xử lý</option>\n");
        out.write("\t\t\t\t\t<option value=\"2\">Hoàn thành</option>\n");
        out.write("\t\t\t\t\t<option value=\"3\">Đã thanh toán</option>\n");
        out.write("\t\t\t\t\t<option value=\"4\">Huỷ đơn</option>\n");
        out.write("\t\t\t\t\t</select>\n");
        out.write("\t\t\t</div>\n");
        out.write("                        <div class=\"addressBx show ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("\t\t\t\t<div class=\"before\" onclick=\"showaddress()\">+</div>\n");
        out.write("\t\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t\t<span>Thôn</span>\n");
        out.write("\t\t\t\t\t<input type=\"text\" id=\"address0\" name=\"address0\" readonly value=\"Cống Khê\"/>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t\t<span>Xã, thị trấn</span>\n");
        out.write("\t\t\t\t\t<input type=\"text\" id=\"address1\" name=\"address1\" readonly value=\"Hoà Lâm\"/>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t\t<span>Quận,huyện</span>\n");
        out.write("\t\t\t\t\t<input type=\"text\" id=\"address2\" name=\"address2\" readonly value=\"Ứng Hoà\"/>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t\t<div class=\"inputBx\">\n");
        out.write("\t\t\t\t\t<span>Tỉnh, thành phố</span>\n");
        out.write("\t\t\t\t\t<input type=\"text\" id=\"address3\" name=\"address3\" readonly value=\"Hà Nội\"/>\n");
        out.write("\t\t\t\t</div>\n");
        out.write("\t\t\t</div>\t\t\t\t\n");
        out.write("\t</div>\n");
        out.write("\t<div class=\"infor ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("                        <table>\n");
        out.write("                                <thead>\n");
        out.write("                                    <tr>\n");
        out.write("                                        <td>STT</td>\n");
        out.write("                                        <td>Tên món</td>\n");
        out.write("                                        <td>Số lượng</td>\n");
        out.write("                                        <td>Đơn giá</td>\n");
        out.write("                                    </tr>\n");
        out.write("                                </thead>\n");
        out.write("                        ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </table>\n");
        out.write("\t</div>\n");
        out.write("        <hr>\n");
        out.write("        <div class=\"total\"><span>Tổng tiền:</span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.getTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" VNĐ</div>\n");
        out.write("        <div class=\"footer\">\n");
        out.write("            <input type=\"text\" name=\"req\" value=\"u\" hidden/>\n");
        out.write("            <button class=\"btnf\" id=\"addf\" type=\"button\" onclick=\"addfood()\">Add food</button>\n");
        out.write("            <button class=\"btnf\" id=\"update\" type=\"submit\" disabled>Update</button>\n");
        out.write("            <button class=\"btnf\" id=\"delete\" type=\"button\" onclick=\"deleteorder()\">Delete</button>\n");
        out.write("            <button class=\"btnf\" id=\"set\" type=\"button\" onclick=\"setstatus()\" disabled>Set status</button>\n");
        out.write("            <button class=\"btnf\" id=\"cancel\" type=\"button\" onclick=\"cancelupdate()\" disabled>Cancel</button>\n");
        out.write("        </div>\t\t\n");
        out.write("        </div>\n");
        out.write("                             </form>\n");
        out.write("                     ");
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

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_1.setVar("cust");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listcust}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cust.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cust.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cust.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cust.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" hidden></option>    \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.getType()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("hidden");
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

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.getType()==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("hidden");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.orderdetail.size()>0 && orderview.orderdetail!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <tbody>\n");
        out.write("                                ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </tbody>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_forEach_2.setVar("i");
    _jspx_th_c_forEach_2.setBegin(0);
    _jspx_th_c_forEach_2.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.orderdetail.size()-1}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.orderdetail.get(i).name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.orderdetail.get(i).quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderview.orderdetail.get(i).getprice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        </tr>    \n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
