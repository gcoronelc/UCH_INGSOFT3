<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h2>Agregar Item</h2>
    <form method="post" action="CarritoAgregar">
      <p>Articulo: <input type="text" name="producto"/></p>
      <p>Precio: <input type="text" name="precio"/></p>
      <p>Cantidad: <input type="text" name="cant"/></p>
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
</html>
