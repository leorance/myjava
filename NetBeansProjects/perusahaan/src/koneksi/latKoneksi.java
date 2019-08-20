package koneksi;
import java.sql.*;
public class latKoneksi {
    public static Connection conn;
    public static Statement stmt;
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/perusahaan";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            stmt = conn.createStatement();
            System.out.println("database leo berhasil");
        } catch (Exception e) {
            System.err.println("database leo gagal");
        }
    }
}
