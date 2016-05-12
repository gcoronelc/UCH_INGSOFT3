package pe.egcc.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.service.EurekaService;

@WebServlet({"/AddParametro"})
public class EurekaController extends HttpServlet {

  private EurekaService es;

  @Override
  public void init() throws ServletException {
    es = new EurekaService();
  }

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String path = request.getServletPath();
    if (path.equals("/AddParametro")) {
      addParametro(request, response);
    }

  }

  private void addParametro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
      // Datos
      String codigo = request.getParameter("codigo");
      String descripcion = request.getParameter("descripcion");
      String valor = request.getParameter("valor");
      // Proceso
      es.addParametro(codigo, descripcion, valor);
      // Salida
      request.setAttribute("msg", "Proceso ok.");
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }

    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("demo001.jsp");
    rd.forward(request, response);
  }

}
