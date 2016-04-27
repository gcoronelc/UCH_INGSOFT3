<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h2>Agregar Item</h2>
    <form method="post" action="NotaAgregar">
      <p>Nombre: <input type="text" name="nombre"/></p>
      <p>Apellido: <input type="text" name="app"/></p>
      <p>Ingresar Notas</p>
      <p>Practica 01: <input type="text" name="prac01"/></p>
      <p>Practica 02: <input type="text" name="prac02"/></p>
      <p>Practica 03: <input type="text" name="prac03"/></p>
      <p>Practica 04: <input type="text" name="prac04"/></p>
      <p>Examen Parcial: <input type="text" name="exapar"/></p>
      <p>Examen Final: <input type="text" name="exafin"/></p>
      <p>Proyecto: <input type="text" name="pro"/></p>
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
</html>
