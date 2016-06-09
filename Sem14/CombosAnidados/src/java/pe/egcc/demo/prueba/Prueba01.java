package pe.egcc.demo.prueba;

import pe.egcc.demo.domain.Sucursal;
import pe.egcc.demo.model.EurekaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba01 {
  public static void main(String[] args) {
    EurekaModel model = new EurekaModel();
    for (Sucursal bean : model.cosultarSucursales()) {
      System.out.println(bean.getCodigo() + " | " + bean.getNombre());
    }
  }
}
