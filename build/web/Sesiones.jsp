<%-- 
    Document   : Sesiones
    Created on : 22/03/2022, 11:01:22 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    response.setHeader("Pragma", "No-Cache");
    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);

%>


<%
    HttpSession buscarSesion = (HttpSession) request.getSession();
    String usuario = "";
    String datosPersonales = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("Index.jsp").forward(request, response);
    } else {
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        usuario = usuVO.getUsuLogin();
    }
    
    

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="float: right">
            <h1 style="color: red">Bienvenido: <%=usuario%></h1>
            <form method="post" action="Sesiones">
                <input type="submit" value="Cerrar Sesión">

            </form>

        </div><br><br>
        
        <div></div><br><br>
        <div></div><br><br>
    </body>
</html>
