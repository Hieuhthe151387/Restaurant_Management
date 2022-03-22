<%-- 
    Document   : signin
    Created on : 05-Mar-2022, 13:53:19
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/signin.css" rel="stylesheet" type="text/css">
        <link href="css/signin.css" rel="stylesheet" type="text/css"/>
        <% 
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
        %>
    </head>
    <body>
        <div class="image">
            <div>
                <h1>Cây đa quán</h1>
            </div>
        </div>
        <div class="box">
            <h2>Login</h2>
                    <form action="login" method="post">
                   <div class="inputBox">
                       <input type="text" id="acc" onchange="console.log(this.value)" value="${requestScope.account}" name="account" required title="nhập đúng tài khoản">
                       <label for="acc">Username</label>
                   </div>
                   <div class="inputBox">
                       <input type="password" id="pass" name="password" value="${requestScope.password}" required title="nhập đúng mật khẩu">
                       <label for="pass">Password</label>
                   </div>
                   <div class="error">${requestScope.error}</div>
                   <div class="checkBox">
                       <input type="checkbox" name="check" value="remember"><span class="title">Remember me.</span>
                   </div>
                   <input type="submit" value="Login">
               </form>
        </div>
    </body>
</html>