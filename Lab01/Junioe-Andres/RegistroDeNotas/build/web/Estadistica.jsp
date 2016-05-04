<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>    
        <style>
            div{margin:0px 10%;  font-size: 1.3em;}
            strong{padding-left: 50px;}
            span{padding-left:  50px}
            .mover1{padding-left: 103px;}
            .mover2{padding-left: 95px;}
        </style>
    </head>
    <body>
    <div>
        <h2>Reporte</h2>
        <span>Estudiante Mayor Promedio:</span> <strong>${MayorPromedio}</strong><br>
        <span>Estudiante Menor Promedio:</span> <strong> ${MenorPromedio}</strong><br>
        <span>Estudiantes Aprobados:</span> <strong class="mover1"> ${Aprobados}</strong><br>
        <span>Estudiantes Reprobados:</span> <strong class="mover2"> ${Reprobados}</strong>
    </div>
</body>
</html>
