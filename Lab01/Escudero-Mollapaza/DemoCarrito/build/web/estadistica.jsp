<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Venta de mayor importe</h2>
        <br>cliente:  ${dtomayor.cliente}</br>
        <br>articulo: ${dtomayor.articulo}</br>
        <br>precio: ${dtomayor.precio}</br>
        <br>cantidad: ${dtomayor.cant}</br>
        <br>importe: ${dtomayor.importe}</br>
        <p></p>
        <h2>Venta de menor importe</h2>
        <br>cliente:  ${dtomenor.cliente}</br>
        <br>articulo: ${dtomenor.articulo}</br>
        <br>precio: ${dtomenor.precio}</br>
        <br>cantidad: ${dtomenor.cant}</br>
        <br>importe: ${dtomenor.importe}</br>
        <p></p>
        <h2>Articulo de mayor precio</h2>
        <br>cliente:  ${dtomayorprecio.cliente}</br>
        <br>articulo: ${dtomayorprecio.articulo}</br>
        <br>precio: ${dtomayorprecio.precio}</br>
        <br>cantidad: ${dtomayorprecio.cant}</br>
        <br>importe: ${dtomayorprecio.importe}</br>
        <p></p>
        <h2>Articulo de menor precio</h2>
        <br>cliente:  ${dtomenorprecio.cliente}</br>
        <br>articulo: ${dtomenorprecio.articulo}</br>
        <br>precio: ${dtomenorprecio.precio}</br>
        <br>cantidad: ${dtomenorprecio.cant}</br>
        <br>importe: ${dtomenorprecio.importe}</br>
    </body>
</html>
