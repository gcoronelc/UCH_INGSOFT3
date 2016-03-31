package pe.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.app.dto.TablaDto;
import pe.app.model.TablaModel;


@WebServlet(name = "TablaController", urlPatterns = {"/TablaController"})
public class TablaController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        //Datos
        TablaDto tablaDto = new TablaDto();
        tablaDto.setNumero(Integer.parseInt(request.getParameter("numero")));
        
        //Proceso
        TablaModel tablaModel = new TablaModel();
        tablaModel.procesar(tablaDto);
        
        //Forward
        request.setAttribute("TablaDto", tablaDto);
        RequestDispatcher rd;
        rd = request.getRequestDispatcher("index.jsp");
        
        rd.forward(request,response);
    }

    

}
