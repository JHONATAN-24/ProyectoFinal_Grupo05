/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXION_BD;

import CLASES.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CRUDJavaP {

    public CRUDJavaP() {
    }
    
    public Connection obtenerConexionP() {
        ConexionSQLServer conexionSQLServer = new ConexionSQLServer();
        return conexionSQLServer.obtenerConexion();
    }
    
    public void insertarParticipante (Connection conexion,Participante participante){
        String sql = "INSERT INTO Participantes (email,nombre,apellido,genero,fechaNacimiento) VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setString(1, participante.getEmail());
                statement.setString(2, participante.getNombre());
                statement.setString(3, participante.getApellidos());
                statement.setString(4, participante.getGenero());
                statement.setString(5, participante.getFechaNacimiento());
                
            int filasInsertadasP = statement.executeUpdate();
            
            if(filasInsertadasP > 0){
                JOptionPane.showMessageDialog(null, "¡Participante almacenado en la base de datos!");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar participante: " + e.getMessage());
        }
    }
    
    public List<Participante> obtenerParticipantes(Connection conexion){
       List<Participante> T_listaParticipante = new ArrayList<>(); 
       
       String sql = "Select email,nombre,apellido,genero,fechaNacimiento FROM Participantes";
       
       try (PreparedStatement statem = conexion.prepareStatement(sql);
            ResultSet rs = statem.executeQuery()){
           
           while(rs.next()){
               Participante T_part = new Participante();
                    T_part.setEmail(rs.getString("email"));
                    T_part.setNombre(rs.getString("nombre"));
                    T_part.setApellidos(rs.getString("apellido"));
                    T_part.setGenero(rs.getString("genero"));
                    T_part.setFechaNacimiento(rs.getString("fechaNacimiento"));
                    
                    T_listaParticipante.add(T_part);   
           }
       }catch(SQLException ex){
               ex.printStackTrace();
       }
       
       return T_listaParticipante;
    }
}
