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
    <h1>CONSULTA DE CLIENTES</h1>
    <form method="post" action="ClienteConsultar">
      <table>
        <tr>
          <td>CODIGO</td>
          <td>PATERNO</td>
          <td>MATERNO</td>
          <td>NOMBRE</td>
          <td></td>
        </tr>
        <tr>
          <td><input type="text" name="codigo" value="${bean.codigo}"/></td>
          <td><input type="text" name="paterno" value="${bean.paterno}"/></td>
          <td><input type="text" name="materno" value="${bean.materno}"/></td>
          <td><input type="text" name="nombre" value="${bean.nombre}"/></td>
          <td><input type="submit" value="Consultar" /></td>
        </tr>
      </table>
    </form>
    <c:if test="${lista != null}">
      <h2>RESULTADO</h2>
      <table border="1">
        <tr>
          <th>CODIGO</th>
          <th>PATERNO</th>
          <th>MATERNO</th>
          <th>NOMBRE</th>
          <th>DNI</th>
          <th>CIUDAD</th>
          <th>EMAIL</th>
        </tr>

        <c:forEach items="${lista}" var="r">
          <tr>
            <td>${r.codigo}</td>
            <td>${r.paterno}</td>
            <td>${r.materno}</td>
            <td>${r.nombre}</td>
            <td>${r.dni}</td>
            <td>${r.ciudad}</td>
            <td>${r.email}</td>
          </tr>
        </c:forEach>

      </table>
    </c:if>
  </body>
</html>
