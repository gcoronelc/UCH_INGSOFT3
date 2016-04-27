<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.css" media="screen" />
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
 
    
      <BR><BR><BR>
      <table class="table table-bordered" >
    <thead>
        <tr  class="success">
            <th></th>
            <th>ALUMNO</th>
            <th>PROMEDIO</th>
        </tr>
    </thead>
        <tbody>
            <tr>
                <td>MAYOR PROMEDIO</td>
                <td>${dtoMayor.alumno}</td>
                <td>${dtoMayor.promedio}</td>
            </tr>
            <tr>
                <td>MENOR PROMEDIO</td>
                <td>${dtoMenor.alumno}</td>
                <td>${dtoMenor.promedio}</td>
            </tr>
            <tr>
                <td>CANTIDAD DE APROBADOS</td>
                <td>${aprobado}</td>
            </tr>
            <tr>
                <td>CANTIDAD DE DESAPROBADOS</td>
                <td>${desaprobado}</td>
            </tr>
            
            
       </tbody>
    </table> 
    
    
    
       
    
  </body>
</html>
