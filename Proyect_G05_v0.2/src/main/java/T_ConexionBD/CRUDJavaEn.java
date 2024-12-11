
package T_ConexionBD;

import T_ArrayList.ListaPreguntas;
import T_ArrayList.ListaRespuestas;
import T_Clases.Encuesta;
import T_Clases.Encuestador;
import T_Clases.Participante;
import T_Clases.Pregunta;
import T_Clases.Respuesta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    public List<Encuesta> obtenerTituloEncuesta(Connection conexion, int idEncuesta){
        List<Encuesta> titulosEncuesta = new ArrayList<>();
        String sql = "SELECT titulo FROM T_Encuestas WHERE id_encuestas = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idEncuesta);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Encuesta encuesta = new Encuesta();
                    encuesta.setTitulo(rs.getString("titulo")); // Asignar título al objeto Encuesta
                    titulosEncuesta.add(encuesta); // Agregar a la lista
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener título: " + ex.getMessage());
        }
        return titulosEncuesta; // Retornar la lista de títulos
    }
    
    public List<Encuesta> reporteEncuesta(Connection conexion, String codigoEncuestador){
        List<Encuesta> listaEncuestas = new ArrayList<>();
    
        try {
            String sql = "{CALL dbo.obtenerEncuestas(?)}";
            try (CallableStatement statement = conexion.prepareCall(sql)) {
                statement.setString(1, codigoEncuestador);

                try (ResultSet resultSet = statement.executeQuery()) {
                    Map<String, Encuesta> encuestasMap = new HashMap<>();

                    while (resultSet.next()) {
                        String titulo = resultSet.getString("titulo");

                        Encuesta encuesta = encuestasMap.get(titulo);
                        if (encuesta == null) {
                            encuesta = new Encuesta();
                            encuesta.setTitulo(titulo);
                            encuesta.setFechaCreacion(resultSet.getString("fechaCreacion"));
                            encuesta.setFechaCierre(resultSet.getString("fechaCierre"));

                            ListaPreguntas listaPreguntas = new ListaPreguntas();
                            encuesta.setListaPreguntas(listaPreguntas);

                            encuestasMap.put(titulo, encuesta);
                            listaEncuestas.add(encuesta);
                        }

                        // Create Pregunta
                        Pregunta pregunta = new Pregunta();
                        pregunta.setEnunciado(resultSet.getString("enunciado"));

                        // Create Respuesta
                        Respuesta respuesta = new Respuesta();
                        respuesta.setTextoRespuesta(resultSet.getString("respuestas"));

                        // Create Participante
                        Participante participante = new Participante();
                        participante.setNombre(resultSet.getString("nombre"));
                        respuesta.setParticipante(participante);

                        // Create ListaRespuestas for the Pregunta
                        ListaRespuestas listaRespuestas = new ListaRespuestas();
                        listaRespuestas.agregarRespuesta(respuesta);
                        pregunta.setRespuestas(listaRespuestas);

                        // Add pregunta to encuesta's ListaPreguntas
                        encuesta.getListaPreguntas().agregarPregunta(pregunta);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaEncuestas;
    }
    
    //Encuestas Cerradas
    
    public void insertarEncuestasCerradas(Connection conexion, Encuesta encuestas, String codigoEncuestador) {
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
    
    public Encuesta obtenerEncuestaPorId(Connection conexion, int idEncuesta) throws SQLException {
        String sql = "SELECT titulo, descripcion, tipo, fechaCreacion, fechaCierre FROM T_Encuestas WHERE id_encuestas = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, idEncuesta);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Encuesta encuesta = new Encuesta();
                    encuesta.setTitulo(rs.getString("titulo"));
                    encuesta.setDescripción(rs.getString("descripcion"));
                    encuesta.setTipoEncuesta(rs.getString("tipo"));
                    encuesta.setFechaCreacion(rs.getString("fechaCreacion"));
                    encuesta.setFechaCierre(rs.getString("fechaCierre"));
                    return encuesta;
                }
            }
        }
        return null; // Si no se encuentra la encuesta
    }
    
}    

