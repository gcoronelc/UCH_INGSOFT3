<%-- 
    Document   : suma
    Created on : 09-mar-2016, 21:05:50
    Author     : ALUMNO-UCH
--%>
<%@page import="pe.egcc.service.MateService"%>
<%
  // Declarando variables
  int n1, n2, suma;
  // Leer datos
  n1 = Integer.parseInt(request.getParameter("n1"));
  n2 = Integer.parseInt(request.getParameter("n2"));
  // Proceso
  MateService service = new MateService();
  suma = service.sumar(n1, n2);
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
    <p>Número 1: <%=n1%></p>
    <p>Número 2: <%=n2%></p>    
    <p>Suma: <%=suma%></p>    
  </body>
</html>
