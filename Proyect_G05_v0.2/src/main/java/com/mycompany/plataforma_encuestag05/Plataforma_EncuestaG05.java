/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plataforma_encuestag05;

import CONEXION_BD.ConexionSQLServer;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class Plataforma_EncuestaG05 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ConexionSQLServer con = new ConexionSQLServer();
        Connection conexion = con.obtenerConexion();
        
       
        
    }
    
}
