package pe.egcc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.db.AccesoDB;
import pe.egcc.domain.Cliente;

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
  
  /**
   * Permite buscar clientes por codigo, nombre, paterno y materno.
   * 
   * @param cliente Se utiliza un parametro de tipo Cliente para comunicar los criterios de busqueda.
   * @return Retorna una lista de objetos de tipo Cliente.
   */
  public List<Cliente> getClientes(Cliente cliente){
    List<Cliente> lista = new ArrayList();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno,"
              + "vch_cliematerno, vch_clienombre,"
              + "chr_cliedni, vch_clieciudad,"
              + "vch_cliedireccion, vch_clietelefono,"
              + "vch_clieemail from cliente "
              + "where chr_cliecodigo like concat(?,'%') "
              + "and vch_cliepaterno like concat(?,'%') "
              + "and vch_cliematerno like concat(?,'%') "
              + "and vch_clienombre like concat(?,'%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cliente.getCodigo());
      pstm.setString(2, cliente.getPaterno());
      pstm.setString(3, cliente.getMaterno());
      pstm.setString(4, cliente.getNombre());
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        Cliente bean = new Cliente();
        bean.setCodigo(rs.getString("chr_cliecodigo"));
        bean.setPaterno(rs.getString("vch_cliepaterno"));
        bean.setMaterno(rs.getString("vch_cliematerno"));
        bean.setNombre(rs.getString("vch_clienombre"));
        bean.setDni(rs.getString("chr_cliedni"));
        bean.setCiudad(rs.getString("vch_clieciudad"));
        bean.setDireccion(rs.getString("vch_cliedireccion"));
        bean.setTelefono(rs.getString("vch_clietelefono"));
        bean.setEmail(rs.getString("vch_clieemail"));
        lista.add(bean);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException("Error al consultar clientes.");
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }
  
}
