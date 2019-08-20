
import java.sql.*;
import javax.swing.JOptionPane;

public class delete {

    final static String Driver = "com.mysql.jdbc.Driver";
    final static String Url = "jdbc:mysql://localhost/belajar";
    final static String User = "root";
    final static String Pass = "";
    static Connection conn;
    static Statement st;

    public static void main(String[] args) {
        String sql;
        String tanya = "";
        int nim = 0;
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(Url, User, Pass);
            st = conn.createStatement();
            do {
                nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim\n\n(nim orang yang akan di hapus)"));
                tanya = JOptionPane.showInputDialog("Yakin mau di hapus? y/n");
            } while (tanya.equalsIgnoreCase("n"));
            sql = "DELETE FROM data WHERE nim = " + nim;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil di hapus!");
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
