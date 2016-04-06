<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>CATALOGO</h1>
    
    <table border="1">
      <tr>
        <th>NOMBRE</th>
        <th>PRECIO</th>
        <th>STOCK</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.nombre}</td>
        <td>${r.precio}</td>
        <td>${r.stock}</td>
      </tr>
      </c:forEach>
      
    </table>
  </body>
</html>
