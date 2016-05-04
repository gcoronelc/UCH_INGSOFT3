package pe.egcc.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.egcc.dto.NotaDto;
import pe.egcc.model.NotaModel;

@WebServlet(name = "NotaController",
        urlPatterns = {"/alumnoAgregar", "/AlumnoListar", 
          "/NotasReset", "/SessionReset","/AlumnoReporte"})
public class NotaController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/alumnoAgregar")) {
      alumnoAgregar(request, response);
    } else if (path.equals("/AlumnoListar")) {
      AlumnoListar(request, response);
    } else if (path.equals("/NotasReset")) {
      notaReset(request, response);
    } else if (path.equals("/SessionReset")) {
      sessionReset(request, response);
    } else if (path.equals("/AlumnoReporte")) {
      AlumnoReporte(request, response);  
      } 
  }

  private void alumnoAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String alumno = request.getParameter("alumno");
    String curso=request.getParameter("curso");
    double n1 =  Double.parseDouble(request.getParameter("n1"));
    double n2 =  Double.parseDouble(request.getParameter("n2"));
    double n3 =  Double.parseDouble(request.getParameter("n3"));
    double n4 =  Double.parseDouble(request.getParameter("n4"));
    double exparcial =  Double.parseDouble(request.getParameter("exparcial"));
    double exfinal =  Double.parseDouble(request.getParameter("exfinal"));
    double proyecto =  Double.parseDouble(request.getParameter("proyecto"));
    
// Proceso
    NotaDto dto = new NotaDto(alumno,curso, n1, n2, n3, n4, exparcial, exfinal, proyecto,0);
    
    HttpSession session = request.getSession();
    if (session.getAttribute("nota") == null) {
      System.err.println("LO: Nota desde agregar");
      session.setAttribute("nota", new NotaModel());
    }
    NotaModel nota;
    nota = (NotaModel) session.getAttribute("nota");
    nota.agregarItem(dto);
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("agregar.jsp");
    rd.forward(request, response);

  }

  private void AlumnoListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("nota") == null) {
       System.err.println("LO: Nota desde listar");
      session.setAttribute("nota", new NotaModel());
    }
    NotaModel nota;
    nota = (NotaModel) session.getAttribute("nota");
    // forward   
    request.setAttribute("lista", nota.getLista());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
  }

  private void AlumnoReporte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("nota") == null) {
       System.err.println("LO: Nota desde reporte");
      session.setAttribute("nota", new NotaModel());
    }
    NotaModel nota;
    nota = (NotaModel) session.getAttribute("nota");
    // forward
   
   request.setAttribute("dtoMayor", nota.mayorPromedio());
   request.setAttribute("dtoMenor", nota.menorPromedio());
   request.setAttribute("dtoAprobados", nota.aprobados());
   request.setAttribute("dtoDesaprobados", nota.desaprobados());
    
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("reporte.jsp");
    rd.forward(request, response);
  }
  private void notaReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
     System.err.println("LO: Nota desde reset");
    HttpSession session = request.getSession();
    session.setAttribute("nota", new NotaModel());
    NotaModel nota;
    nota = (NotaModel) session.getAttribute("nota");
    // forward
    request.setAttribute("lista", nota.getLista());

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
