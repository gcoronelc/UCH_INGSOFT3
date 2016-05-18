package pe.egcc.prueba;

import java.util.List;
import pe.egcc.dao.EurekaDao;
import pe.egcc.domain.Cliente;

public class Prueba02 {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();

    cliente.setCodigo("");
    cliente.setPaterno("R");
    cliente.setMaterno("");
    cliente.setNombre("E");

    EurekaDao dao = new EurekaDao();
    List<Cliente> lista = dao.getClientes(cliente);

    for (Cliente bean : lista) {
      System.out.println(bean.getCodigo() + " | "
              + bean.getPaterno() + " | "
              + bean.getMaterno() + " | "
              + bean.getNombre() + " | ");
    }

  }

}
