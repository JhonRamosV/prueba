/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.DatosPersonalesDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.DatosPersonalesVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Migue
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

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

        // 1: recibir datos de la vista
        String usuId = request.getParameter("txt.ID");
        String usuLogin = request.getParameter("txtUsuario");
        String usuPassword = request.getParameter("txtClave"); 
       
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        
        // 2: quien tiene los datos de forma segura en el sistema? obvio es el VO
        UsuarioVO usuVO = new UsuarioVO(usuId, usuLogin, usuPassword);
        DatosPersonalesVO datVO = new DatosPersonalesVO();

        // 3: quien hace las operaciones? obvio el DAO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        DatosPersonalesDAO datDAO = new DatosPersonalesDAO(); 

        // 4: administrar  operaciones del modulo 
        switch (opcion) {

            case 1://agregar registro

                if (usuDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se registro correctamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario no se registro correctamente");
                }
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                break;

            case 2://actualizar registro

                if (usuDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se actualizo correctamente");

                } else {
                    request.setAttribute("mensajeError", "El usuario no se actualizo correctamente");
                }
                request.getRequestDispatcher("actualizarRegistro.jsp").forward(request, response);
                break;

            case 3://inciar sesion
                
                usuVO = usuDAO.iniciarsesion(usuLogin, usuPassword);

                if (usuVO != null) {
                    
                    HttpSession miSesion = request.getSession(true);
                    String id = usuVO.getUsuId();
                    
                    datVO = datDAO.consultarDatos(id);
                    if (datVO != null) {
                        miSesion.setAttribute("DatosConsultados", datVO);
                        
                    } else {
                        request.setAttribute("mensajeError", "Los datos no existen!");
                    }
                                                                    
                    usuVO = new UsuarioVO(id, usuLogin, usuPassword);
                    miSesion.setAttribute("datosUsuario", usuVO);
                    
                    request.getRequestDispatcher("menu.jsp").forward(request, response);

                } else {
                  
                    request.setAttribute("mensajeError", "Corregir datos");
                request.getRequestDispatcher("Index.jsp").forward(request, response);
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
