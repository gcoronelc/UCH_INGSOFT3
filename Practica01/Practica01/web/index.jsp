<%-- 
    Document   : index
    Created on : 30-mar-2016, 21:37:15
    Author     : Alumno-UCH
--%>

<%@page import="pe.app.dto.ConsumoDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CONSUMO DE AGUA</h1>
        <form method="post" action="ConsumoController">
            
            <table>
                <tr>
                    <td>Lectura del Mes Anterior:</td>
                    <td><input type="text" name="lectura1" placeholder="Ingresa un numero"></td>
                </tr>
                <tr>
                    <td>Lectura del Mes Actual:</td>
                    <td><input type="text" name="lectura2" placeholder="Ingresa un numero"></td>
                </tr>
                <tr>
                    <td><button type="submit">Procesar</button></td>
                </tr>
            </table> 

        </form>
        
        <% if(request.getAttribute("consumoDto")!=null) {%>
        <h1>RESULTADO</h1>
        
        <% ConsumoDto dto=(ConsumoDto)request.getAttribute("consumoDto"); %>
        <table>
            <tr>
                <td>Lectura del mes anterior:</td>
                <td><%= dto.getLectura1()%></td>
            </tr>
            <tr>
                <td>Lectura del mes actual</td>
                <td><%= dto.getLectura2()%></td>
            </tr>
            <tr>
                <td>Consumo:</td>
                <td><%= dto.getConsumo()%></td>
            </tr>
            <tr>
                <td>Importe:</td>
                <td><%= dto.getImporte()%></td>
            </tr>
        </table>
            <% } %>
        
    </body>
</html>
