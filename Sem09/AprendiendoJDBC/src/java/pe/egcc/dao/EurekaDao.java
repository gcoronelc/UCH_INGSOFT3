package pe.egcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import pe.egcc.db.AccesoDB;

public class EurekaDao {
  
  public void addParametro(String codigo, String descripcion, String valor){
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "insert into parametro(chr_paracodigo,"
              + "vch_paradescripcion,vch_paravalor,vch_paraestado) "
              + "values(?,?,?,?)";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      pstm.setString(2, descripcion);
      pstm.setString(3, valor);
      pstm.setString(4, "ACTIVO");
      pstm.executeUpdate();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }
  
  
}
