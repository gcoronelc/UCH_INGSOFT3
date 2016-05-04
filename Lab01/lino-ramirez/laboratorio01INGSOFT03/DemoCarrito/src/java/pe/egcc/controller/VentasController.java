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
import pe.egcc.model.VentasModel;

@WebServlet(name = "VentasController",
        urlPatterns = {"/VentasAgregar", "/VentasListar", 
          "/VentasReset", "/SessionReset"})
public class VentasController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/VentasAgregar")) {
      ventasAgregar(request, response);
    } else if (path.equals("/VentasListar")) {
      ventasListar(request, response);
    } else if (path.equals("/VentasReset")) {
      ventasReset(request, response);
    } else if (path.equals("/SessionReset")) {
      sessionReset(request, response);
    }

  }

  private void ventasAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String producto = request.getParameter("producto");
    String cliente = request.getParameter("cliente");
    double precio = Double.parseDouble(request.getParameter("precio"));
    int cant = Integer.parseInt(request.getParameter("cant"));
    // Proceso
    ItemDto dto = new ItemDto(producto, cliente, precio, cant, 0);
    HttpSession session = request.getSession();
    if (session.getAttribute("ventas") == null) {
      System.err.println("EGCC: Ventas desde agregar");
      session.setAttribute("ventas", new VentasModel());
    }
    VentasModel ventas;
    ventas = (VentasModel) session.getAttribute("ventas");
    ventas.agregarItem(dto);
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("agregar.jsp");
    rd.forward(request, response);

  }

  private void ventasListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al ventas
    HttpSession session = request.getSession();
    if (session.getAttribute("ventas") == null) {
       System.err.println("EGCC: Ventas desde listar");
      session.setAttribute("ventas", new VentasModel());
    }
    VentasModel ventas;
    ventas = (VentasModel) session.getAttribute("ventas");
    // forward
    request.setAttribute("lista", ventas.getLista());
    request.setAttribute("total", ventas.getTotal());
    request.setAttribute("dto", ventas.getMayorPrecio());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
  }

  private void ventasReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al ventas
     System.err.println("EGCC: Ventas desde reset");
    HttpSession session = request.getSession();
    session.setAttribute("ventas", new VentasModel());
    VentasModel ventas;
    ventas = (VentasModel) session.getAttribute("ventas");
    // forward
    request.setAttribute("lista", ventas.getLista());
    request.setAttribute("total", ventas.getTotal());
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
