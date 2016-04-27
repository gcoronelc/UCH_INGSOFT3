package pe.uch.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.uch.Dto.NotaDto;
import pe.uch.Model.NotaModel;

@WebServlet(name = "NotaController",
        urlPatterns = {"/NotaAgregar", "/NotaListar","/NotaEstadistica", 
          "/CarritoReset", "/SessionReset"})
public class NotaController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/NotaAgregar")) {
      notaAgregar(request, response);
    } else if (path.equals("/NotaListar")) {
      notaListar(request, response);
    }else if(path.equals("/NotaEstadistica")){
        notaEstadistica(request, response);
    }else if (path.equals("/CarritoReset")) {
      carritoReset(request, response);
    }else if (path.equals("/SessionReset")) {
      sessionReset(request, response);
    }

  }

  private void notaAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("app");
    int prac01 = Integer.parseInt(request.getParameter("prac01"));
    int prac02 = Integer.parseInt(request.getParameter("prac02"));
    int prac03 = Integer.parseInt(request.getParameter("prac03"));
    int prac04 = Integer.parseInt(request.getParameter("prac04"));
    int exapar = Integer.parseInt(request.getParameter("exapar"));
    int exafin = Integer.parseInt(request.getParameter("exafin"));
    int proyecto = Integer.parseInt(request.getParameter("pro"));
    /*if(precio<0 ){
       
    }else{*/
        // Proceso
    NotaDto dto = new NotaDto(nombre, apellido, prac01, prac02, prac03, prac04, exapar, exafin, proyecto, 0);
    HttpSession session = request.getSession();
    if (session.getAttribute("notas") == null) {
      System.err.println("EGCC: Carrito desde agregar");
      session.setAttribute("notas", new NotaModel());
    }
    NotaModel notas;
    notas = (NotaModel) session.getAttribute("notas");
    notas.agregarNotas(dto);
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("InsertarNota.jsp");
    rd.forward(request, response);
    
    //<p>Total: ${total}</p>}
    

  }

  private void notaListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("notas") == null) {
       System.err.println("EGCC: Carrito desde listar");
      session.setAttribute("notas", new NotaModel());
    }
    NotaModel notas;
    notas = (NotaModel) session.getAttribute("notas");
    // forward
    request.setAttribute("lista", notas.getListaNotas());
    /*request.setAttribute("total", notas.getTotal());
    request.setAttribute("dtoMayor", carrito.getVentaMayorImporte());
    request.setAttribute("dtoMenor", carrito.getVentaMenorImporte());*/
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listadoNota.jsp");
    rd.forward(request, response);
  }
   private void notaEstadistica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
    HttpSession session = request.getSession();
    if (session.getAttribute("notas") == null) {
       System.err.println("EGCC: Carrito desde listar");
      session.setAttribute("notas", new NotaModel());
    }
    NotaModel notas;
    notas = (NotaModel) session.getAttribute("notas");
    // forward
    request.setAttribute("dtoMayorPromedio", notas.getMayorPromedio());
    request.setAttribute("dtoMenorPromedio", notas.getMenorPromedio());
    request.setAttribute("dtoAprobados", notas.getEstudianteAprobado());
    request.setAttribute("dtoDesaprobados", notas.getEstudianteDesaprobados());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("estadisticaNota.jsp");
    rd.forward(request, response);
  }

 private void carritoReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Acceso al carrito
     System.err.println("EGCC: Carrito desde reset");
    HttpSession session = request.getSession();
    session.setAttribute("notas", new NotaModel());
    NotaModel notas;
    notas = (NotaModel) session.getAttribute("notas");
    // forward
    request.setAttribute("lista", notas.getListaNotas());
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listadoNota.jsp");
    rd.forward(request, response);
  }

  private void sessionReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Limpiar session
    request.getSession().invalidate();
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listadoNota.jsp");
    rd.forward(request, response);
  }

}
