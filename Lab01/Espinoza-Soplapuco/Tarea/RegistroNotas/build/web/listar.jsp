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
        <th>Alumno</th>
        <th>Curso</th>
        <th>Practica 1</th>
        <th>Practica 2</th>
        <th>Practica 3</th>
        <th>Practica 4</th>
        <th>Parcial</th>
        <th>Final</th>
        <th>Proyecto</th>
        <th>Promedio</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.nombre}</td>
        <td>${r.curso}</td>
        <td>${r.p1}</td>
        <td>${r.p2}</td>
        <td>${r.p3}</td>
        <td>${r.p4}</td>
        <td>${r.exparcial}</td>
        <td>${r.exfinal}</td>
        <td>${r.proyecto}</td>
        <td>${r.promedio}</td>
      </tr>
      </c:forEach>
      
    </table>
  </body>
</html>