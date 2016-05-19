package pe.egcc.prueba;

import java.sql.Connection;
import pe.egcc.db.AccesoDB;

public class Prueba01 {

  public static void main(String[] args) {
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("Bien.");
      cn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
