<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>FOR</h1>
    <c:forEach begin="1" end="6" var="i">
      <h${i}>ALIANZA CAMPEON</h${i}>
    </c:forEach>
  </body>
</html>
