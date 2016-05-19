<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>INGRESO AL SISTEMA</h1>
    <p style="color:red;">${error}</p>
    <form method="post" action="Logon">
      <table>
        <tr>
          <td>Usuario:</td>
          <td><input type="text" name="usuario" /></td>
        </tr>
        <tr>
          <td>Clave:</td>
          <td><input type="password" name="clave" /></td>
        </tr>
      </table>
      <input type="submit" value="Procesar" />
    </form>
  </body>
</html>
