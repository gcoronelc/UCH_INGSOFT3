<%@page import="pe.uch.practica01.Dto.PracticaDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>EMPRESA DE AGUA</h1>
        <form method="post" action="PracticaController">
            <table>
                <tr><td>Lectura del Mes Anterior:</td><td><input type="text"  name="Lectura1"></td></tr>
                <tr><td>Lectura del Mes Actual</td><td><input type="text"  name="Lectura2"></td></tr>
                <tr><td></td><td><input type="submit"  name="Procesar"></td></tr>
            </table>
        </form>
        
        
        <% if(request.getAttribute("pracDto") != null){ %>
        <h1>RECIBO</h1>
        <% PracticaDto dto=(PracticaDto) request.getAttribute("pracDto"); %>
        <table>
            <tr>
                <td>Lectura del Mes Anterior:</td>
                <td><%=dto.getLectura1()%></td>
            </tr>
            <tr>
                <td>Lectura del Mes Actual:</td>
                <td><%=dto.getLectura2()%></td>
            </tr>
            <tr>
                <td>Consumo:</td>
                <td><%=dto.getConsumo()%></td>
            </tr>
            <tr>
                <td>Importe:</td>
                <td><%=dto.getImporte()%></td>
            </tr>
        </table>
   <% }%>
    </body>
</html>
