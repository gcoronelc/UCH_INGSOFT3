<%-- 
    Document   : suma
    Created on : 09-mar-2016, 21:05:50
    Author     : ALUMNO-UCH
--%>
<%! 
  // Declarando variables
  private int n1, n2, suma;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>SUMA</h1>
    
    <!-- Recogiendo los datos -->
    <%
      n1 = Integer.parseInt(request.getParameter("n1"));
      n2 = Integer.parseInt(request.getParameter("n2"));
    %>
    
    <!-- Mostrando datos -->
    <p>Número 1: <%=n1%></p>
    <p>Número 2: <%=n2%></p>
    
    <!-- Proceso -->
    <%
    
    try{
      Thread.currentThread().sleep(1000);
    } catch(Exception e){}
    
    
    suma = n1 + n2;
    %>
    
    <!-- Reporte -->
    
    <p>Suma: <%=suma%></p>
    
  </body>
</html>
