package pe.egcc.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.egcc.dto.ItemDto;
import pe.egcc.model.CarritoModel;

@WebServlet(name = "CarritoController",
        urlPatterns = {"/CarritoAgregar", "/CarritoListar", 
          "/CarritoReset", "/SessionReset"})
public class CarritoController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/CarritoAgregar")) {
      carritoAgregar(request, response);
    } else if (path.equals("/CarritoListar")) {
      carritoListar(request, response);
    } else if (path.equals("/CarritoReset")) {
      carritoReset(request, response);
    } else if (path.equals("/SessionReset")) {
      sessionReset(request, response);
    }

  }

  private void carritoAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String producto = request.getParameter("producto");
    double precio = Double.parseDouble(request.getParameter("precio"));
    int cant = Integer.parseInt(request.getParameter("cant"));
    // Proceso
    ItemDto dto = new ItemDto(producto, precio, cant, 0);
    HttpSession session = request.getSession();
    if (session.getAttribute("carrito") == null) {
      System.err.println("EGCC: Carrito desde agregar");
      session.setAttribute("carrito", new CarritoModel());
    }
    CarritoModel carrito;
    carrito = (CarritoModel) session.getAttribute("carrito");
    carrito.agregarItem(dto);
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("agregar.jsp");
    rd.forward(request, response);

  }

  private void carritoListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("carrito") == null) {
       System.err.println("EGCC: Carrito desde listar");
      session.setAttribute("carrito", new CarritoModel());
    }
    CarritoModel carrito;
    carrito = (CarritoModel) session.getAttribute("carrito");
    // forward
    request.setAttribute("lista", carrito.getLista());
    request.setAttribute("total", carrito.getTotal());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
  }

  private void carritoReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
     System.err.println("EGCC: Carrito desde reset");
    HttpSession session = request.getSession();
    session.setAttribute("carrito", new CarritoModel());
    CarritoModel carrito;
    carrito = (CarritoModel) session.getAttribute("carrito");
    // forward
    request.setAttribute("lista", carrito.getLista());
    request.setAttribute("total", carrito.getTotal());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
  }

  private void sessionReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Limpiar session
    request.getSession().invalidate();
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
  }

}
