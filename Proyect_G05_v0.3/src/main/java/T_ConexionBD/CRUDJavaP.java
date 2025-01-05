/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_ConexionBD;

import T_Clases.Participante;
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
    List<Participante> T_listaP = new ArrayList<Participante>();

    public CRUDJavaP() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public void insertarParticipante(Connection conexion, Participante participante){
        String sql = "INSERT INTO T_participantes (email,nombre,apellido,genero,fechaNacimiento,contraseña) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement T_statementP = conexion.prepareStatement(sql);
                T_statementP.setString(1, participante.getEmail());
                T_statementP.setString(2, participante.getNombre());
                T_statementP.setString(3, participante.getApellidos());
                T_statementP.setString(4, participante.getGenero());
                T_statementP.setString(5, participante.getFechaNacimiento());
                T_statementP.setString(6, participante.getPassword());
                
                int T_filasInsertadas = T_statementP.executeUpdate();
                if(T_filasInsertadas > 0){
                    JOptionPane.showMessageDialog(null, "¡Participante almacenado en la base de datos!");
                }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar participante: " + e.getMessage());
        }
    }
    
    public List<Participante> obtenerParticipantesP(Connection conexion) {
        List<Participante> T_listaP = new ArrayList<>();
        String sql = "SELECT id_participante, email,nombre,apellido,genero,fechaNacimiento FROM T_participantes";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Participante p = new Participante();
                p.setCodigo(rs.getInt("id_participante"));
                p.setEmail(rs.getString("email"));
                p.setNombre(rs.getString("nombre"));
                p.setApellidos(rs.getString("apellido"));
                p.setGenero(rs.getString("genero"));
                p.setFechaNacimiento(rs.getString("fechaNacimiento"));
                T_listaP.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return T_listaP;
    }
    
    public void borrarParticipante(Connection conexion, String email) {
        String sql = "DELETE FROM T_participantes WHERE email=?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, email);

            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Participante eliminado correctamente!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar participante: " + e.getMessage());
        }
    }
    
    public Participante validarLoginPartipante(String email, String contraseña){
        Participante T_participanteLogin = null;
        
        try(Connection conexion = obtenerConexion() ){
            String sql = "SELECT * FROM T_participantes WHERE email = ? AND contraseña = ?";
            
            try(PreparedStatement statement = conexion.prepareStatement(sql)){
                statement.setString(1, email);
                statement.setString(2, contraseña);
                
                try(ResultSet rs= statement.executeQuery()){
                    if(rs.next()){
                        T_participanteLogin = new Participante(
                                rs.getString("email"),
                                rs.getInt("id_participante"),
                                rs.getString("nombre"),
                                rs.getString("apellido"),
                                rs.getString("fechaNacimiento"),
                                rs.getString("genero"),
                                rs.getString("contraseña")
                        );
                    }
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexion: " +e.getMessage());
        }
        
        return T_participanteLogin;
    }
}

