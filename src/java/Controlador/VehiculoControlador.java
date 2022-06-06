/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.VehiculoDAO;
import ModeloVO.VehiculoVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "VehiculoControlador", urlPatterns = {"/Vehiculo"})
public class VehiculoControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String vehplaca = request.getParameter("txtPlaca");
        String datid = request.getParameter("txtDatId");
        String catid = request.getParameter("txtCatId");
        String vehmodelo = request.getParameter("txtModelo");
        String vehmarca = request.getParameter("txtMarca");
        String vehestado = request.getParameter("txtEstado");
        String vehprecio = request.getParameter("txtPrecio");
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        
        VehiculoVO vehVO = new VehiculoVO(vehplaca, datid, catid, vehmodelo, vehmarca, vehestado, vehprecio);
        
        VehiculoDAO vehDAO = new VehiculoDAO(vehVO);
        
        switch(opcion){
            
            case 1: //Agregar Registro
                if (vehDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El vehiculo se registro correctamente");
                } else {
                    request.setAttribute("mensajeError", "El vehiculo no se registro correctamente");
                }
                request.getRequestDispatcher("registrarVehiculo.jsp").forward(request, response);
                break;
                
            case 2://actualizar registro

                if (vehDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El vehiculo se actualizo correctamente");

                } else {
                    request.setAttribute("mensajeError", "El vehiculo no se actualizo correctamente");
                }
                request.getRequestDispatcher("actualizarVehiculo.jsp").forward(request, response);
                break;
                
            case 3://Consultar por placa
                
                vehVO = vehDAO.consultarPlaca(vehplaca);
                
                if (vehVO != null) {
                    request.setAttribute("VehiculoConsultado", vehVO);
                    request.getRequestDispatcher("actualizarVehiculo.jsp").forward(request, response);
                }else{
                    request.setAttribute("mensajeError", "El vehículo no existe!");
                    request.getRequestDispatcher("ConsultarVehiculo.jsp").forward(request, response);
                }
                break;
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
