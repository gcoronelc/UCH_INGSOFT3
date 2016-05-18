package pe.egcc.service;

import pe.egcc.dao.EurekaDao;


public class EurekaService {

  private EurekaDao dao;

  public EurekaService() {
    dao = new EurekaDao();
  }
  
  
  public void addParametro(String codigo, String descripcion, String valor){
    dao.addParametro(codigo, descripcion, valor);
  }
}
