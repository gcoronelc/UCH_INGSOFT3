package pe.app.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.app.dto.ConsumoDto;
import pe.app.model.ConsumoModel;


@WebServlet(name = "ConsumoController", urlPatterns = {"/ConsumoController"})
public class ConsumoController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        //Datos
        ConsumoDto consumoDto = new ConsumoDto();
        consumoDto.setLectura1(Integer.parseInt(request.getParameter("lectura1")));
        consumoDto.setLectura2(Integer.parseInt(request.getParameter("lectura2")));
        
        //Proceso
        ConsumoModel consumoModel = new ConsumoModel();
        consumoModel.procesar(consumoDto);
        
        //Forward
        request.setAttribute("consumoDto", consumoDto);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("index.jsp");        
        rd.forward(request,response);
    }

    

}
