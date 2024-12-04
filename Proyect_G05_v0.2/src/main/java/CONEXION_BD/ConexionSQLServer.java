/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXION_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ConexionSQLServer {
    Connection conexion = null;
    
    String usuario = "Grupo05D";
    String contraseña = "depredadoresg05";
    String db = "Grupo05_PlataformaEncuestas";
    String ip = "localhost";
    String puerto = "1433";
    
     public Connection obtenerConexion(){
        try{
            
            String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";databaseName="+db;
            
            conexion = DriverManager.getConnection(cadena, usuario, contraseña);
            //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.toString());
            e.printStackTrace();
            
        }
        return conexion;
    }
}


