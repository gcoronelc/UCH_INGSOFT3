<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h2>LISTADO</h2>
    <table border="1">
      <tr>
        <th>NOMBRE</th>  
        <th>APELLIDO</th>
        <th>PRAC 01</th>
        <th>PRAC 02</th>
        <th>PRAC 03</th>
        <th>PRAC 04</th>
        <th>EXAMEN PARCIAL</th>
        <th>EXAMEN FINAL</th>
        <th>NOTA PROYECTO</th>
        <th>PROMEDIO</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.nombre}</td>  
        <td>${r.app}</td>
        <td>${r.prac01}</td>
        <td>${r.prac02}</td>
        <td>${r.prac03}</td>
        <td>${r.prac04}</td>
        <td>${r.exapar}</td>
        <td>${r.exafin}</td>
        <td>${r.proyecto}</td>
        <td>${r.promedio}</td>
      </tr>
      </c:forEach>
      
    </table>
    
    
    
  </body>
</html>
