<%-- 
    Document   : lista
    Created on : 16-abr-2016, 12:02:23
    Author     : Familia Diaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
          <link rel="stylesheet" href="css/estilos.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
       <h2>Lista</h2>
       <table class="table table-bordered">
        <thead>
            <tr>
                <th>Nº</th>
                <th>Nombre Del Alumno:</th>
                <th>Nombre Del Curso:</th>
                <th>Promedio De Practicas:</th>
                <th>Examen Parcial:</th>
                <th>Examen Final:</th>
                <th>Proyecto:</th>
                <th>Promedio Final:</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${lista}" var="r">
            <tr>
                <td>${r.cant}</td>
                    <td>${r.alumno}</td>
                    <td>${r.curso}</td>
                    <td>${r.promedio}</td>
                    <td>${r.parcial}</td>
                    <td>${r.examenF}</td>
                    <td>${r.proyecto}</td>
                    <td><p>${r.notaF}</p></td>
            </tr>
           </c:forEach>
        </tbody>
        
       </table>
        
    </body>
</html>
