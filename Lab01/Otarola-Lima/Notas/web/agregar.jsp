<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
  <center>
    <h2>Agregar Alumno</h2>
    <form method="post" action="alumnoAgregar">
       <p>Alumno: <input type="text" name="alumno" required="required"/></p>
       <p>Curso: <select name="curso">
               <option value="Ingenieria de Control">Ingenieria de Control</option>
               <option value="Sistemas Operativos">Sistemas Operativos</option>
               <option value="Investigacion de Operaciones">Investigacion de Operaciones</option>
               <option value="Ingenieria de Negocios">Ingenieria de Negocios</option>
               <option value="Ingenieria de Software III">Ingenieria de Software III</option>
      </select>
      </p>
      <p>practica 1: <input type="number" name="n1" min="0" max="20" step="1" required="required"/></p>
       <p>practica 2: <input type="number" name="n2" min="0" max="20" step="1" required="required"/></p>
       <p>practica 3: <input type="number" name="n3" min="0" max="20" step="1" required="required"/></p>
       <p>practica 4: <input type="number" name="n4" min="0" max="20" step="1" required="required"/></p>
      
      
      <p>Examen Parcial: <input type="number" name="exparcial" min="0" max="20" step="1" required="required"/></p>
      <p>Examen Final: <input type="number" name="exfinal" min="0" max="20" step="1" required="required"/></p>
      <p>Proyecto: <input type="number" name="proyecto" min="0" max="20" step="1" required="required"/></p>
      
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </center>  
  </body>
</html>
