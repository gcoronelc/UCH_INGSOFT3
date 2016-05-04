<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="" media="screen" />
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css" media="screen" />
    <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css">
    <script src="bootstrap/js/bootstrap.min.js"></script>

    <title>JSP Page</title>
  </head>
  <body>
    
    
    <center><form method="post" action="PromedioAgregar">
        <br>
        <div class="row">
            <div class="col-xs-8 col-sm-2">Alumno:</div>
            <div class="col-xs-8 col-sm-2"><input type="text" name="alumno"/></div>
        </div><br>
        <div class="row">
            <div class="col-xs-8 col-sm-2">Practica1: </div>
            <div class="col-xs-8 col-sm-2"><input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="nota1"/></div>
        </div><br>
        <div class="row">
            <div class="col-xs-8 col-sm-2">Practica2: </div>
            <div class="col-xs-8 col-sm-2"><input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="nota2"/></div>
        </div><br>
        <div class="row">
            <div class="col-xs-8 col-sm-2">Practica3:</div>
            <div class="col-xs-8 col-sm-2"><input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="nota3"/></div>
        </div><br>
           <div class="row">
            <div class="col-xs-8 col-sm-2">Practica4:</div>
            <div class="col-xs-8 col-sm-2"><input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="nota4"/></div>
        </div><br>
        <div class="row">
            <div class="col-xs-8 col-sm-2">Examen Parcial: </div>
            <div class="col-xs-8 col-sm-2"><input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="exaparcial"/></div>
        </div><br>
        <div class="row">
            <div class="col-xs-8 col-sm-2">Examen Final: </div>
            <div class="col-xs-8 col-sm-2"><input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="exafinal"/></div>
        </div><br>
             <div class="row">
            <div class="col-xs-8 col-sm-2">Proyecto:</div>
            <div class="col-xs-8 col-sm-2"> <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type="text" name="proyecto"/></div>
        </div><br>


  

      <p><input type="submit"class="btn btn-success" value="PROCESAR"/></p>
    </form></center>
  
  
  <script src="bootstrap/js/jquery.js"></script>
    <script src="bootstrap/js/bootstrap.js"></script>
  </body>
</html>
