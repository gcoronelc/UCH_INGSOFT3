package pe.egcc.demo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.demo.database.AccesoDB;
import pe.egcc.demo.domain.Sucursal;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 */
public class EurekaModel {

  public List<Sucursal> cosultarSucursales() {
    List<Sucursal> lista = new ArrayList<Sucursal>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_sucucodigo, vch_sucunombre, vch_sucuciudad, "
              + "vch_sucudireccion, int_sucucontcuenta from sucursal";
      Statement stm = cn.createStatement();
      ResultSet rs = stm.executeQuery(sql);
      while (rs.next()) {
        Sucursal bean = new Sucursal();
        bean.setCodigo(rs.getString("chr_sucucodigo"));
        bean.setNombre(rs.getString("vch_sucunombre"));
        bean.setCiudad(rs.getString("vch_sucuciudad"));
        bean.setDireccion(rs.getString("vch_sucudireccion"));
        bean.setContCuenta(rs.getInt("int_sucucontcuenta"));
        lista.add(bean);
      }
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("No se tiene acceso a la base de datos.");
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }

  public List<Map<String, ?>> consultarCuentas(String codSucursal) {
    List<Map<String, ?>> lista = new ArrayList<Map<String, ?>>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection(); // Establece la conexión
      String sql = "select chr_cuencodigo, chr_monecodigo, dec_cuensaldo "
              + "from cuenta where chr_sucucodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codSucursal);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
        String cuenta = rs.getString("chr_cuencodigo");
        String moneda = rs.getString("chr_monecodigo");
        double saldo = rs.getDouble("dec_cuensaldo");
        Map<String, Object> rec = new HashMap<String, Object>();
        rec.put("cuenta", cuenta);
        rec.put("descripcion", "Cuenta: " + cuenta + " | "
                + "Moneda: " + moneda + " | " + "Saldo: " + saldo);
        lista.add(rec);
      }
      rs.close();
      pstm.close();
    } catch (SQLException e) {
      throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException("ERROR: ...");
    } finally {
      try {
        cn.close(); // Cierra la conexión
      } catch (Exception e) {
      }
    }
    return lista;
  }
}
