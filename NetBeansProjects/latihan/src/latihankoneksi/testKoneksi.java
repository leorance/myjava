package latihankoneksi;
import java.sql.*;
public class testKoneksi {
    public static Connection conn;
    public static Statement stmt;
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/latihan";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            System.err.println("Connection failed! \nIssues : " + e.getMessage());
        }
    }
}
