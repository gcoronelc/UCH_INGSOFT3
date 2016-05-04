/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.egcc.dto.AlumnoNotasDto;
import pe.egcc.model.AlumnoNotasModel;

@WebServlet(name = "AlumnoNotasController",
        urlPatterns = {"/AlumnoNotasAgregar", "/AlumnoNotasListar", 
          "/AlumnoNotasReporte"})
public class AlumnoNotasController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/AlumnoNotasAgregar")) {
      alumnoAgregar(request, response);
    } else if (path.equals("/AlumnoNotasListar")) {
      alumnoListar(request, response);
    } else if (path.equals("/AlumnoNotasReporte")) {
      alumnoReporte(request, response);    
    }
  }

  private void alumnoAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String nombre = request.getParameter("nombre");
    String curso= request.getParameter("curso");   
    int p1 = Integer.parseInt(request.getParameter("p1"));
    int p2 = Integer.parseInt(request.getParameter("p2"));
    int p3 = Integer.parseInt(request.getParameter("p3"));
    int p4 = Integer.parseInt(request.getParameter("p4"));
    int exparcial = Integer.parseInt(request.getParameter("parcial"));
    int exfinal = Integer.parseInt(request.getParameter("final"));
    int proyecto = Integer.parseInt(request.getParameter("proyecto"));
    // Proceso
      
      AlumnoNotasDto dto = new AlumnoNotasDto(nombre, curso, p1, p2, p3, p4, exparcial, exfinal,proyecto,0 );
      HttpSession session = request.getSession();
    if (session.getAttribute("alumno") == null) {
      System.err.println("EGCC: AlumnoNotas desde agregar");
      session.setAttribute("alumno", new AlumnoNotasModel());
    }
    AlumnoNotasModel alumno;
    alumno = (AlumnoNotasModel) session.getAttribute("alumno");
    alumno.agregarNota(dto);
    // forward
      RequestDispatcher rd;
    rd = request.getRequestDispatcher("agregar.jsp");
    rd.forward(request, response);

  }

  private void alumnoListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al alumno
    HttpSession session = request.getSession();
    if (session.getAttribute("alumno") == null) {
       System.err.println("EGCC: AlumnoNotas desde listar");
      session.setAttribute("alumno", new AlumnoNotasModel());
    }
    AlumnoNotasModel alumno;
    alumno = (AlumnoNotasModel) session.getAttribute("alumno");
    // forward
    request.setAttribute("lista", alumno.getLista());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listar.jsp");
    rd.forward(request, response);
  }

  private void alumnoReporte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al alumno    
     HttpSession session = request.getSession();
    if (session.getAttribute("alumno") == null) {
      session.setAttribute("alumno", new AlumnoNotasModel());
    }
    AlumnoNotasModel alumno;
    alumno = (AlumnoNotasModel) session.getAttribute("alumno");
    // forward
    request.setAttribute("mayorPromedio", alumno.mayorpromedio());
    request.setAttribute("menorPromedio", alumno.menorpromedio());
    request.setAttribute("aprobados", alumno.cantaprobados());
    request.setAttribute("desaprobados", alumno.cantdesaprobados());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("reporte.jsp");
    rd.forward(request, response);
  }

}
