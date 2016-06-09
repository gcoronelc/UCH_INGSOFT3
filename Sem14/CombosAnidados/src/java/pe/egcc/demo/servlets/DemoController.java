package pe.egcc.demo.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.demo.model.EurekaModel;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
@WebServlet(name = "DemoController", urlPatterns = {"/TraerCuentas"})
public class DemoController extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();
    Map<String, Object> rpta = new HashMap<String, Object>();
    try {
      // La siguiente línea es para poder apreciar el efecto AJAX.
      Thread.currentThread().sleep(2000);
      // Dato
      String sucursal = request.getParameter("sucursal");
      // Proceso
      EurekaModel model = new EurekaModel();
      List<Map<String, ?>> lista = model.consultarCuentas(sucursal);
      rpta.put("rpta", "1");
      rpta.put("lista", lista);
    } catch (Exception e) {
      rpta.put("rpta", "-1");
      rpta.put("mensaje", e.getMessage());
    }
    Gson gson = new Gson();
    out.print(gson.toJson(rpta));
    out.flush();
    out.close();
  }

}
