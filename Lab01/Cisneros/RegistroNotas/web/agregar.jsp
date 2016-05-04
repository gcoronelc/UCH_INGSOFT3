<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h2>Agregar Item</h2>
    <form method="post" action="AlumnoNotasAgregar">
      <p>Alumno: <input type="text" name="nombre"/></p>     
       <p>Curso: <SELECT name="curso" SIZE=1> 
<OPTION VALUE="Aritmetica">Aritmetica</OPTION>
<OPTION VALUE="Algebra">Algebra</OPTION>
<OPTION VALUE="Geometria">Geometria</OPTION>
<OPTION VALUE="Trigonometria">Trigonometria</OPTION> 
</SELECT> </p>
      <p>Practica 1: <input type="text" name="p1"/></p>
      <p>Practica 2: <input type="text" name="p2"/></p>
      <p>Practica 3: <input type="text" name="p3"/></p>
      <p>Practica 4: <input type="text" name="p4"/></p>
      <p>Parcial: <input type="text" name="parcial"/></p>
      <p>Final: <input type="text" name="final"/></p>
      <p>Proyecto: <input type="text" name="proyecto"/></p>
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
