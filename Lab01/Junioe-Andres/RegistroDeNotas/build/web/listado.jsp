<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                align-content: center;
            }
            table tr th{
                font-size: larger;
            }
            table tr td{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h2>Boleta De Notas</h2>
        <table border="0">
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
            <c:forEach items="${lista}" var="r">
                <tr>
                    <td>${r.orden}</td>
                    <td>${r.alumno}</td>
                    <td>${r.curso}</td>
                    <td>${r.promedioPracticas}</td>
                    <td>${r.parcial}</td>
                    <td>${r.examenFinal}</td>
                    <td>${r.proyecto}</td>
                    <td><p>${r.notaFinal}</p></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>