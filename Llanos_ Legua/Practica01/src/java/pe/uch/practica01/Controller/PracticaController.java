
package pe.uch.practica01.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.uch.practica01.Dto.PracticaDto;
import pe.uch.practica01.Model.PracticaModel;



@WebServlet(name = "PracticaController", urlPatterns = {"/PracticaController"})
public class PracticaController extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    // Datos
        
    PracticaDto pracDto = new PracticaDto();
    pracDto.setLectura1(Integer.parseInt(request.getParameter("Lectura1")));
    pracDto.setLectura2(Integer.parseInt(request.getParameter("Lectura2")));
  
    // Proceso
    PracticaModel pracModel = new PracticaModel();
    pracModel.procesar(pracDto);
    
    // Forward
    request.setAttribute("pracDto", pracDto);
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  
}
}
