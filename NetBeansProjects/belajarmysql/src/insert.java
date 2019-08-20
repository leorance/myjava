
import java.sql.*;
import javax.swing.JOptionPane;

public class insert {

    static final String Driver = "com.mysql.jdbc.Driver";
    static final String Url = "jdbc:mysql://localhost/belajar";
    static final String User = "root";
    static final String Pass = "";
    static Connection conn;
    static Statement st;

    public static void main(String[] args) {
        String nama, jurusan;
        int nim;
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(Url, User, Pass);
            st = conn.createStatement();
            do {
                nama = JOptionPane.showInputDialog("Masukkan nama anda");
            } while (nama.equalsIgnoreCase(""));
            do {
                nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim anda"));
            } while (nim == 0);
            do {
                jurusan = JOptionPane.showInputDialog("Masukkan jurusan anda");
            } while (jurusan.equalsIgnoreCase(""));
            String sql = "INSERT INTO data VALUES ( null, '" + nama + "', '" + nim + "', '" + jurusan + "');";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Memasukkan data berhasil!\nData sudah di masukkan ke database");
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
