<%-- 
    Document   : agregar
    Created on : 16-abr-2016, 12:02:50
    Author     : Familia Diaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar</title>
        <link rel="stylesheet" href="css/estilos.css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
         <h2>Ingrese Notas</h2>
         
          <form method="post" action="AgregarNotas">
        <table class="table table-bordered">
       
        <tbody>
            <tr>
                <td>Nombre Curso: <input title="Ingrese Curso" type="text" name="curso" maxlength="20" required/></td>
                <td >Nombre Alumno <input title="Ingrese Alumno" type="text" name="alumno" maxlength="20" required/></td>
                
            </tr>
            <tr>
                <td>Primera Nota: <input title="Ingrese nota" type="number" name="n1" min="0" max="20" size="10" required/></td>
                    <td >Segunda Nota: <input title="Ingrese nota" type="number" name="n2" min="0" max="20" required/></td>
                   
            </tr>
            
            <tr>
                 <td>Tercera Nota: <input title="Ingrese nota" type="number" name="n3" min="0" max="20" required/></td>
                    <td >Cuarta Nota: <input title="Ingrese nota" type="number" name="n4" min="0" max="20" required/></td>
            </tr>
            <tr>
                 <td > Nota Parcial: <input title="Ingrese nota" type="number" name="parcial"  min="0" max="20" required/></td>
                    <td > Nota Final: <input title="Ingrese nota" type="number" name="final" min="0" max="20" required/></td>
            </tr>
            
            <tr>
                <td > Nota De Proyecto: <input title="Se Necesita Nota Del Alumno" type="number" name="proyecto" min="0" max="20" required/></td>
                <td><input type="submit" value="Enviar"/></td>
            </tr>
            
        </tbody>
        
        </table>
              
          </form>
         
         
         
         
         
      
    </body>
</html>
