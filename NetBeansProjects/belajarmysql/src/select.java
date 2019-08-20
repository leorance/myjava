
import java.sql.*;

public class select {

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
            sql = "SELECT * FROM data";
            rs = st.executeQuery(sql);
            int i = 1;
            while (rs.next()) {
                System.out.println(i + ". Nama    : " + rs.getString("nama"));
                System.out.println("   Nim     : " + rs.getString("nim"));
                System.out.println("   Jurusan : " + rs.getString("jurusan"));
                System.out.println();
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
