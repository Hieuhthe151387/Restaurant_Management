<%-- 
    Document   : order
    Created on : 15-Mar-2022, 16:16:11
    Author     : Admin
--%>

<%@page import="Model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="test" method="post">
            <div>Username:<input type="text" name="username" required/></div>
            <div>Password<input type="password" name="password" required/></div>
            <div><input type="submit" value="Login" /></div>
        </form>
    </body>
</html>
