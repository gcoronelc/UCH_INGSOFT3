package pe.egcc.demo.prueba;

import java.util.Map;
import pe.egcc.demo.model.EurekaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    EurekaModel model = new EurekaModel();
    for(Map<String,?> rec: model.consultarCuentas("001")){
      System.out.println(rec.get("cuenta") + " => " + rec.get("descripcion"));
    }
  }
}
