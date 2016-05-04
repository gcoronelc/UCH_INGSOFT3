package pe.omv.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.omv.dto.AlumnoDto;
import pe.omv.model.AlumnoModel;

@WebServlet(name = "AlumnoController",
        urlPatterns = {"/AlumnoAgregar", "/AlumnoListar", "/AlumnoReset","/Reporte"})
public class AlumnoController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath();

        if (path.equals("/AlumnoAgregar")) {
            AlumnoAgregar(request, response);
        } else if (path.equals("/AlumnoListar")) {
            AlumnoListar(request, response);
        } else if (path.equals("/AlumnoReset")) {
            AlumnoReset(request, response);
        } else if (path.equals("/Reporte")) {
            reporte(request, response);
        }

    }

    private void AlumnoAgregar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Datos
        String nombre = request.getParameter("nombre");
        String curso = request.getParameter("curso");
        double practica1 = Double.parseDouble(request.getParameter("practica1"));
        double practica2 = Double.parseDouble(request.getParameter("practica2"));
        double practica3 = Double.parseDouble(request.getParameter("practica3"));
        double practica4 = Double.parseDouble(request.getParameter("practica4"));
        double examenparcial = Double.parseDouble(request.getParameter("parcial"));
        double examenfinal = Double.parseDouble(request.getParameter("final"));
        double proyecto = Double.parseDouble(request.getParameter("proyecto"));
        
         // Proceso
        AlumnoDto dto = new AlumnoDto(nombre, curso, practica1,practica2,practica3,practica4,examenparcial,examenfinal,proyecto,0,0);
        HttpSession session = request.getSession();
        if (session.getAttribute("alu") == null) {
            session.setAttribute("alu", new AlumnoModel());
        }
        AlumnoModel al;
        al = (AlumnoModel) session.getAttribute("alu");
        al.promedioPracticasMax(dto);
        al.promedioTotal(dto);
        // forward
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("agregar.jsp");
        rd.forward(request, response);

    }

private void AlumnoListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Acceso al carrito
        HttpSession session = request.getSession();
        if (session.getAttribute("alu") == null) {
            session.setAttribute("alu", new AlumnoModel());
        }
        AlumnoModel carrito;
        carrito = (AlumnoModel) session.getAttribute("alu");
        // forward
        request.setAttribute("lista", carrito.getLista());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("listado.jsp");
        rd.forward(request, response);
    }

    private void AlumnoReset(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Acceso al carrito
        HttpSession session = request.getSession();
        session.setAttribute("alu", new AlumnoModel());
        AlumnoModel carrito;
        carrito = (AlumnoModel) session.getAttribute("alu");
        // forward
        request.setAttribute("lista", carrito.getLista());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("listado.jsp");
        rd.forward(request, response);
    }

  private void reporte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Acceso al carrito
        HttpSession session = request.getSession();
        if (session.getAttribute("alu") == null) {
            session.setAttribute("alu", new AlumnoModel());
        }
        AlumnoModel carrito;
        carrito = (AlumnoModel) session.getAttribute("alu");
         // forward
        request.setAttribute("MayorpromedioTotal", carrito.PromedioMayor());
        request.setAttribute("MenorpromedioTotal", carrito.PromedioMenor());
        request.setAttribute("aprobados", carrito.Aprobados());
        request.setAttribute("desaprobados", carrito.Desaprobados());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("reporte.jsp");
        rd.forward(request, response);
    }

}
