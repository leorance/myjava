
import java.sql.*;
import javax.swing.JOptionPane;

public class update {

    final static String Driver = "com.mysql.jdbc.Driver";
    final static String Url = "jdbc:mysql://localhost/belajar";
    final static String User = "root";
    final static String Pass = "";
    static Connection conn;
    static Statement st;

    public static void main(String[] args) {
        String sql, x;
        int nim, opsi;
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(Url, User, Pass);
            st = conn.createStatement();
            do {
                opsi = Integer.parseInt(JOptionPane.showInputDialog("Apa yang mau di rubah?\n\n1. Nama\n2. Jurusan\n\n(nim hanya bisa di rubah oleh admin)"));
            } while (opsi > 4 || opsi < 1);
            if (opsi == 1) {
                do {
                    x = JOptionPane.showInputDialog("Masukkan nama");
                } while (x.equalsIgnoreCase(""));
                nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim \n\n(nim orang yang datanya akan di ubah)"));
                sql = "UPDATE data SET nama = '" + x + "' WHERE nim = '" + nim + "'";
                st.executeUpdate(sql);
            } else if (opsi == 2) {
                do {
                    x = JOptionPane.showInputDialog("Masukkan jurusan");
                } while (x.equalsIgnoreCase(""));
                nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim \n\n(nim orang yang datanya akan di ubah)"));
                sql = "UPDATE data SET jurusan = '" + x + "' WHERE nim = '" + nim + "'";
                st.executeUpdate(sql);
            }
            JOptionPane.showMessageDialog(null, "Data berhasil di ubah!");
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
