<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="jquery/jquery-2.2.4.min.js"></script>
    <title>JSP Page</title>
  </head>
  <body>
    <jsp:include page="cabecera.jsp" />
    <h1>REGISTRAR DEPOSITO</h1>
    
    <div id="divMsg">Aqui se mostrara el mensaje</div>
    
    <form id="form1">
      <table>
        <tr>
          <td>Cuenta</td>
          <td><input type="text" name="cuenta"/></td>
          <td></td>
        </tr>
        <tr>
          <td>Importe</td>
          <td><input type="text" name="importe"/></td>
          <td><input type="button" id="btnProcesar" value="Procesar" /></td>
        </tr>
      </table>
    </form>
    
    <script type="text/javascript">
      $("#btnProcesar").click(function(){
        var data = $("#form1").serialize();
        $.post("CuentaDeposito",data,function(obj){
          var textHTML = "";
          if(obj.code === 1){
            textHTML = "<p style='color:blue;'>" + obj.texto + "</p>";
          } else {
            textHTML = "<p style='color:red;'>" + obj.texto + "</p>";
          }
          $("#divMsg").html(textHTML);
        });
      });
    </script>
  </body>
</html>
