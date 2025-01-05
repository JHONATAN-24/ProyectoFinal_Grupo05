/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_ConexionBD;

import T_Clases.Respuesta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CRUDJavaRes {
    List<Respuesta> T_listaRespuesta = new ArrayList<Respuesta>();

    public CRUDJavaRes() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public void insertarRespuesta(Connection conexion, int id_participante, int idEncuesta, int id_preguntas, Respuesta respuestas) {
        String sql = "INSERT INTO T_Respuesta (id_participante, id_encuestas, id_preguntas, respuestas) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id_participante);
            stmt.setInt(2, idEncuesta);
            stmt.setInt(3, id_preguntas);
            stmt.setString(4, respuestas.getTextoRespuesta());

            int filasInsertadas = stmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("¡Respuestas almacenadas en la base de datos!");
            } else {
                System.out.println("No se pudo insertar la respuesta.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar la respuesta: " + e.getMessage());
        }
    }

}
