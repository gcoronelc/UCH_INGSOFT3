<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            td{
                text-align: center;
                padding: 6px;
            }
            input{
                width: 150px;
            }
            p{float: right;}
            
        </style>
    </head>
    <body>
        <h2>Ingrese Notas</h2>
        <form method="post" action="AgregarNotas">
            <table width="100%" align="center" border="0">
                <tr>
                    <td width="25%">Ingrese Curso: <input title="Se Necesita Nombre Del Curso" type="text" name="curso" maxlength="20" required/></td>
                    <td width="25%">Ingrese Alumno: <input title="Se Necesita Nombre Del Alumno" type="text" name="alumno" maxlength="20" required/></td>
                </tr>
                <tr>
                    <td width="25%">Ingrese Nota1: <br><input title="Se Necesita Nota Del Alumno" type="number" name="n1" min="0" max="20" size="10" required/></td>
                    <td width="25%">Ingrese Nota2: <br><input title="Se Necesita Nota Del Alumno" type="number" name="n2" min="0" max="20" required/></td>
                    <td width="25%">Ingrese Nota3: <br><input title="Se Necesita Nota Del Alumno" type="number" name="n3" min="0" max="20" required/></td>
                    <td width="25%">Ingrese Nota4: <br><input title="Se Necesita Nota Del Alumno" type="number" name="n4" min="0" max="20" required/></td>
                </tr>   
                <tr>
                    <td width="25%">Ingrese Nota Parcial: <input title="Se Necesita Nota Del Alumno" type="number" name="parcial"  min="0" max="20" required/></td>
                    <td width="25%">Ingrese Nota Final: <input title="Se Necesita Nota Del Alumno" type="number" name="final" min="0" max="20" required/></td>
                </tr>
                <tr>
                    <td width="25%">Ingrese Nota De Proyecto: <input title="Se Necesita Nota Del Alumno" type="number" name="proyecto" min="0" max="20" required/></td>
                </tr>
            </table>
            <p><input type="submit" value="procesar"/></p>

        </form>
    </body>
</html>
