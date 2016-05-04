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
      <p>Cliente: <input type="text" name="cliente"/></p> 
      <p>Articulo: 
                    <td>
                    <select name="producto">
                    <option>Seleccione..</option>
                    <option>Pantalon</option>
                    <option>Camisa</option>
                    <option>Blusa</option>
                    <option>Chaqueta</option>
                    <option>Short</option>
                    </select>
                    </td>
       </p>
      <p>Precio: <input type="text" name="precio"/></p>
      <p>Cantidad: <input type="text" name="cant"/></p>
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
</html>
