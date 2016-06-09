package pe.egcc.demo.servlets;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import pe.egcc.demo.model.EurekaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
@WebListener()
public class SessionListener implements HttpSessionListener {

  @Override
  public void sessionCreated(HttpSessionEvent event) {
    try {
      EurekaModel model = new EurekaModel();
      event.getSession().setAttribute("sucursales", model.cosultarSucursales());
    } catch (Exception e) {
    }
  }

  @Override
  public void sessionDestroyed(HttpSessionEvent event) {
  }
}
