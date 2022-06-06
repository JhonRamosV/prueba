<%-- 
    Document   : registrarUsuario
    Created on : 01-mar-2022, 17:51:42
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
    </head>
    <body>
        
    <center>
        <h1>Registrar Usuario</h1>
        <form  method="post"  action="Usuario">   
            <table>
                <tr>
                    Usuario<br> 
                <input type="text" name="txtUsuario"><br>
                Contraseña<br>
                 <input type="password" name="txtClave"><br>
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
