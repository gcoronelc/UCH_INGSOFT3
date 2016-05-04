package pe.promedio.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.promedio.dto.NotasDto;
import pe.promedio.model.PromedioModel;



@WebServlet(name = "PromedioController",
        urlPatterns = {"/PromedioAgregar", "/PromedioListar", 
          "/PromedioReset", "/PromedioReset", "/estadistica"})
public class PromedioController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/PromedioAgregar")) {
      promedioAgregar(request, response);
    } else if (path.equals("/PromedioListar")) {
      promedioListar(request, response);
    } else if (path.equals("/PromedioReset")) {
      promedioReset(request, response);
    } else if (path.equals("/SessionReset")) {
      sessionReset(request, response);
    }
    else if (path.equals("/estadistica")) {
      estadistica(request, response);
    }

  }

  private void promedioAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String alumno = request.getParameter("alumno");
    double nota1 = Double.parseDouble(request.getParameter("nota1"));
    double nota2 = Double.parseDouble(request.getParameter("nota2"));
    double nota3 = Double.parseDouble(request.getParameter("nota3"));
    double nota4 = Double.parseDouble(request.getParameter("nota4"));
    //double promedio = Double.parseDouble(request.getParameter("promedio"));
    double exaparcial= Double.parseDouble(request.getParameter("exaparcial"));
    double exafinal= Double.parseDouble(request.getParameter("exafinal"));
    double proyecto= Double.parseDouble(request.getParameter("proyecto"));
    
    
    // Proceso
    NotasDto dto = new NotasDto(alumno,nota1,nota2,nota3,nota4,0,exaparcial,exafinal,proyecto);
    HttpSession session = request.getSession();
    if (session.getAttribute("registro") == null) {
      System.err.println("EGCC: Promedio desde agregar");
      session.setAttribute("registro", new PromedioModel());
    }
    PromedioModel promedios;
    promedios = (PromedioModel) session.getAttribute("registro");
    promedios.agregarNota(dto);
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("agregar.jsp");
    rd.forward(request, response);

  }

  private void promedioListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("registro") == null) {
       System.err.println("EGCC: Promedio desde listar");
      session.setAttribute("promedios", new PromedioModel());
    }
    PromedioModel promedios;
    promedios = (PromedioModel) session.getAttribute("registro");
    // forward
    request.setAttribute("lista", promedios.getLista());
    request.setAttribute("dtoMayor", promedios.getMayorPromedio());
    request.setAttribute("dtoMenor", promedios.getMenorPromedio());
    request.setAttribute("aprobado", promedios.getAprobado());
    request.setAttribute("desaprobado", promedios.getDesaprobado());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
  }

    private void estadistica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("registro") == null) {
       System.err.println("EGCC: Promedio desde listar");
      session.setAttribute("registro", new PromedioModel());
    }
    PromedioModel promedios;
    promedios = (PromedioModel) session.getAttribute("registro");
    // forward 
    request.setAttribute("dtoMayor", promedios.getMayorPromedio());
    request.setAttribute("dtoMenor", promedios.getMenorPromedio());
    request.setAttribute("aprobado", promedios.getAprobado());
    request.setAttribute("desaprobado", promedios.getDesaprobado());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("estadistica.jsp");
    rd.forward(request, response);
  }
  private void promedioReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
     System.err.println("EGCC: Carrito desde reset");
    HttpSession session = request.getSession();
    session.setAttribute("registro", new PromedioModel());
    PromedioModel promedios;
    promedios = (PromedioModel) session.getAttribute("registro");
    // forward
    request.setAttribute("lista", promedios.getLista());
    
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
