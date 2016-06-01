package pe.egcc.service;

import java.util.List;
import pe.egcc.dao.EurekaDao;
import pe.egcc.domain.Cliente;
import pe.egcc.domain.Empleado;


public class EurekaService {

  private EurekaDao dao;

  public EurekaService() {
    dao = new EurekaDao();
  }
  
  
  public void addParametro(String codigo, String descripcion, String valor){
    dao.addParametro(codigo, descripcion, valor);
  }

  public List<Cliente> getClientes(Cliente cliente) {
    return dao.getClientes(cliente);
  }
  
   public Empleado validar(String usuario, String clave) {
     return dao.validar(usuario, clave);
   }
   
    public void procDeposito(String cuenta, double importe, String codEmp) {
      dao.procDeposito(cuenta, importe, codEmp);
    }
}
