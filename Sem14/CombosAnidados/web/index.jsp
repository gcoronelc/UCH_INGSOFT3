<%-- 
    Document   : index
    Created on : 28/05/2014, 06:29:52 PM
    Author     : Gustavo coronel
    Blog       : gcoronelc.blogspot.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>COMBOS ANIDADOS</title>
  </head>
  <body>
    <h1>COMBOS ANIDADOS</h1>
    <form id="form">
      <label>Sucursal</label><br/>
      <select id="cboSucursal">
        <option value="000">[Seleccione sucursal]</option>
        <c:forEach items="${sessionScope.sucursales}" var="rec">
          <option value="${rec.codigo}">${rec}</option>
        </c:forEach>
      </select><br/>
      <label>Cuenta</label><br/>
      <select id="cboCuenta">
      </select><br/>
    </form>
  </body>
  <script type="text/javascript" src="jquery/jquery-2.1.1.min.js"></script>
  <script type="text/javascript">
    $("#cboSucursal").change(function() {
      var cboCuenta = $("#cboCuenta");
      cboCuenta.empty();
      var sucursal = $("#cboSucursal").val();
      if (sucursal == '000') {
        return;
      }
      var data = "sucursal=" + sucursal;
      cboCuenta.append('<option value="">Cargando...</option>').val('');
      $.post("TraerCuentas", data, function(objJson) {
        cboCuenta.empty();
        if (objJson.rpta == -1) {
          alert(objJson.mensaje);
          return;
        }
        var lista = objJson.lista;
        if(lista.length > 0){
          cboCuenta.append("<option value='0'>[Seleccione cuenta]</option>");
        } else {
          cboCuenta.append("<option value='0'>[No hay cuentas]</option>");
        }
        for (var i = 0; i < lista.length; i++) {
          var item = "<option value='" + lista[i].cuenta + "'>" + lista[i].descripcion + "</option>";
          cboCuenta.append(item);
        }
      });
    });
    $("#cboCuenta").change(function() {
      var cuenta = $("#cboCuenta").val();
      if(cuenta=="0"){
        return;
      }
      alert("Cuenta: " + cuenta);
    });
  </script>
</html>
