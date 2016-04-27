<%-- 
    Document   : mayorPrecio
    Created on : 13-abr-2016, 20:04:52
    Author     : Alumno-UCH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <h2>Mayor Precio</h2>
    <p>Prodcuto : ${dtoMayor.producto}</p>
    <p>Precio : ${dtoMayor.precio}</p>
    <p>Cantidad : ${dtoMayor.cant}</p>
    <p>Importe : ${dtoMayor.importe}</p>
    
    
    <h2>Menor Precio</h2>
    <p>Prodcuto : ${dtoMenor.producto}</p>
    <p>Precio : ${dtoMenor.precio}</p>
    <p>Cantidad : ${dtoMenor.cant}</p>
    <p>Importe : ${dtoMenor.importe}</p>
    
    <h2>Menor Vendido</h2>
    <p>Prodcuto : ${dtoMenorV.producto}</p>
    <p>Precio : ${dtoMenorV.precio}</p>
    <p>Cantidad : ${dtoMenorV.cant}</p>
    <p>Importe : ${dtoMenorV.importe}</p>
    
    <h2>Mayor Vendido</h2>
    <p>Prodcuto : ${dtoMayorV.producto}</p>
    <p>Precio : ${dtoMayorV.precio}</p>
    <p>Cantidad : ${dtoMayorV.cant}</p>
    <p>Importe : ${dtoMayorV.importe}</p>
    
    
    </body>
</html>
