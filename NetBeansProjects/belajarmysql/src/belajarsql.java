
import java.sql.*;

public class belajarsql {
// Menyiapkan paramter JDBC untuk koneksi ke datbase

    static final String driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost/belajar";
    static final String user = "root";
    static final String pass = "";
// Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(driver);

            // buat koneksi ke database
            conn = DriverManager.getConnection(url, user, pass);

            // buat objek statement
            stmt = conn.createStatement();

            // buat query ke database
            String sql = "SELECT * FROM data";

            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);

            // tampilkan hasil query
            while (rs.next()) {
                System.out.println("ID   : " + rs.getInt("id"));
                System.out.println("Nama : " + rs.getString("nama"));
                System.out.println("Nim  : " + rs.getString("nim"));
                System.out.println("Jurusan  : " + rs.getString("jurusan"));
                System.out.println("\n");
            }

            stmt.close();
            conn.close();

        } catch (Exception x) {
            x.printStackTrace();
        }

    }
}
//
//import java.sql.*;
//import javax.swing.JOptionPane;
//
//public class insert {
//
//    final static String Driver = "com.mysql.jdbc.Driver";
//    final static String Url = "jdbc:mysql://localhost/belajar";
//    final static String User = "root";
//    final static String Pass = "";
//    static Connection conn;
//    static Statement st;
//    static ResultSet rs;
//Pass
//    public static void main(String[] args) {
//        String nama, jurusan;
//        int nim;
//        try {
//            Class.forName(Driver);
//            conn = DriverManager.getConnection(Url, User, Pass);
//            st = conn.createStatement();
//            do {
//                nama = JOptionPane.showInputDialog("Nama");
//            } while (nama.equalsIgnoreCase(""));
//            do {
//                nim = Integer.parseInt(JOptionPane.showInputDialog("NIM"));
//            } while (nim == 0);
//            do{
//            jurusan = JOptionPane.showInputDialog("Jurusan");
//            } while(jurusan.equalsIgnoreCase(""));
//            String sql = "INSERT INTO data VALUES (null, '" + nama + "', '" + nim + "', '" + jurusan + "');";
//            st.executeUpdate(sql);
//            System.out.println("Data telah di masukkan!");
//            st.close();
//            conn.close();
//        } catch (Exception e) {
//            System.out.println("Data gagal di masukkan");
//        }
//    }
//}
