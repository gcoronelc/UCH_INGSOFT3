<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <jsp:include page="cabecera.jsp" />
    <h1>REGISTRAR DEPOSITO</h1>
    
    <c:if test="${error != null}">
      <p style="color:red;">${error}</p>
    </c:if>
    
    <form method="post" action="CuentaDeposito">
      <table>
        <tr>
          <td>Cuenta</td>
          <td><input type="text" name="cuenta" value="${cuenta}"/></td>
          <td></td>
        </tr>
        <tr>
          <td>Importe</td>
          <td><input type="text" name="importe" value="${importe}"/></td>
          <td><input type="submit" value="Procesar" /></td>
        </tr>
      </table>
    </form>
    
    <c:if test="${mensaje != null}">
      <p style="color:blue;">${mensaje}</p>
    </c:if>
  </body>
</html>
