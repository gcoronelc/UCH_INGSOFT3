<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>
  </head>
  <style type="text/css">
  *{font-family: 'Roboto', sans-serif;}
  </style>
  <body>
    <h2>Curso Ing.Software 3 : Notas</h2>
    <form method="post" action="CarritoAgregar">
      <p>Estudiante <input type="text" name="nombre"/></p>
      <TABLE BORDER=1 WIDTH=300>
        <TR>
        <td WIDTH=100>Prac. 1</td>
        <td WIDTH=100>Prac. 2</td>
        <td WIDTH=100>Prac. 3</td>
        <td WIDTH=100>Prac. 4</td>
        <td WIDTH=100>Exam. Parcial</td>
        <td WIDTH=100>Exam. Final</td>
        <td WIDTH=100>Proyecto</td>
        </TR>
        <!----->
        <TR>
        <td WIDTH=100><input type="text" name="p1"></td>
        <td WIDTH=100><input type="text" name="p2"></td>
        <td WIDTH=100><input type="text" name="p3"></td>
        <td WIDTH=100><input type="text" name="p4"></td>
        <td WIDTH=100><input type="text" name="ep"></td>
        <td WIDTH=100><input type="text" name="pf"></td>
        <td WIDTH=100><input type="text" name="proy"></td>
        </TR>

        </TABLE>
      <p><input type="submit" value="Procesar"/></p>
    </form>
  </body>
</html>
