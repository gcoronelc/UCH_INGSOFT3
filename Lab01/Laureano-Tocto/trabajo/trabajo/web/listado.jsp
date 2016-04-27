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

      
    <table class="table table-bordered" >
    <thead>
        <tr  class="success">
          <th>ALUMNO</th>
          <th>PRACT.1</th>
          <th>PRACT.2</th>
          <th>PRACT.3</th>
          <th>PRACT.4</th>
          <th>EXA.PARCIAL</th>
          <th>EXA.FINAL</th>
          <th>PROYECTO</th>
          <th>PROMEDIO</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lista}" var="r">
            <tr>
                <td>${r.alumno}</td>
                <td>${r.nota1}</td>
                <td>${r.nota2}</td>
                <td>${r.nota3}</td>
                <td>${r.nota4}</td>
                <td>${r.exaparcial}</td>
                <td>${r.exafinal}</td>
                <td>${r.proyecto}</td>
                <td>${r.promedio}</td>
            </tr>
     
      
        </c:forEach>
      
    </tbody>
  </table>
    
      
      
    
       
    
  </body>
</html>
