// 1
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yoan Julius
 */
public class ConnectionManager {
     String server;
    private Connection conn;
    private String username = "root";
    private String password = "";

    public ConnectionManager() {     
     
    }
    
    public Connection logOn() {
        server = "jdbc:mysql://localhost:3306/1218017_Leorence";
        System.out.println(server);
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(server, username, password);
            System.out.println("Koneksi sukses");

        } catch (SQLException e) {
            e.printStackTrace(System.err);
            JOptionPane.showMessageDialog(null, "Connection Failed " + e.toString());
            //System.out.println("Koneksi gagal" + e.toString());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.err);
            System.out.println("JDBC.ODBC driver tidak ditemukan");
        }
        return conn;
    }

    public void logOff() {
        try {
            conn.close();
            System.out.println("koneksi close");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
