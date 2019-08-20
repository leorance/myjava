
import java.sql.*;
import javax.swing.JOptionPane;

public class selectnim {

    final static String Driver = "com.mysql.jdbc.Driver";
    final static String Url = "jdbc:mysql://localhost/belajar";
    final static String User = "root";
    final static String Pass = "";
    static Connection conn;
    static Statement st;
    static ResultSet rs;

    public static void main(String[] args) {
        String sql = "";
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(Url, User, Pass);
            st = conn.createStatement();
            int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim anda"));
            sql = "SELECT * FROM data WHERE nim=" + nim;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String x = "Nama : " + rs.getString("nama") + "\nNim : " + rs.getString("nim") + "\nJurusan : " + rs.getString("jurusan");
                JOptionPane.showMessageDialog(null, x);
            }
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
