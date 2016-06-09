package pe.egcc.servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.egcc.domain.BeanRpta;
import pe.egcc.domain.Cliente;
import pe.egcc.domain.Empleado;
import pe.egcc.service.EurekaService;

@WebServlet({"/AddParametro", "/ClienteConsultar",
  "/Logon", "/CuentaDeposito"})
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
    } else if (path.equals("/Logon")) {
      logon(request, response);
    } else if (path.equals("/CuentaDeposito")) {
      cuentaDeposito(request, response);
    }

  }

  private void addParametro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String msg;
    try {
      // Datos
      String codigo = request.getParameter("codigo");
      String descripcion = request.getParameter("descripcion");
      String valor = request.getParameter("valor");
      // Proceso
      es.addParametro(codigo, descripcion, valor);
      // Salida
      msg = "Proceso ok.";
    } catch (Exception e) {
      msg = e.getMessage();
    }
    // Response
    response.setHeader("Content-Type", "text/plain");
    PrintWriter out = response.getWriter();
    out.println(msg);
    out.flush();
  }

  private void clienteConsultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    BeanRpta bean = new BeanRpta();
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
      Gson gson = new Gson();
      bean.setCode(1);
      bean.setTexto(gson.toJson(lista));
    } catch (Exception e) {
      bean.setCode(-1);
      bean.setTexto(e.getMessage());
    }
    enviarJson(response, bean);
  }

  private void logon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String destino;
    try {
      // Datos
      String usuario = request.getParameter("usuario");
      String clave = request.getParameter("clave");
      // Proceso
      Empleado bean = es.validar(usuario, clave);
      if (bean == null) {
        throw new RuntimeException("Datos incorrectos.");
      }
      HttpSession session = request.getSession();
      session.setAttribute("usuario", bean);
      destino = "main.jsp";
    } catch (Exception e) {
      destino = "index.jsp";
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher(destino);
    rd.forward(request, response);
  }

  private void cuentaDeposito(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {
    String cuenta = "";
    double importe = 0.0;
    try {
      // Datos
      cuenta = request.getParameter("cuenta");
      importe = Double.parseDouble(request.getParameter("importe"));
      // Empleado
      HttpSession session = request.getSession();
      Empleado bean = (Empleado) session.getAttribute("usuario");
      // Proceso
      es.procDeposito(cuenta, importe, bean.getCodigo());
      // Final
      request.setAttribute("mensaje", "Proceso ejecutado correctamente.");
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
      request.setAttribute("cuenta", cuenta);
      request.setAttribute("importe", importe);
    }
    // Forward
    RequestDispatcher rd = request.getRequestDispatcher("demo003.jsp");
    rd.forward(request, response);
  }

  private void enviarJson(HttpServletResponse response, BeanRpta bean) throws IOException {
    response.setContentType("application/json");
    //response.setContentType("text/plain");
    PrintWriter out = response.getWriter();
    Gson gson = new Gson();
    out.println(gson.toJson(bean));
    out.flush();
  }

}
