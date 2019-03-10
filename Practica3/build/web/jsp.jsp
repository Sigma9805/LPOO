<%-- 
    Document   : jsp
    Created on : 9/03/2019, 09:09:21 PM
    Author     : Salvador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String correo=request.getParameter("correo");
        String password=request.getParameter("password");
        String fecha=request.getParameter("date");
        String telefono=request.getParameter("telefono");
        %>
        <h3>Nombre: </h3><%=correo%>
        <h3>Contraseña: </h3><%=password%>
        <h3>Fecha de nacimiento: </h3><%=fecha%>
        <h3>Telefono: </h3><%=telefono%>
    </body>
</html>
