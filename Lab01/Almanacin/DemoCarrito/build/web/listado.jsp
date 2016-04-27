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
        <th>CLIENTE</th>  <th
        <th>PRODUCTO</th>
        <th>PRECIO</th>
        <th>CANT</th>
        <th>IMPORTE</th>
      </tr>
      
      <c:forEach items="${lista}" var="r">
      <tr>
        <td>${r.cliente}</td>
        <td>${r.producto}</td>
        <td>${r.precio}</td>
        <td>${r.cant}</td>
        <td>${r.importe}</td>
      </tr>
      </c:forEach>
      
    </table>
    <h2>VENTA DE MAYOR IMPORTE</h2>
    <p>Producto ${dtoMayor.producto}</p>
    <p>Precio ${dtoMayor.precio}</p>
    <p>Cantidad ${dtoMayor.cant}</p>
    <p>Importe ${dtoMayor.importe}</p>
    </table>
    <h2>VENTA DE MENOR IMPORTE</h2>
    <p>Producto ${dtoMenor.producto}</p>
    <p>Precio ${dtoMenor.precio}</p>
    <p>Cantidad ${dtoMenor.cant}</p>
    <p>Importe ${dtoMenor.importe}</p>
    </table>
    
    <h2>MAYOR CANTIDAD DE ARTICULOS VENDIDOS</h2>
    <p>Producto ${dtoMayorArt.producto}</p>
    <p>Precio ${dtoMayorArt.precio}</p>
    <p>Cantidad ${dtoMayorArt.cant}</p>
    <p>Importe ${dtoMayorArt.importe}</p>
    </table>
    <h2>MENOR CANTIDAD DE ARTICULOS VENDIDOS</h2>
    <p>Producto ${dtoMenorArt.producto}</p>
    <p>Precio ${dtoMenorArt.precio}</p>
    <p>Cantidad ${dtoMenorArt.cant}</p>
    <p>Importe ${dtoMenorArt.importe}</p>
    </table>
    
  </body>
</html>
