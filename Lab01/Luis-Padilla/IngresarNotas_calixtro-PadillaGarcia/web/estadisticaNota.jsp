<%-- 
    Document   : mayorPrecio
    Created on : 13-abr-2016, 20:04:52
    Author     : Alumno-UCH
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
        
    <h2>Estudiante con Mayor Promedio</h2>
    <p>Estudiante : ${dtoMayorPromedio.nombre}</p>
    <p>Apellido : ${dtoMayorPromedio.app}</p>
    <p>Promedio : ${dtoMayorPromedio.promedio}</p>
    <br>
    <h2>Estudiante con Menor Promedio</h2>
    <p>Estudiante : ${dtoMenorPromedio.nombre}</p>
    <p>Apellido : ${dtoMenorPromedio.app}</p>
    <p>Promedio : ${dtoMenorPromedio.promedio}</p>
    <br>
    <h2>Estudiantes Aprobados</h2>
    <table border="1">
      <tr>
        <th>NOMBRE</th>  
        <th>APELLIDO</th>
        <th>PROMEDIO</th>
      </tr>      
      <c:forEach items="${dtoAprobados}" var="r">
      <tr>
        <td>${r.nombre}</td>  
        <td>${r.app}</td>
        <td>${r.promedio}</td>
      </tr>
      </c:forEach>      
    </table>
    <br>
    <h2>Estudiantes Desaprobados</h2>
    <table border="1">
      <tr>
        <th>NOMBRE</th>  
        <th>APELLIDO</th>
        <th>PROMEDIO</th>
      </tr>      
      <c:forEach items="${dtoDesaprobados}" var="r">
      <tr>
        <td>${r.nombre}</td>  
        <td>${r.app}</td>
        <td>${r.promedio}</td>
      </tr>
      </c:forEach>      
    </table>
    </body>
</html>
