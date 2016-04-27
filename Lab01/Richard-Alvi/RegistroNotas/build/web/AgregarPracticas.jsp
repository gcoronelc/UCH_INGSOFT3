<%-- 
    Document   : AgregarPracticas
    Created on : 15/04/2016, 12:22:04 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Notas desarrollado por ALvi</title>
    </head>
    <body>
       
       
        <form method="post" action="AgregarPrac">
        <p>Estudiante: <input type="text" name="nombre" required/></p>      
      <p>Practica1: <input type="number" min="0" max="20" name="p1" required/></p>
     <p>Practica2: <input type="number" min="0" max="20"  name="p2" required/></p>
     <p>Practica3: <input type="number" min="0" max="20"  name="p3" required/></p>
       <p>Practica4: <input type="number" min="0" max="20" name="p4" required/></p>
     <p>Parcial: <input type="number" min="0" max="20"  name="par" required/></p>
     <p>Examen Final: <input type="number" min="0" max="20"  name="fi" required/></p>
     <p>Proyecto: <input type="number" min="0" max="20"  name="pro" required/></p>
      <p><input type="submit" value="Procesar"/></p>
    </form>
            
        
    </body>
</html>
