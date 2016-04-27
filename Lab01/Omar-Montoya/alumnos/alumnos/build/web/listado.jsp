<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
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
        <th>Examen Parcial</th>
        <th>Examen Final</th>
        <th>Proyecto</th>
        <th>Promedio Practicas</th>
        <th>Promedio Total</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.nombre}</td> 
        <td>${r.curso}</td>
        <td>${r.practica1}</td>
        <td>${r.practica2}</td>
        <td>${r.practica3}</td>
        <td>${r.practica4}</td>
        <td>${r.exparcial}</td>
        <td>${r.exfinal}</td>
        <td>${r.proyecto}</td>
        <td>${r.propracticas}</td>
        <td>${r.prottotal}</td>
      </tr>
      </c:forEach>
    </table>
  </body>
</html>
