/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;
import data_class.menu;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectionManager;

/**
 *
 * @author leorence
 */
public class data_akses_menu {
    public static boolean insertData(menu menu) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO menu VALUES ("+menu.getId_menu()+", '"+menu.getNama()+"', '"+menu.getHarga()+"')";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
        return status;
    }
}
