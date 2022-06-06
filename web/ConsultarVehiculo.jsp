<%-- 
    Document   : ConsultarVehiculo
    Created on : 15/03/2022, 11:04:37 AM
    Author     : Sena
--%>


<%@page import="ModeloVO.DatosPersonalesVO"%>
<%@page import="ModeloDAO.DatosPersonalesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VEHÍCULOS</title>
    </head>
    <body>
    <center>
        <h1>Vehículos</h1>
        
        <form method="post" action="Vehiculo">
            <table>
                <tr>
                    <th>
                        Placa<br>
                        <input type="text" name="txtPlaca">
                        <input type="hidden" value="3" name="opcion">
                        <button>Consultar</button>
                    </th>
                </tr>
            </table>
            
        </form>
        
        <div style="color:red">
                <%
                    if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}
                <%}%>    
        </div><br><br>
        
        
        <form>
            <table border="1">
                <tr>
                    <th>PLACA</th>
                    <th>DATOS</th>
                    <th>CATEGORÍA</th>
                    <th>MODELO</th>
                    <th>ESTADO</th>
                    <th>PRECIO</th>
                </tr>
                
                <%
                    VehiculoVO vehVO = new VehiculoVO();
                    VehiculoDAO vehDAO = new VehiculoDAO();
                    ArrayList<VehiculoVO> listaVehiculos = vehDAO.listar();
                    for(int i = 0; i < listaVehiculos.size(); i++){
                        vehVO = listaVehiculos.get(i);
                        
                    
                %>
                
                <tr>
                    <td><%=vehVO.getVehplaca()%></td>                 
                    <td><%=vehVO.getDatid()%></td>                 
                    <td><%=vehVO.getCatid()%></td>
                    <td><%=vehVO.getVehmodelo()%></td>
                    <td><%=vehVO.getVehmarca()%></td>
                    <td><%=vehVO.getVehestado()%></td>
                    <td><%=vehVO.getVehprecio()%></td>
                </tr>
                
                <% }%>
            </table>
        </form>
    </center>
        
    </body>
</html>
