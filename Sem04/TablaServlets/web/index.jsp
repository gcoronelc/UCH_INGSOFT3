
<%@page import="pe.app.dto.TablaDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <style type="text/css">
    ul,li{margin:0;padding:0}
    li{border-bottom:1px solid gray;line-height: 30px;}
    </style>
    <body>
        <h1>Tabla Multiplicar</h1>
        <form method="post" action="TablaController">
            
            <input type="text" name="numero" placeholder="Ingresa un numero">
                
            <button type="submit">Procesar</button>
        </form>
        <% if(request.getAttribute("TablaDto") != null ){ %>
        <h1>Resultado</h1>
        <%
            
            TablaDto tablaDto = (TablaDto) request.getAttribute("TablaDto");
        
        %>
        <ul><%=tablaDto.getResultado() %></ul>
        <% } %>
    </body>
</html>
