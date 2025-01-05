
package T_ConexionBD;

import T_Clases.Alternativa;
import T_Clases.Pregunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class CRUDJavaAlter {
    List<Alternativa> T_nuevaEncuesta = new ArrayList<Alternativa>();
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public void insertarAlternativas(Connection conexion, int id_preguntas, Alternativa alternativa) {
        String sql = "INSERT INTO T_Alternativas (id_preguntas, Opciones) VALUES (?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id_preguntas);
            stmt.setString(2, alternativa.getTextoOpcion());

            int filasInsertadas = stmt.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Alternativa almacenada: " + alternativa.getTextoOpcion());
            } else {
                System.out.println("No se pudo insertar la alternativa: " + alternativa.getTextoOpcion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al insertar la alternativa: " + e.getMessage());
        }
    }
    
    public List<Pregunta> obtenerAlternativayPregunta(Connection conexion, int id_preguntas) {
        List<Pregunta> preguntas = new ArrayList<>();
        String sql = "SELECT p.id_preguntas, p.enunciado, p.tipo_pregunta, a.Opciones " +
                     "FROM T_Preguntas as p " +
                     "INNER JOIN T_Alternativas as a ON (p.id_preguntas = a.id_preguntas) " +
                     "WHERE p.id_encuestas = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id_preguntas);

            try (ResultSet rs = stmt.executeQuery()) {
                // Use a map to group alternatives for each question
                Map<Integer, Pregunta> preguntasMap = new HashMap<>();

                while (rs.next()) {
                    int idPregunta = rs.getInt("id_preguntas");

                    // If this question is not yet in the map, create a new Pregunta
                    if (!preguntasMap.containsKey(idPregunta)) {
                        Pregunta pregunta = new Pregunta();
                        pregunta.setId(idPregunta);
                        pregunta.setEnunciado(rs.getString("enunciado"));
                        pregunta.setTipoPregunta(rs.getString("tipo_pregunta"));
                        pregunta.setAlternativas(new ArrayList<>());

                        preguntasMap.put(idPregunta, pregunta);
                    }

                    // Add alternative to the question
                    Alternativa alternativa = new Alternativa();
                    alternativa.setTextoOpcion(rs.getString("Opciones"));

                    preguntasMap.get(idPregunta).getAlternativas().add(alternativa);
                }

                // Convert map values to list
                preguntas.addAll(preguntasMap.values());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener preguntas y alternativas: " + e.getMessage());
        }

        return preguntas;
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
    
}
