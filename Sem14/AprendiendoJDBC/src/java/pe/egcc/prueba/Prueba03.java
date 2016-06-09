package pe.egcc.prueba;

import pe.egcc.dao.EurekaDao;

public class Prueba03 {

  public static void main(String[] args) {
    EurekaDao dao = new EurekaDao();
    try {
      dao.procDeposito("00100001", 1000.0, "0003");
      System.out.println("Proceso ok.");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
