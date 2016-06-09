package pe.egcc.demo.prueba;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.egcc.demo.model.EurekaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    EurekaModel model = new EurekaModel();
    List<Map<String,?>> lista = model.consultarCuentas("001");
    Map<String,Object> rpta = new HashMap<String, Object>();
    rpta.put("rpta", "1");
    rpta.put("lista", lista);
    Gson gson = new Gson();
    String texto = gson.toJson(rpta);
    System.out.println(texto);
  }
}
