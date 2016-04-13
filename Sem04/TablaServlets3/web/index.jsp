<%@page contentType="text/html" pageEncoding="UTF-8"  %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <c:if test="${TablaDto !=null}">

      <h1>Resultado</h1>
      <p>Tabla Número: ${TablaDto.numero}</p>

      <table border="1" width="200">
        <c:forEach items="${TablaDto.tabla}" var="r">
          <tr>
            <td>${r.num1}</td>
            <td>${r.operador}</td>
            <td>${r.num2}</td>
            <td>=</td>
            <td>${r.resultado}</td>
          </tr>
        </c:forEach>
      </table>

    </c:if>
  </body>
</html>
