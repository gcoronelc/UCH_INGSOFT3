package pe.jads.uch.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.jads.uch.dto.*;

import pe.jads.uch.model.notasModel;

@WebServlet(name = "NotasController",
        urlPatterns = {"/AgregarNotas", "/Listar", "/Estadistica"})

public class notasController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath();

        if (path.equals("/AgregarNotas")) {
            agregarNotas(request, response);
        } else if (path.equals("/Listar")) {
            listarNotas(request, response);
        } else if (path.equals("/Estadistica")) {
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
        int exfinal = Integer.parseInt(request.getParameter("final"));
        int proyecto = Integer.parseInt(request.getParameter("proyecto"));

        // Proceso
       notasinv not = new notasinv(n1, n2, n3, n4);
        notasDto dto = new notasDto(0, alumno, curso, not, 0, parcial, exfinal, proyecto, 0);
        HttpSession session = request.getSession();
        if (session.getAttribute("almuno") == null) {
          
            session.setAttribute("almuno", new notasModel());
        }
        notasModel notas;
        notas = (notasModel) session.getAttribute("almuno");
        notas.agregarNota(dto);

        // forward
        request.setAttribute("lista", notas.getLista());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("agregar.jsp");
        rd.forward(request, response);
    }

    private void listarNotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        HttpSession session = request.getSession();
        if (session.getAttribute("almuno") == null) {
            
            session.setAttribute("almuno", new notasModel());
        }
        notasModel notas;
        notas = (notasModel) session.getAttribute("almuno");

        //forward
        request.setAttribute("lista", notas.getLista());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("lista.jsp");
        rd.forward(request, response);
    }

    private void Estadistica(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        HttpSession session = request.getSession();
        if (session.getAttribute("almuno") == null) {
         
            session.setAttribute("almuno", new notasModel());
        }
        notasModel notas;
        notas = (notasModel) session.getAttribute("almuno");
        // forward
        request.setAttribute("MayorPromedio", notas.mayorPromedio());
        request.setAttribute("MenorPromedio", notas.menorPromedio());
        request.setAttribute("Aprobados", notas.Aprobados());
        request.setAttribute("Reprobados", notas.Reprobados());
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("estadistica.jsp");
        rd.forward(request, response);
    }
    
}
