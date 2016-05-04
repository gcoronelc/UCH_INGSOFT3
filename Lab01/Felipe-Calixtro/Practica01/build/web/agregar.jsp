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
      <SELECT NAME="producto" SIZE=1 type="text"> 
        <OPTION VALUE="leche">Lechita</OPTION>
        <OPTION VALUE="papa">Papita</OPTION>
        <OPTION VALUE="huevo">Huevito</OPTION>
        <OPTION VALUE="platano">Platanito</OPTION> 
        <OPTION VALUE="pavo">Pavito</OPTION> 
      </SELECT> 
      </p>    
      <p>Precio: <input type="text" name="precio"/></p>
      <p>Cantidad: 
        <input name="cant" type="number" name="quantity" min="1" max="20">
      </p>
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
</html>
