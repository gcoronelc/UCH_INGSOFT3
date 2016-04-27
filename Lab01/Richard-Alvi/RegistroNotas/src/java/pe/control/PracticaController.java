/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.dto.Practica;
import pe.model.PracticaModel;


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
 *
 * @author user
 */
@WebServlet(name = "PracticaController", urlPatterns = {"/AgregarPrac","/PracticaListar","/Reportes"})
public class PracticaController extends HttpServlet {

     @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {

    String path = request.getServletPath();

    if (path.equals("/AgregarPrac")) {
      AgregarPrac(request, response);
    }
    else if(path.equals("/PracticaListar")){
        PracticaListar(request,response);
    }
    else if(path.equals("/Reportes")){
        Reportes(request,response);
    }
  }

    private void AgregarPrac(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String nombre=request.getParameter("nombre");
    int p1 = Integer.parseInt(request.getParameter("p1"));
    int p2 = Integer.parseInt(request.getParameter("p2"));
    int p3 = Integer.parseInt(request.getParameter("p3"));
    int p4 = Integer.parseInt(request.getParameter("p4"));
       int par = Integer.parseInt(request.getParameter("par"));
    int fi = Integer.parseInt(request.getParameter("fi"));
    int pro = Integer.parseInt(request.getParameter("pro"));
    // Proceso
    Practica dto =new Practica(nombre,p1, p2, p3, p4,par,fi,pro,0,0);
   
    HttpSession session = request.getSession();
    if (session.getAttribute("practica") == null) {
     
      session.setAttribute("practica", new PracticaModel());
    }
    PracticaModel practica;
    practica=(PracticaModel)session.getAttribute("practica");
    
   practica.agregarItem(dto);
    // forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("AgregarPracticas.jsp");
    rd.forward(request, response);
    
    
    
    }

    private void PracticaListar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 HttpSession session = request.getSession();
    if (session.getAttribute("practica") == null) {
      
      session.setAttribute("practica", new PracticaModel());
    }
       PracticaModel practica;
    practica=(PracticaModel)session.getAttribute("practica");
    // forward
    request.setAttribute("lista", practica.getLista());

    RequestDispatcher rd;
    rd = request.getRequestDispatcher("listado.jsp");
    rd.forward(request, response);
    
    
    }

    private void Reportes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 HttpSession session = request.getSession();
    if (session.getAttribute("practica") == null) {
      
      session.setAttribute("practica", new PracticaModel());
    }
       PracticaModel practica;
    practica=(PracticaModel)session.getAttribute("practica");
    // forward
  
     request.setAttribute("mayorpromedio", practica.mayorPromedio());
   request.setAttribute("menorpromedio", practica.menorPromedio());
    request.setAttribute("aprobados", practica.aprobados());
     request.setAttribute("desaprobados", practica.desaprobados());
  
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("Reportes.jsp");
    rd.forward(request, response); 
    
    }
}
