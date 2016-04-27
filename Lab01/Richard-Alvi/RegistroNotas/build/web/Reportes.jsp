<%-- 
    Document   : Reportes
    Created on : 15/04/2016, 01:56:33 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center> <h1>Reportes</h1>
        <p> Mayor promedio es:&nbsp;&nbsp;<b>${mayorpromedio}</b></p>
        <p>Menor promedio es:&nbsp;&nbsp;<b>${menorpromedio}</b></p>
        <p>Aprobados son:&nbsp;&nbsp;<b>${aprobados}</b></p>
         <p>Desaprobados son:&nbsp;&nbsp;<b>${desaprobados}</b></p>
  
    </center>
    </body>
</html>
