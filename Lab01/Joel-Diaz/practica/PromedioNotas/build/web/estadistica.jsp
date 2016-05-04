<%-- 
    Document   : estadistica
    Created on : 16-abr-2016, 12:03:18
    Author     : Familia Diaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report me</title>
        <link rel="stylesheet" href="css/estilos.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
        
        
        
        
       
       <h2>Reporte</h2>
        <table class="table table-bordered">
        <thead>
            <tr>
                <th>Estudiante/Promedio  Alto:</th>
                <th>Estudiante/Promedio Menor</th>
                <th>Estudiante Aprobados:</th>
                <th>Estudiantes Reprobados:</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${MayorPromedio}</td>
                <td>${MenorPromedio}</td>
                <td>${Aprobados}</td>
                 <td>${Reprobados}</td>
                
            </tr>
            
        </tbody> 
        </table>
       
    </body>
</html>
