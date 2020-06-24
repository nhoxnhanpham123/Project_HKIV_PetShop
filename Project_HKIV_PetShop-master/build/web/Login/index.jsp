<%-- 
    Document   : index
    Created on : Jun 13, 2020, 7:17:18 PM
    Author     : NGUYEN HOANG BAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
    String id = request.getAttribute("id").toString();
    String email = request.getAttribute("email").toString();
    out.print("Id: " + id);
    out.print("<br/>Email: " + email);
  %>
    </body>
</html>
