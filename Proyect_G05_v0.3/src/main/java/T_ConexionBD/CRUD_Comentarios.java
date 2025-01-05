/*
 GRUPO 05:
- JHONATAN BRANDON QUISPE CAUTIVO
- MOISES SEBASTIAN AVILA ROLDAN
- D'ALESSANDRO WILLIAMS CASANA MONTOYA
*/

package T_ConexionBD;

import T_Clases.Comentario;
import T_Clases.Encuestador;
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
        try (
            PreparedStatement statement = conexion.prepareStatement(sql)) { 
            statement.setString(1, codigoEncuestador); 
            statement.setString(2, comentario.getComentario()); 
            statement.executeUpdate(); 
            System.out.println("Comentario insertado correctamente."); 
        int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Gracias, tu comentario ayuda a mejorar!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar comentario: " + e.getMessage());
        } 
    }
}
