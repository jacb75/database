package cl.cmpc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        System.out.println("Hello Prueba");
        try {
            conn = DriverManager.getConnection(args[0],args[1],args[2]);
            System.out.println("Conectados a PostgreSQL");

        }catch(SQLException ex) {
            System.err.println("Error en conexion a Base de datos " + ex.getMessage());
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) { /* Ignored */}
            }
        }

    }
}
