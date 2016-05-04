<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>REPORTE</h2>
        <p>Total: ${total}</p>
       

        <table border="1">
            
            <tr>
                <th>CLIENTE</th>
                <th>ARTICULO</th>
                <th>PRECIO</th>
                <th>CANTIDAD</th>

            </tr>
            
            <c:forEach items="${lista}" var="r">
                <tr>
                    <td>${r.cliente}</td>
                    <td>${r.articulo}</td>
                    <td>${r.precio}</td>
                    <td>${r.cant}</td>
                    <td>${r.importe}</td>
                </tr>
            </c:forEach>

        </table>
        
        <p>articuloMenosVendido: ${articuloMenosVendido}</p>
         <table border="1">
            
            <tr>
                <th>CLIENTE</th>
                <th>ARTICULO</th>
                <th>PRECIO</th>
                <th>CANTIDAD</th>

            </tr>
            <tr>
                <th>ARTICULO MAS VENDIDO</th>
                <th>ARTICULO MENOS VENDIDO</th>
                <th>ARTICULO DE MAYOR PRECIO</th>
                <th>ARTICULO DE MENOR PRECIO</th>

            </tr>

            <c:forEach items="${lista}" var="r">
                <tr>
                    <td>${r.cliente}</td>
                    <td>${r.articulo}</td>
                    <td>${r.precio}</td>
                    <td>${r.cant}</td>
                    <td>${r.importe}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
