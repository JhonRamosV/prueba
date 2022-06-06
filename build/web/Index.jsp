<%-- 
    Document   : index
    Created on : 22/03/2022, 10:19:52 AM
    Author     : Sena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Usuario</title>
    </head>
    <body style ="background: #17A589"  >

        <div style ="color:white">

            <center>
                <h1 style=" font-family: sans-serif">Iniciar Sesión</h1>
                <form  method="post"  action="Usuario">  

                    <table>


                        <tr>

                            Usuario<br>
                            <input type="text" name="txtUsuario"><br>
                            Contraseña<br>
                            <input type="password" name="txtClave"><br>
                            </tr>



                            </table><br>
                            <button style="background-color:black; border-color:white; color:white">Ingresar</button>
                            <input type="hidden" value="3" name="opcion">
                        </i>




                </form>
                <div style="color:red">

                    <%

                        if (request.getParameter("mensajeError") != null) {%>
                    ${mensajeError}


                    <%} else {%>
                    ${mensajeExito}

                    <%}%>



                </div>

            </center>
    </body>
</html>
