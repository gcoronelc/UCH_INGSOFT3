package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.dto.Producto;

/**
 *
 * @author docente
 */
@WebServlet(name = "ProductoController",
        urlPatterns = {"/GetProducto", "/GetProductos"})
public class ProductoController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String path = request.getServletPath();
    if (path.equals("/GetProducto")) {
      getProducto(request, response);
    } else if (path.equals("/GetProductos")) {
      getProductos(request, response);
    }

  }

  private void getProducto(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    Producto bean = new Producto("Coca Cola", 3.0, 1000);

    request.setAttribute("panchito", bean);
    RequestDispatcher rd = request.getRequestDispatcher("verProducto.jsp");
    rd.forward(request, response);
  }

  private void getProductos(HttpServletRequest request, HttpServletResponse response) 
          throws ServletException, IOException {

    List<Producto> lista = new ArrayList<>();
    lista.add(new Producto("Coca Cola", 3.0, 500));
    lista.add(new Producto("Inka Cola", 4.0, 1000));
    lista.add(new Producto("Agua Vida", 2.0, 800));
    lista.add(new Producto("Agua Cielo", 5.0, 5000));

    request.setAttribute("lista", lista);
    RequestDispatcher rd = request.getRequestDispatcher("verProductos.jsp");
    rd.forward(request, response);

  }

}
