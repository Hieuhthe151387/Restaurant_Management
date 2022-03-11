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
        <link href="css/signin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="image">
            <p>Hello</p>
        </div>
        <div class="box">
            <h2>Login</h2>
                    <form action="login" method="post">
                   <div class="inputBox">
                       <input type="text" name="account" required title="nhập đúng toàn chữ">
                       <span>User name</span>
                   </div>
                   <div class="inputBox">
                       <input type="password" name="password" required title="nhập đúng toàn chữ">
                       <span>Password</span>
                   </div>
                   <div class="error">${requestScope.error}</div>
                   <div class="checkBox">
                       <input type="checkbox" value="remember"><span class="title">Remember me.</span>
                   </div>
                   <input type="submit" value="Login">
               </form>
        </div>
    </body>
</html>
