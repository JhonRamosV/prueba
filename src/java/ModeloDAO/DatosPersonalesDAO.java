/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DatosPersonalesVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sena
 */
public class DatosPersonalesDAO extends Conexion implements Crud {
    
      private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private String sql;
    
    public ArrayList<DatosPersonalesVO> listar() {
        ArrayList<DatosPersonalesVO> listaDatosPersonales = new ArrayList<>();

        try {
            conexion = this.obtenerConexion();
            sql = "select * from datospersonales";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                DatosPersonalesVO datVO = new DatosPersonalesVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));
                
                listaDatosPersonales.add(datVO);
            }

        } catch (Exception e) {
            Logger.getLogger(DatosPersonalesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarconexion();
            } catch (Exception e) {
                Logger.getLogger(DatosPersonalesDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        return listaDatosPersonales;
    }
    
    
    public DatosPersonalesVO consultarDatos(String idDat) {
        DatosPersonalesVO datVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "SELECT * FROM datospersonales WHERE USUID = ?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, idDat);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                datVO = new DatosPersonalesVO(mensajero.getString(1), mensajero.getString(2), 
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), 
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));
            }

        } catch (Exception e) {
            Logger.getLogger(DatosPersonalesDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarconexion();
            } catch (Exception e) {
                Logger.getLogger(DatosPersonalesVO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return datVO;
    }

    @Override
    public boolean agregarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
