/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Sena
 */
public class DatosPersonalesVO {

    private String datId, usuID, nombre, apellido, tipoId, numeroID, telefono, correo;
    
    public DatosPersonalesVO() {
    }

    public DatosPersonalesVO(String datId, String usuID, String nombre, String apellido, String tipoId, String numeroID, String telefono, String correo) {
        this.datId = datId;
        this.usuID = usuID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoId = tipoId;
        this.numeroID = numeroID;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDatId() {
        return datId;
    }

    public void setDatId(String datId) {
        this.datId = datId;
    }

    public String getUsuID() {
        return usuID;
    }

    public void setUsuID(String usuID) {
        this.usuID = usuID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(String numeroID) {
        this.numeroID = numeroID;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
