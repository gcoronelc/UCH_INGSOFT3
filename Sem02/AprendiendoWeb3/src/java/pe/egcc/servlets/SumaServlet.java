package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.service.MateService;

public class SumaServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Datos
    int n1, n2, suma;
    // Datos
    n1 = Integer.parseInt(request.getParameter("n1"));
    n2 = Integer.parseInt(request.getParameter("n2"));
    // Proceso
    MateService service = new MateService();
    suma = service.sumar(n1, n2);
    // Reporte
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>SUMAR</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>sumar</h1>");
    out.println("<p>Número 1: " + n1 + "</p>");
    out.println("<p>Número 2: " + n2 + "</p>");
    out.println("<p>suma: " + suma + "</p>");
    out.println("</body>");
    out.println("</html>");
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Reporte
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>SUMAR</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>BREAK ..... </h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
