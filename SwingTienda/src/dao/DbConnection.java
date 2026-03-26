package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
   
	private static final String URL = "jdbc:mysql://localhost:3306/2ebal_almacen";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println("Error en la conexión: " + e.getMessage());
        }
        return con;
    }
}

