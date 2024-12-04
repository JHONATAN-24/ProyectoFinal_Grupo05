/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXION_BD;

import CLASES.Encuestador;
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
 * @author user
 */
public class CRUDJavaE {
    List<Encuestador> T_listaE = new ArrayList<Encuestador>();
    
    public CRUDJavaE() {
        
    }
    
    public Connection obtenerConexion() {
        ConexionSQLServer conexionSQLServer = new ConexionSQLServer();
        return conexionSQLServer.obtenerConexion();
    }
    
   public void insertarEncuestador(Connection conexion, Encuestador encuestador) {
        String sql = "INSERT INTO Encuestadores (codigo, nombre, apellido, genero, fechaNacimiento) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, encuestador.getCodigo());
            statement.setString(2, encuestador.getNombre());
            statement.setString(3, encuestador.getApellidos());
            statement.setString(4, encuestador.getGenero());
            statement.setString(5, encuestador.getFechaNacimiento());

            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Encuestador almacenado en la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar encuestador: " + e.getMessage());
        }
    
    }
   
    public List<Encuestador> obtenerEncuestadores(Connection conexion) {
            List<Encuestador> lista = new ArrayList<>();
            String sql = "SELECT codigo, nombre, apellido, genero, fechaNacimiento FROM Encuestadores";

            try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Encuestador e = new Encuestador();
                e.setCodigo(rs.getString("codigo"));
                e.setNombre(rs.getString("nombre"));
                e.setApellidos(rs.getString("apellido"));
                e.setGenero(rs.getString("genero"));
                e.setFechaNacimiento(rs.getString("fechaNacimiento"));
                lista.add(e);
            }
            } catch (SQLException ex) {
            ex.printStackTrace();
            }

            return lista;
 
    }
    
    public void actualizarEncuestador(Connection conexion, Encuestador encuestador) {
        String sql = "UPDATE Encuestadores SET nombre=?, apellido=?, genero=?, fechaNacimiento=? WHERE codigo=?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, encuestador.getNombre());
            statement.setString(2, encuestador.getApellidos());
            statement.setString(3, encuestador.getGenero());
            statement.setString(4, encuestador.getFechaNacimiento());
            statement.setString(5, encuestador.getCodigo());

            int filasActualizadas = statement.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Encuestador actualizado correctamente!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar encuestador: " + e.getMessage());
        }

    }

    public void borrarEncuestador(Connection conexion, String codigo) {
        String sql = "DELETE FROM Encuestadores WHERE codigo=?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigo);

            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Encuestador eliminado correctamente!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar encuestador: " + e.getMessage());
        }
    
    }
    
    public void mostrarLista(List<Encuestador> lista) {
        StringBuilder cadena = new StringBuilder();
        for (Encuestador enc : lista) {
            cadena.append("Código: ").append(enc.getCodigo())
                  .append(", Nombre: ").append(enc.getNombre())
                  .append(", Apellido: ").append(enc.getApellidos())
                  .append(", Género: ").append(enc.getGenero())
                  .append(", Fecha de Nacimiento: ").append(enc.getFechaNacimiento())
                  .append("\n");
        }
        JOptionPane.showMessageDialog(null, cadena.toString());
    }



}
