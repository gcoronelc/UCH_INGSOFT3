package pe.egcc.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.domain.Cliente;
import pe.egcc.service.EurekaService;

@WebServlet({"/AddParametro", "/ClienteConsultar"})
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
    } else if (path.equals("/ClienteConsultar")) {
      clienteConsultar(request, response);
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

  private void clienteConsultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
      // Datos
      Cliente cliente = new Cliente();
      cliente.setCodigo(request.getParameter("codigo"));
      cliente.setPaterno(request.getParameter("paterno"));
      cliente.setMaterno(request.getParameter("materno"));
      cliente.setNombre(request.getParameter("nombre"));
      // Proceso
      List<Cliente> lista = es.getClientes(cliente);
      // Salida
      request.setAttribute("lista", lista);
      request.setAttribute("bean", cliente);
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }

    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("demo002.jsp");
    rd.forward(request, response);
  }

}
