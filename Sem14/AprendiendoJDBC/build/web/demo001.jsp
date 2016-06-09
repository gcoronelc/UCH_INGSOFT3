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
    <h1>Insertar Parametro</h1>
    <div id="divMsg"></div>
    <form id="form1" >
      <p>Codigo: <input type="text" name="codigo"/></p>
      <p>Descripcion: <input type="text" name="descripcion"/></p>
      <p>Valor: <input type="text" name="valor"/></p>
      <input type="button" id="btnProcesar" value="Procesar"/>
    </form>
    <script type="text/javascript">
      
      $("#btnProcesar").click(function(){
        var data = $("#form1").serialize();
        $.post("AddParametro",data,function(texto){
          $("#divMsg").html(texto);
        });
      });
      
      
    </script>
  </body>
</html>

