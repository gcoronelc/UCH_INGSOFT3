<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
  <center>
      <h2>LISTADO</h2>
  </center>  
    <table border="1">
      <tr>
        <th>ALUMNO</th>
        <th>CURSO</th>
        <th>PRACTICA 1</th>
        <th>PRACTICA 2</th>
        <th>PRACTICA 3</th>
        <th>PRACTICA 4</th>
        <th>EXAMEN PARCIAL</th>
        <th>EXAMEN FINAL</th>
        <th>PROYECTO</th>
        <th>PROMEDIO</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.alumno}</td>
        <td>${r.curso}</td>
        <td>${r.n1}</td>
        <td>${r.n2}</td>
        <td>${r.n3}</td>
        <td>${r.n4}</td>
        <td>${r.exparcial}</td>
        <td>${r.exfinal}</td>
        <td>${r.proyecto}</td>
        <td>${r.prom}</td>
      </tr>
      </c:forEach>
      
    </table>
    
  </body>
</html>
