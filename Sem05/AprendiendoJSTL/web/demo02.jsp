<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="n1" value="${param.n1}" />
<c:set var="n2" value="${param.n2}" />
<c:set var="suma" value="${n1 + n2}" />

<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>SUMA</h1>
    <p>Número 1: ${n1}</p>
    <p>Número 2: ${n2}</p>
    <p>Suma: ${suma}</p>
  </body>
</html>
