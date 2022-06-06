<%-- 
    Document   : actualizarVehiculo
    Created on : 15/03/2022, 11:11:28 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Vehículo</title>
    </head>
    <body>
        <center>
            <h1>Actualizar Vehiculo</h1>
            
            <%
              VehiculoVO vehVO = (VehiculoVO)request.getAttribute("VehiculoConsultado");
              
              if(vehVO != null){
                               
            %>

            <form  action="Vehiculo"  method="post">   
                <table>
                    <tr>
                        Placa<br> 
                    <input type="text" name="txtPlaca" value="<%=vehVO.getVehplaca()%>"><br>

                        Datos<br>
                        <input type="text" name="txtDatId" value="<%=vehVO.getDatid()%>"><br>

                        Categoria<br> 
                        <input type="text" name="txtCatId" value="<%=vehVO.getCatid()%>"><br>
                        
                        Modelo<br> 
                        <input type="text" name="txtModelo" value="<%=vehVO.getVehmodelo()%>"><br>
                        
                        Marca<br> 
                        <input type="text" name="txtMarca" value="<%=vehVO.getVehmarca()%>"><br>
                        
                        Estado<br> 
                        <input type="text" name="txtEstado" value="<%=vehVO.getVehestado()%>"><br>
                        
                        Precio<br> 
                        <input type="text" name="txtPrecio" value="<%=vehVO.getVehprecio()%>"><br>
                    </tr>
                </table><br>
                
                <button>Actualizar</button>
                <input type="hidden" value="2" name="opcion">
                
                <a href="ConsultarVehiculo.jsp">Volver</a>             
            </form>
                    
            <% }else{
                request.getRequestDispatcher("ConsultarVehiculo.jsp").forward(request, response);
            }%>
        </center>
    </body>
</html>
