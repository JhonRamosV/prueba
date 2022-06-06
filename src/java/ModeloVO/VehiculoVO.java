/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Migue
 */
public class VehiculoVO {
    private String vehplaca, datid, catid, vehmodelo, vehmarca, vehestado, vehprecio;

    public VehiculoVO(String vehplaca, String datid, String catid, String vehmodelo, String vehmarca, String vehestado, String vehprecio) {
        this.vehplaca = vehplaca;
        this.datid = datid;
        this.catid = catid;
        this.vehmodelo = vehmodelo;
        this.vehmarca = vehmarca;
        this.vehestado = vehestado;
        this.vehprecio = vehprecio;
    }

    public VehiculoVO() {
        
    }
    
    
    public String getVehplaca() {
        return vehplaca;
    }

    public void setVehplaca(String vehplaca) {
        this.vehplaca = vehplaca;
    }

    public String getDatid() {
        return datid;
    }

    public void setDatid(String datid) {
        this.datid = datid;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid;
    }

    public String getVehmodelo() {
        return vehmodelo;
    }

    public void setVehmodelo(String vehmodelo) {
        this.vehmodelo = vehmodelo;
    }

    public String getVehmarca() {
        return vehmarca;
    }

    public void setVehmarca(String vehmarca) {
        this.vehmarca = vehmarca;
    }

    public String getVehestado() {
        return vehestado;
    }

    public void setVehestado(String vehestado) {
        this.vehestado = vehestado;
    }

    public String getVehprecio() {
        return vehprecio;
    }

    public void setVehprecio(String vehprecio) {
        this.vehprecio = vehprecio;
    }

    

}
