package pe.egcc.demo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 */
public final class AccesoDB {

  private AccesoDB() {
  }
  
  public static Connection getConnection() throws SQLException{
    Connection cn = null;
    try {
      // Datos MySQL
      String driver = "com.mysql.jdbc.Driver";
      String url = "jdbc:mysql://localhost/eurekabank";
      String user = "eureka";
      String pass = "admin";
      // Cargar el driver a memoria
      Class.forName(driver).newInstance();
      // Obtener el objeto Connection
      cn = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
      throw e;
    } catch (ClassNotFoundException ex) {
      throw new SQLException("No se encontró el driver de la base de dato.");
    } catch( Exception e){
      throw new SQLException("No se puede acceder a la base de datos.");
    }
    return cn;
  }
  
}
