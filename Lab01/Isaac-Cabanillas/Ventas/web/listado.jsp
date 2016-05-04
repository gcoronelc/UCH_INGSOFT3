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
    <p>Total: ${total}</p>
    <table border="1">
      <tr>
        <th>PRODUCTO</th>
        <th>CLIENTE</th>
        <th>PRECIO</th>
        <th>CANT</th>
        <th>IMPORTE</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.producto}</td>
        <td>${r.cliente}</td>
        <td>${r.precio}</td>
        <td>${r.cant}</td>
        <td>${r.importe}</td>
        
      </tr>
      </c:forEach>
      
      <h2>REPORTE ESTADISTICO</h2>
      <p>Producto: ${dtomayor.producto}</p>
      <p>Precio: ${dtomayor.precio}</p>
      <p>Cantidad: ${dtomayor.cant}</p>
      <p>Importe: ${dtomayor.importe}</p>
  </body>
</html>
