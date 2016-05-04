<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
      
      
      <h2>Mayor promedio</h2>

      <p>Alumno: ${mayorPromedio.nombre}</p>
      <p>Curso: ${mayorPromedio.curso}</p>
      <p>Promedio: ${mayorPromedio.promedio}</p>
     
      
      <h2>Menor promedio</h2>
       <p>Alumno: ${menorPromedio.nombre}</p>
      <p>Curso: ${menorPromedio.curso}</p>
      <p>Promedio: ${menorPromedio.promedio}</p>
      
      <h2>Cantidad de aprobados</h2>
      <p>Aprobados: ${aprobados}</p>
      
      
      <h2>Cantidad de desaprobados</h2>
      <p>Desaprobados: ${desaprobados}</p>


  </body>
</html>