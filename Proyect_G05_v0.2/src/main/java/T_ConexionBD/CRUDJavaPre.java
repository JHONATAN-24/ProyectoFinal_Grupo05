/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_ConexionBD;

import T_Clases.Alternativa;
import T_Clases.Pregunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CRUDJavaPre {
    List<Pregunta> T_pregunta = new ArrayList<Pregunta>();

    public CRUDJavaPre() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public void insertarPregunta(Connection conexion, Pregunta pregunta, int idEncuesta) {
        String sql = "INSERT INTO T_Preguntas (id_encuestas, enunciado, tipo_pregunta) VALUES (?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idEncuesta);
            statement.setString(2, pregunta.getEnunciado());
            statement.setString(3, pregunta.getTipoPregunta());
            
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Pregunta almacenada en la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar pregunta: " + e.getMessage());
        }
    }
 
    public List<Pregunta> obtenerPreguntasPorEncuesta(Connection conexion, int idEncuesta) {
        List<Pregunta> T_lista = new ArrayList<>();
        String sql = "SELECT enunciado FROM T_Preguntas WHERE id_encuestas = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idEncuesta);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Pregunta pregunta = new Pregunta();
                    pregunta.setEnunciado(rs.getString("enunciado"));
                    T_lista.add(pregunta);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener preguntas: " + ex.getMessage());
        }
        return T_lista;
    }
    
    public List<Pregunta> obtenerPreguntas(Connection conexion, int idEncuesta) {
        List<Pregunta> T_lista = new ArrayList<>();
        String sql = "SELECT enunciado, tipo_pregunta FROM T_Preguntas WHERE id_encuestas = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idEncuesta);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Pregunta pregunta = new Pregunta();
                    pregunta.setEnunciado(rs.getString("enunciado"));
                    pregunta.setTipoPregunta(rs.getString("tipo_pregunta"));
                    T_lista.add(pregunta);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener preguntas: " + ex.getMessage());
        }
        return T_lista;
    }
   
    public int borrarPregunta(Connection conexion, String enunciado) {
        String sql = "DELETE FROM T_Preguntas WHERE enunciado = ?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, enunciado);
            return statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    //Encuestas Cerradas
    public int insertarPreguntaCerradas(Connection conexion, Pregunta pregunta, int idEncuesta) {
        String sql = "INSERT INTO T_Preguntas (id_encuestas, enunciado, tipo_pregunta) VALUES (?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idEncuesta);
            statement.setString(2, pregunta.getEnunciado());
            statement.setString(3, pregunta.getTipoPregunta());

            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idPregunta = generatedKeys.getInt(1);
                    JOptionPane.showMessageDialog(null, "¡Pregunta almacenada en la base de datos!");
                    return idPregunta;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar pregunta: " + e.getMessage());
        }
        return -1; 
    }
    
}
