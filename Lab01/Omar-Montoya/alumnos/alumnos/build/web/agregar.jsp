<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>agregar</title>
  </head>
  <body>
  <center>   
    <h2>Agregar notas</h2>
    <form method="post" action="AlumnoAgregar">
      <p>Alumno:<input type="text" name="nombre" required></p>  
      <p>Curso: <input type="text" name="curso" required></p>
      Practica 1: <input type="number" min="0" max="20" name="practica1" required>
      Practica 2: <input type="number" min="0" max="20" name="practica2" required>
      Practica 3: <input type="number" min="0" max="20" name="practica3" required>
      Practica 4: <input type="number" min="0" max="20" name="practica4" required>
      <p>Examen Parcial:<input type="number" min="0" max="20" name="parcial" required></p>
      <p>Examen Final:<input type="number" min="0" max="20" name="final" required></p>
      <p>Proyecto:<input type="number" min="0" max="20" name="proyecto" required></p>
      <p><input type="submit" value="Procesar" ></p>
      <p><input type="reset" value="limpiar" ></p>
    </form>
    </center>
  </body>
</html>
