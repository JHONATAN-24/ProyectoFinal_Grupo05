
package T_ConexionBD;

import T_Clases.Encuesta;
import T_Clases.Encuestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CRUDJavaEn {
    List<Encuesta> T_nuevaEncuesta = new ArrayList<Encuesta>();

    public CRUDJavaEn() {
    }

    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public void insertarEncuestas(Connection conexion, Encuesta encuestas, String codigoEncuestador) {
        Encuestador encuestador = new Encuestador();
        encuestador.setCodigo(codigoEncuestador);
        
        String sql = "INSERT INTO T_Encuestas (codigo, titulo, descripcion, tipo, fechaCreacion, fechaCierre) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, codigoEncuestador);  // Direct use of codigoEncuestador
            statement.setString(2, encuestas.getTitulo());
            statement.setString(3, encuestas.getDescripción());
            statement.setString(4, encuestas.getTipoEncuesta());
            statement.setString(5, encuestas.getFechaCreacion());
            statement.setString(6, encuestas.getFechaCierre());
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Encuesta almacenado en la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar encuesta: " + e.getMessage());
        }
    }
    
    public List<Encuesta> obtenerEncuestas(Connection conexion, String codigoEncuestador) {
        List<Encuesta> listaEncuestas = new ArrayList<>();
        String sql = "SELECT e.codigo, en.titulo, en.descripcion, en.tipo, en.fechaCreacion, en.fechaCierre " +
                     "FROM T_Encuestadores AS e " +
                     "INNER JOIN T_Encuestas AS en ON (e.codigo = en.codigo) " +
                     "WHERE e.codigo = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, codigoEncuestador);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Encuesta encuesta = new Encuesta();
                    Encuestador encuestador = new Encuestador();

                    // Configura el encuestador con su código
                    encuestador.setCodigo(rs.getString("codigo"));
                    encuesta.setEncuestador(encuestador);

                    // Configura los datos de la encuesta
                    encuesta.setTitulo(rs.getString("titulo"));
                    encuesta.setDescripción(rs.getString("descripcion"));
                    encuesta.setTipoEncuesta(rs.getString("tipo"));
                    encuesta.setFechaCreacion(rs.getString("fechaCreacion"));
                    encuesta.setFechaCierre(rs.getString("fechaCierre"));

                    listaEncuestas.add(encuesta);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listaEncuestas;
    }
    
    public List<Encuesta> obtenerListaEncuesta(Connection conexion){    
     List<Encuesta> T_lista = new ArrayList<>();
        String sql = "SELECT titulo, descripcion, tipo, fechaCreacion, fechaCierre FROM T_Encuestas ";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Encuesta e = new Encuesta();
                    e.setTitulo(rs.getString("titulo"));
                    e.setDescripción(rs.getString("descripcion"));
                    e.setTipoEncuesta(rs.getString("tipo"));
                    e.setFechaCreacion(rs.getString("fechaCreacion"));
                    e.setFechaCierre(rs.getString("fechaCierre"));
                    
                T_lista.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return T_lista;
    }   
    
    public List<Encuesta> obtenerEncuestasPar(Connection conexion) {
    List<Encuesta> listaEncuestas = new ArrayList<>();
    String sql = "SELECT e.id_encuestas, e.titulo, e.descripcion, e.tipo, " +
                 "e.fechaCreacion, e.fechaCierre, en.nombre AS nombre_encuestador " +
                 "FROM T_Encuestas AS e " +
                 "INNER JOIN T_Encuestadores AS en ON (e.codigo = en.codigo)";
    
    try (PreparedStatement stmt = conexion.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                Encuesta e = new Encuesta();
                Encuestador encuestador = new Encuestador();

                e.setId(rs.getInt("id_encuestas"));
                e.setTitulo(rs.getString("titulo"));
                e.setDescripción(rs.getString("descripcion"));
                e.setTipoEncuesta(rs.getString("tipo"));
                e.setFechaCreacion(rs.getString("fechaCreacion"));
                e.setFechaCierre(rs.getString("fechaCierre"));

                // Set the surveyor's name
                encuestador.setNombre(rs.getString("nombre_encuestador"));
                e.setEncuestador(encuestador);

                listaEncuestas.add(e);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

            return listaEncuestas;
        }
    
}    

