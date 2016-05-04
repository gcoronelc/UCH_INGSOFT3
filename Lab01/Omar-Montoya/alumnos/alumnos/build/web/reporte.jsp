
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>reporte</title>
    </head>
    <body>
        <h1>*Promedio mas alto : ${MayorpromedioTotal} </h1>
        <h1>*Promedio mas bajo : ${MenorpromedioTotal} </h1>
        <h1>*Aprobados : ${aprobados} </h1>
        <h1>*Desaprobados : ${desaprobados}</h1>
    </body>
</html>
