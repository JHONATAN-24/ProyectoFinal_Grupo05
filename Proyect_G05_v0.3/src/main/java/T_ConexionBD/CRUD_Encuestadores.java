
package T_ConexionBD;

import T_Clases.Encuestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUD_Encuestadores {
     List<Encuestador> T_listaE = new ArrayList<Encuestador>();
    
    public CRUD_Encuestadores() {
        
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public Encuestador validarCredenciales(String codigo, String contraseña) {
        Encuestador encuestadorRegistrado = null;

        try (Connection conexion = obtenerConexion()) {
            String sql = "SELECT * FROM T_Encuestadores WHERE codigo = ? AND contraseña = ?";

            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, codigo);
                statement.setString(2, contraseña);

                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        // Crear objeto Encuestador con los datos de la base de datos
                        encuestadorRegistrado = new Encuestador(
                            rs.getString("codigo"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("fechaNacimiento"), // Asegúrate de que el nombre de la columna sea correcto
                            rs.getString("genero"),
                            rs.getString("contraseña")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return encuestadorRegistrado;
    }
    
    public void insertarEncuestador(Connection conexion, Encuestador encuestador) {
        String sql = "INSERT INTO T_Encuestadores (codigo, nombre, apellido, genero, fechaNacimiento, contraseña) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, encuestador.getCodigo());
            statement.setString(2, encuestador.getNombre());
            statement.setString(3, encuestador.getApellidos());
            statement.setString(4, encuestador.getGenero());
            statement.setString(5, encuestador.getFechaNacimiento());
            statement.setString(6, encuestador.getPassword());

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
        String sql = "SELECT codigo, nombre, apellido, genero, fechaNacimiento FROM T_Encuestadores ";

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
        String sql = "UPDATE T_Encuestadores SET nombre=?, apellido=?, genero=?, fechaNacimiento=?, contraseña=? WHERE codigo=?";
        try {
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, encuestador.getNombre());
            statement.setString(2, encuestador.getApellidos());
            statement.setString(3, encuestador.getGenero());
            statement.setString(4, encuestador.getFechaNacimiento());
            statement.setString(5, encuestador.getCodigo());
            statement.setString(6, encuestador.getPassword());

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
        String sql = "DELETE FROM T_Encuestadores WHERE codigo=?";
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
                  .append(", Contraseña : ").append(enc.getPassword())
                  .append("\n");
        }
        JOptionPane.showMessageDialog(null, cadena.toString());
    }
    
    public Encuestador validarLoginEncuestador(String codigo, String password) {
        Encuestador encuestadorLogueado = null;
        
        try (Connection conexion = obtenerConexion()) {
            String sql = "SELECT * FROM T_Encuestadores WHERE codigo = ? AND contraseña = ?";
            
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, codigo);
                statement.setString(2, password);
                
                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        // Crear objeto Encuestador con los datos de la base de datos
                        encuestadorLogueado = new Encuestador(
                            rs.getString("codigo"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("fechaNacimiento"),
                            rs.getString("genero"),
                            rs.getString("contraseña")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        
        return encuestadorLogueado;
    }
}
