/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Migue
 */
public class Conexion {
//1. Declaras variables y objetos
    
    private String driver,user,password,dataBase,urlBd;
    private Connection conexion;
    
//2. Asignar valores
    
    public Conexion(){
    
     driver="com.mysql.jdbc.Driver";
     user="root";
     password="";
     dataBase="ventacarros2236903";
     urlBd="jdbc:mysql://localhost:3308/" + dataBase;
     
 //3. Conectarse
 
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBd,user,password);
            System.err.println("Conexión Ok!");
        } catch (Exception e) {
            System.err.println("Error al conectarse" + e.toString());
        }
    }
    
    public Connection obtenerConexion(){
        return conexion;
    }
    public Connection cerrarconexion() throws SQLException{
     conexion.close();
     conexion=null;
     return conexion;
    }
    
    public static void main(String[] args) {
        new Conexion();
    }
}
