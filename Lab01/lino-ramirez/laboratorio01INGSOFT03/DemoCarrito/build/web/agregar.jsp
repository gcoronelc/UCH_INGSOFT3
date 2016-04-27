<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h2>Agregar Item</h2>
    <form method="post" action="VentasAgregar">
      <p>Cliente: <input type="text" name="cliente"/></p>  
      
      <p>Articulo:<Select name="producto" SIZE=1 >
          <option value="Opcion">
          <option value="ipod">ipod</option>
          <option value="laptop">laptop</option>
          <option value="PC">Pc</option>
          <option value="Televisor">Televisot</option>
          <option value="blueray">blueray</option>
          <option value="tablet">tablet</option>
          <option value="smartphone">smartphone</option>
          </Select></p>
      <p>Precio: <input type="text" name="precio"/></p>
      <p>Cantidad: <input type="text" name="cant"/></p>
      
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
</html>
