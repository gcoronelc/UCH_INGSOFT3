package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"\" media=\"screen\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.css\" media=\"screen\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-theme.min.css\">\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <center><form method=\"post\" action=\"PromedioAgregar\">\n");
      out.write("            \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">Alumno:</div>\n");
      out.write("            <div class=\"col-md-4\"><input type=\"text\" name=\"alumno\"/></div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("     <p>Practica1: <input  onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"nota1\"/></p>\n");
      out.write("     <p>Practica2: <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"nota2\"/></p>\n");
      out.write("     <p>Practica3: <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"nota3\"/></p>\n");
      out.write("     <p>Practica4: <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"nota4\"/></p>\n");
      out.write("     <p>Examen Parcial: <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"exaparcial\"/></p>\n");
      out.write("     <p>Examen Final: <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"exafinal\"/></p>\n");
      out.write("     <p>Proyecto: <input onkeypress='return event.charCode >= 48 && event.charCode <= 57 || event.charCode == 46' type=\"text\" name=\"proyecto\"/></p>\n");
      out.write("\n");
      out.write("      <p><input style=\"width: 200px;\n");
      out.write("    border: 0;\n");
      out.write("    padding: 1rem;\n");
      out.write("    background: #BB2222;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    color: #fff;\n");
      out.write("    border-bottom: 5px solid #8E1818;\"type=\"submit\" value=\"Procesar\"/></p>\n");
      out.write("    </form></center>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <script src=\"bootstrap/js/jquery.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
