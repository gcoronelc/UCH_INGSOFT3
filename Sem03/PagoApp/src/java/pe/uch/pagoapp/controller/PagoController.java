package pe.uch.pagoapp.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.uch.pagoapp.dto.PagoDto;
import pe.uch.pagoapp.model.PagoModel;


@WebServlet(name = "PagoController", 
        urlPatterns = {"/PagoController"})
public class PagoController extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
  
    // Datos
    PagoDto pagoDto = new PagoDto();
    pagoDto.setHorasDia(
      Integer.parseInt(request.getParameter("horasDia")));
    pagoDto.setDias(
      Integer.parseInt(request.getParameter("dias")));
    pagoDto.setPagoHora(
      Double.parseDouble(request.getParameter("pagoHora")));
    
    // Proceso
    PagoModel pagoModel = new PagoModel();
    pagoModel.procesar(pagoDto);
    
    // Forward
    request.setAttribute("pagoDto", pagoDto);
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

}
