
<%@page import="pe.app.dto.TablaDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"  %>
<!DOCTYPE html>
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
        <% 
          if(request.getAttribute("TablaDto") != null ){ 
            TablaDto tablaDto = (TablaDto) request.getAttribute("TablaDto");
        %>
          <h1>Resultado</h1>
          <p>Tabla Número: <%= tablaDto.getNumero() %></p>
        
          <table border="1" width="200">
            <% for(int n=0; n <= 12; n++) { %>
            <tr>
              <td><%= tablaDto.getTabla()[n].getNum1() %></td>
              <td><%= tablaDto.getTabla()[n].getOperador()%></td>
              <td><%= tablaDto.getTabla()[n].getNum2() %></td>
              <td>=</td>
              <td><%= tablaDto.getTabla()[n].getResultado() %></td>
            </tr>
            <% } %>
          </table>
          
        <% } %>
    </body>
</html>
