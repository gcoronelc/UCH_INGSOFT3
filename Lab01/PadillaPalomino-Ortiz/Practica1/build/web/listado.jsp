<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
  </head>
  <style type="text/css">
  *{font-family: 'Roboto', sans-serif;}
  </style>
  <body>
    <h2>LISTADO Ing.Software 3 : Notas</h2>
    <table border="1">
      <tr>
        <th>Estudiante</th>
        <th>Pract1</th>
        <th>Pract2</th>
        <th>Pract3</th>
        <th>Pract4</th>
        <th>Exam.Parcial</th>
        <th>Exam.Final</th>
        <th>Proyecto</th>
        <th>Promedio</th>
        <th>Aprobado</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.nombre}</td>
        <td>${r.p1}</td>
        <td>${r.p2}</td>
        <td>${r.p3}</td>
        <td>${r.p4}</td>
        <td>${r.ep}</td>
        <td>${r.ef}</td>
        <td>${r.proy}</td>
        <td>${r.promedio}</td>
        <td>${r.aprobado}</td>
      </tr>
      </c:forEach>
      
    </table>
    
    <br>
    
      Mayor Promedio
      <table>
      <c:forEach items="${listaMayor}" var="r">
      <tr>
        <td>${r.nombre}</td>
        <td>${r.p1}</td>
        <td>${r.p2}</td>
        <td>${r.p3}</td>
        <td>${r.p4}</td>
        <td>${r.ep}</td>
        <td>${r.ef}</td>
        <td>${r.proy}</td>
        <td>${r.promedio}</td>
        <td>${r.aprobado}</td>
      </tr>
      </c:forEach>
      </table>
      <br>
      <br>
      
      Menor Promedio
      <table>
      <c:forEach items="${listaMenor}" var="r">
      <tr>
        <td>${r.nombre}</td>
        <td>${r.p1}</td>
        <td>${r.p2}</td>
        <td>${r.p3}</td>
        <td>${r.p4}</td>
        <td>${r.ep}</td>
        <td>${r.ef}</td>
        <td>${r.proy}</td>
        <td>${r.promedio}</td>
        <td>${r.aprobado}</td>
      </tr>
      </c:forEach>
      </table>
      
      <br>
      <br>
      
      Aprobados: ${aprobados}
      
      <br><br>
      
      Desaprobados: ${desaprobados}
  </body>
</html>
