/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_CONEXION_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ConexionSQLServer {
    private static ConexionSQLServer instance;
    private Connection connection;
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Grupo05_PlataformaEncuestas";
    private String username = "Grupo05D";
    private String password = "depredadoresg05";

    private ConexionSQLServer() throws SQLException {
        try {
            // Registrar el driver de SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // Establecer la conexión
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new SQLException("Error al cargar el driver de SQL Server", ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static ConexionSQLServer getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConexionSQLServer();
        } else if (instance.getConnection().isClosed()) {
            instance = new ConexionSQLServer();
        }
        return instance;
    }

    // Método para cerrar la conexión
    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}


