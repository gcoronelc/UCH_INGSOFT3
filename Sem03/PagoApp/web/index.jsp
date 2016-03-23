<%@page import="pe.uch.pagoapp.dto.PagoDto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <h1>PAGO DE TRABAJADOR</h1>
    <form method="post" action="PagoController">
      <table>
        <tr>
          <td>Horas por dÃ­a:</td>
          <td><input type="text" name="horasDia"/></td>
        </tr>
        <tr>
          <td>DÃ­as trabajados:</td>
          <td><input type="text" name="dias"/></td>
        </tr>
        <tr>
          <td>Pago x Horas:</td>
          <td><input type="text" name="pagoHora"/></td>
        </tr>
      </table>
      <input type="submit" value="Procesar"/>
    </form>
  
    <% if(request.getAttribute("pagoDto") != null) { %>
      <h1>RESULTADO</h1>
      <% PagoDto dto = (PagoDto) request.getAttribute("pagoDto"); %>
      <table>
        <tr>
          <td>Horas por día:</td>
          <td><%=dto.getHorasDia()%></td>
        </tr>
        <tr>
          <td>Días trabajados:</td>
          <td><%=dto.getDias()%></td>
        </tr>
        <tr>
          <td>Pago x Hora:</td>
          <td><%=dto.getPagoHora()%></td>
        </tr>
        <tr>
          <td>Ingresos:</td>
          <td><%=dto.getIngresos()%></td>
        </tr>
        <tr>
          <td>Renta:</td>
          <td><%=dto.getRenta()%></td>
        </tr>
        <tr>
          <td>Neto:</td>
          <td><%=dto.getNeto()%></td>
        </tr>
      </table>
    <% } %>
  </body>
</html>
