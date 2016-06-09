<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript" src="jquery/jquery-2.2.4.min.js"></script>
    <title>JSP Page</title>
  </head>
  <body>
    <jsp:include page="cabecera.jsp" />
    <h1>CONSULTA DE CLIENTES</h1>
    <form id="form1">
      <table>
        <tr>
          <td>CODIGO</td>
          <td>PATERNO</td>
          <td>MATERNO</td>
          <td>NOMBRE</td>
          <td></td>
        </tr>
        <tr>
          <td><input type="text" name="codigo"/></td>
          <td><input type="text" name="paterno"/></td>
          <td><input type="text" name="materno"/></td>
          <td><input type="text" name="nombre"/></td>
          <td><input type="button" id="btnConsultar" value="Consultar" /></td>
        </tr>
      </table>
    </form>
    
    <div id="divRpta"></div>
          
          
          
          
    <c:if test="${lista != null}">
      <h2>RESULTADO</h2>
      

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
  <script type="text/javascript">
    
    $("#btnConsultar").click(function(){
      var data = $("#form1").serialize();
      $.post("ClienteConsultar",data,function(obj){

        if(obj.code === -1){
          var textHTML = "<p style='color:red;'>" + obj.texto + "</p>";
          $("#divRpta").html(textHTML);
          return;
        } 
        
        var arreglo = jQuery.parseJSON( obj.texto );
                
        var textHTML = "<h2>RESULTADO</h2>";
        textHTML += "<table border='1'><tr><th>CODIGO</th>";
        textHTML += "<th>PATERNO</th><th>MATERNO</th><th>NOMBRE</th>";
        textHTML += "<th>DNI</th><th>CIUDAD</th><th>EMAIL</th></tr>";
        
        $.each(arreglo, function( index, clie ) {
          textHTML += "<tr><td>" + clie.codigo + "</td>";
          textHTML += "<td>" + clie.paterno + "</td>";
          textHTML += "<td>" + clie.materno + "</td>";
          textHTML += "<td>" + clie.nombre + "</td>";
          textHTML += "<td>" + clie.dni + "</td>";
          textHTML += "<td>" + clie.ciudad + "</td>";
          textHTML += "<td>" + clie.email + "</td></tr>";
        });
        
        textHTML += "</table>";
        $("#divRpta").html(textHTML);
      });
    });
        
  </script>
</html>
