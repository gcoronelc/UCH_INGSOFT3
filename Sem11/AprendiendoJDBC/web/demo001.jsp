<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <jsp:include page="cabecera.jsp" />
    <h1>Insertar Parametro</h1>
    <p>${msg}</p>
    <p>${error}</p>
    <form method="post" action="AddParametro">
      <p>Codigo: <input type="text" name="codigo"/></p>
      <p>Descripcion: <input type="text" name="descripcion"/></p>
      <p>Valor: <input type="text" name="valor"/></p>
      <input type="submit" value="Procesar"/>
    </form>
  </body>
</html>
