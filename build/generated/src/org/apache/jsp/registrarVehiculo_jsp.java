package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloVO.DatosPersonalesVO;
import ModeloDAO.DatosPersonalesDAO;
import ModeloVO.CategoriaVO;
import ModeloDAO.CategoriaDAO;
import ModeloVO.DatosPersonalesVO;
import ModeloVO.UsuarioVO;

public final class registrarVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    response.setHeader("Pragma", "No-Cache");
    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);


      out.write("\n");
      out.write("\n");
      out.write("\n");

    HttpSession buscarSesion = (HttpSession) request.getSession();
    String usuario = "";
    String datosPersonales = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("Index.jsp").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        usuario = usuVO.getUsuLogin();
    }
    
    


      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"float: right\">\n");
      out.write("            <h1 style=\"color: red\">Bienvenido: ");
      out.print(usuario);
      out.write("</h1>\n");
      out.write("            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <input type=\"submit\" value=\"Cerrar Sesión\">\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div><br><br>\n");
      out.write("        \n");
      out.write("        <div></div><br><br>\n");
      out.write("        <div></div><br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    HttpSession miSession = (HttpSession) request.getSession();
    String datos = "";
    if (miSession.getAttribute("DatosConsultados") == null) {
        request.getRequestDispatcher("Index.jsp").forward(request, response);
    } else {
        DatosPersonalesVO datVO = (DatosPersonalesVO) miSession.getAttribute("DatosConsultados");
        datos = datVO.getDatId();
    }
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Vehiculo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Registrar Vehiculo</h1>\n");
      out.write("\n");
      out.write("        <form  method=\"post\"  action=\"Vehiculo\">   \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    Placa<br> \n");
      out.write("                <input type=\"text\" name=\"txtPlaca\"><br>\n");
      out.write("\n");
      out.write("                 <input type=\"hidden\" value=\"");
      out.print(datos);
      out.write("\" name=\"txtDatId\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                Categoria<br>\n");
      out.write("                <select name=\"txtCatId\">\n");
      out.write("                    <option>Seleccione...</option>\n");
      out.write("                    ");

                        CategoriaDAO catDAO = new CategoriaDAO();

                        for (CategoriaVO catVO : catDAO.listar()) {

                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(catVO.getCatId());
      out.write('"');
      out.write('>');
      out.print(catVO.getCatTipo());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("                            \n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                Modelo<br> \n");
      out.write("                <input type=\"text\" name=\"txtModelo\"><br>\n");
      out.write("\n");
      out.write("                Marca<br> \n");
      out.write("                <input type=\"text\" name=\"txtMarca\"><br>\n");
      out.write("\n");
      out.write("                Estado<br> \n");
      out.write("                <input type=\"text\" name=\"txtEstado\"><br>\n");
      out.write("\n");
      out.write("                Precio<br> \n");
      out.write("                <input type=\"text\" name=\"txtPrecio\"><br>\n");
      out.write("                </tr>\n");
      out.write("            </table><br>\n");
      out.write("\n");
      out.write("            <button>Registrar</button>\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div style=\"color:red\">\n");
      out.write("            ");

                    if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            ");
} else {
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
