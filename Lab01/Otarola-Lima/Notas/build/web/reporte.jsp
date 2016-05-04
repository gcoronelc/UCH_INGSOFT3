<%-- 
    Document   : reporte
    Created on : 13-abr-2016, 21:09:10
    Author     : Alumno-UCH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte</title>
    </head>
    <body>
    <center>
        
        <h2>REPORTE</h2>
        <br>
        <h4>ALUMNO MAYOR PROMEDIO</h4>
        Alumno: ${dtoMayor.alumno}&nbsp;&nbsp;
        Promedio: ${dtoMayor.prom}
      
        <h4>ALUMNO MENOR PROMEDIO</h4>
        Alumno: ${dtoMenor.alumno}&nbsp;&nbsp;
        Promedio: ${dtoMenor.prom}
        
        <h4>ALUMNO APROBADOS</h4>
        <p>Alumno: ${dtoAprobados}</p>
       
      
        <h4>ALUMNOS DESAPROBADOS</h4>
        <p>Alumno: ${dtoDesaprobados}</p>
    </center>    
    </body>
</html>
