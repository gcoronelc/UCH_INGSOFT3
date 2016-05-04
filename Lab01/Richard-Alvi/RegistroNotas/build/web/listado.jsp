<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
         <style type="text/css">

table th{ 
  background: #0d47a1;
  color: white;
  border:0;
 
}
table td{
     text-align: center;
}

</style>
      
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
  <center><h2>LISTADO</h2>
   <table border="1">
      <tr>
        <th>NOMBRE</th>
        <th>P1</th>
        <th>P2</th>
        <th>P3</th>
        <th>P4</th>
        <th>PROMEDIO</th>
        <th>PARCIAL</th>
        <th>FINAL</th>
        <th>PROYECTO</th>
        <th>PROMEDIO FINAL</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
         <td>${r.nombre}</td>  
        <td>${r.prac1}</td>
        <td>${r.prac2}</td>
        <td>${r.prac3}</td>
        <td>${r.prac4}</td>
        <td>${r.promedio}</td>
         <td>${r.parcial}</td>
        <td>${r.examenFinal}</td>
        <td>${r.proyecto}</td>
        
        <td>${r.resultado}</td>
      </tr>
      </c:forEach>
      
    </table></center>
  </body>
</html>
