package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.VehiculoVO;

public final class actualizarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar Vehículo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h1>Actualizar Vehiculo</h1>\n");
      out.write("            \n");
      out.write("            ");

              VehiculoVO vehVO = (VehiculoVO)request.getAttribute("VehiculoConsultado");
              
              if(vehVO != null){
                               
            
      out.write("\n");
      out.write("\n");
      out.write("            <form  action=\"Vehiculo\"  method=\"post\">   \n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        Placa<br> \n");
      out.write("                    <input type=\"text\" name=\"txtPlaca\" value=\"");
      out.print(vehVO.getVehplaca());
      out.write("\"><br>\n");
      out.write("\n");
      out.write("                        Datos<br>\n");
      out.write("                        <input type=\"text\" name=\"txtDatId\" value=\"");
      out.print(vehVO.getDatid());
      out.write("\"><br>\n");
      out.write("\n");
      out.write("                        Categoria<br> \n");
      out.write("                        <input type=\"text\" name=\"txtCatId\" value=\"");
      out.print(vehVO.getCatid());
      out.write("\"><br>\n");
      out.write("                        \n");
      out.write("                        Modelo<br> \n");
      out.write("                        <input type=\"text\" name=\"txtModelo\" value=\"");
      out.print(vehVO.getVehmodelo());
      out.write("\"><br>\n");
      out.write("                        \n");
      out.write("                        Marca<br> \n");
      out.write("                        <input type=\"text\" name=\"txtMarca\" value=\"");
      out.print(vehVO.getVehmarca());
      out.write("\"><br>\n");
      out.write("                        \n");
      out.write("                        Estado<br> \n");
      out.write("                        <input type=\"text\" name=\"txtEstado\" value=\"");
      out.print(vehVO.getVehestado());
      out.write("\"><br>\n");
      out.write("                        \n");
      out.write("                        Precio<br> \n");
      out.write("                        <input type=\"text\" name=\"txtPrecio\" value=\"");
      out.print(vehVO.getVehprecio());
      out.write("\"><br>\n");
      out.write("                    </tr>\n");
      out.write("                </table><br>\n");
      out.write("                \n");
      out.write("                <button>Actualizar</button>\n");
      out.write("                <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("                \n");
      out.write("                <a href=\"ConsultarVehiculo.jsp\">Volver</a>             \n");
      out.write("            </form>\n");
      out.write("                    \n");
      out.write("            ");
 }else{
                request.getRequestDispatcher("ConsultarVehiculo.jsp").forward(request, response);
            }
      out.write("\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
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
