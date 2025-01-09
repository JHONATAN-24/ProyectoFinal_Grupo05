/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_ConexionBD;

import T_Clases.Comentario;
import T_Clases.Encuestador;
import T_Clases.Participante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUD_Comentarios {
    List<Comentario> T_nuevoComentario = new ArrayList<Comentario>();

    public CRUD_Comentarios() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public static void insertarComentarioEnc(Connection conexion, Comentario comentario, String codigoEncuestador) {
        Encuestador encuestador = new Encuestador();
        encuestador.setCodigo(codigoEncuestador);

        String sql = "INSERT INTO T_ComentariosEnc (id_encuestador, comentario) VALUES (?, ?)";         
        try (PreparedStatement statement = conexion.prepareStatement(sql)) { 
            statement.setString(1, codigoEncuestador); 
            statement.setString(2, comentario.getComentario()); 
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Gracias, tu comentario ayuda a mejorar!");
            }
            System.out.println("Comentario insertado correctamente."); 
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar comentario: " + e.getMessage());
        } 
    }

    public static void insertarComentarioPart(Connection conexion, Comentario comentario, int codigoParticipante) {
        Participante participante = new Participante();
        participante.setCodigo(codigoParticipante);

        String sql = "INSERT INTO T_ComentariosPart (id_participante, comentario) VALUES (?, ?)";         
        try (PreparedStatement statement = conexion.prepareStatement(sql)) { 
            statement.setInt(1, codigoParticipante); 
            statement.setString(2, comentario.getComentario()); 
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Gracias, tu comentario ayuda a mejorar!");
            }
            System.out.println("Comentario insertado correctamente."); 
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar comentario: " + e.getMessage());
        } 
    }
    
}
