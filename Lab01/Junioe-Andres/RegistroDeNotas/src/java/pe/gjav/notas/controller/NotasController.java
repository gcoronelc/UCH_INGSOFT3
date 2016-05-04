package pe.gjav.notas.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.gjav.notas.dto.NotasDto;
import pe.gjav.notas.dto.Practicas;
import pe.gjav.notas.model.NotasModel;

@WebServlet(name = "NotasController",
        urlPatterns = {"/AgregarNotas", "/ListarNotas", "/EstadisticaNota"})

public class NotasController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath();

        if (path.equals("/AgregarNotas")) {
            agregarNotas(request, response);
        } else if (path.equals("/ListarNotas")) {
            listarNotas(request, response);
        } else if (path.equals("/EstadisticaNota")) {
            Estadistica(request, response);
        }
    }

    private void agregarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Datos
        String alumno = request.getParameter("alumno");
        String curso = request.getParameter("curso");
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        int n3 = Integer.parseInt(request.getParameter("n3"));
        int n4 = Integer.parseInt(request.getParameter("n4"));
        int parcial = Integer.parseInt(request.getParameter("parcial"));
        int efinal = Integer.parseInt(request.getParameter("final"));
        int proyecto = Integer.parseInt(request.getParameter("proyecto"));

        // Proceso
        Practicas p = new Practicas(n1, n2, n3, n4);
        NotasDto dto = new NotasDto(0, alumno, curso, p, 0, parcial, efinal, proyecto, 0);

        HttpSession session = request.getSession();
        if (session.getAttribute("carrito") == null) {
            System.err.println("EGCC: Carrito desde agregar");
            session.setAttribute("carrito", new NotasModel());
        }
        NotasModel notas;
        notas = (NotasModel) session.getAttribute("carrito");
        notas.agregarNota(dto);

        // forward
        request.setAttribute("lista", notas.getLista());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("agregar.jsp");
        rd.forward(request, response);
    }

    private void listarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Acceso al carrito
        HttpSession session = request.getSession();
        if (session.getAttribute("carrito") == null) {
            System.err.println("EGCC: Carrito desde listar");
            session.setAttribute("carrito", new NotasModel());
        }
        NotasModel notas;
        notas = (NotasModel) session.getAttribute("carrito");

        //forward
        request.setAttribute("lista", notas.getLista());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("listado.jsp");
        rd.forward(request, response);
    }

    private void Estadistica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Acceso al carrito
        HttpSession session = request.getSession();
        if (session.getAttribute("carrito") == null) {
            System.err.println("EGCC: Carrito desde listar");
            session.setAttribute("carrito", new NotasModel());
        }
        NotasModel notas;
        notas = (NotasModel) session.getAttribute("carrito");
        // forward
        request.setAttribute("MayorPromedio", notas.mayorPromedio());
        request.setAttribute("MenorPromedio", notas.menorPromedio());
        request.setAttribute("Aprobados", notas.Aprobados());
        request.setAttribute("Reprobados", notas.Reprobados());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("Estadistica.jsp");
        rd.forward(request, response);
    }

}
