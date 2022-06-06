<%-- 
    Document   : registrarVehiculo
    Created on : 8/03/2022, 10:22:39 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>

<%
    HttpSession miSession = (HttpSession) request.getSession();
    String datos = "";
    if (miSession.getAttribute("DatosConsultados") == null) {
        request.getRequestDispatcher("Index.jsp").forward(request, response);
    } else {
        DatosPersonalesVO datVO = (DatosPersonalesVO) miSession.getAttribute("DatosConsultados");
        datos = datVO.getDatId();
    }
    
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Vehiculo</title>
    </head>
    <body>
    <center>
        <h1>Registrar Vehiculo</h1>

        <form  method="post"  action="Vehiculo">   
            <table>
                <tr>
                    Placa<br> 
                <input type="text" name="txtPlaca"><br>

                 <input type="hidden" value="<%=datos%>" name="txtDatId">
                
                
                <br>
                Categoria<br>
                <select name="txtCatId">
                    <option>Seleccione...</option>
                    <%
                        CategoriaDAO catDAO = new CategoriaDAO();

                        for (CategoriaVO catVO : catDAO.listar()) {

                    %>
                    <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo()%></option>
                    <%}%>                            
                </select>



                <br><br>
                Modelo<br> 
                <input type="text" name="txtModelo"><br>

                Marca<br> 
                <input type="text" name="txtMarca"><br>

                Estado<br> 
                <input type="text" name="txtEstado"><br>

                Precio<br> 
                <input type="text" name="txtPrecio"><br>
                </tr>
            </table><br>

            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">

        </form>

        <div style="color:red">
            <%
                    if (request.getAttribute("mensajeError") != null) {%>
            ${mensajeError}
            <%} else {%>
            ${mensajeExito}

            <%}%>
        </div>
    </center>



</body>
</html>
