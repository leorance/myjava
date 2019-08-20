/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_akses;

//import data_class.Barang;
import data_class.
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import koneksi.ConnectionManager;

/**
 *
 * @author alvin
 */
public class data_akses_pinjam {

    public static boolean insertData(barang barang) {
        ConnectionManager conManager = new ConnectionManager();
        Connection con = conManager.logOn();
        boolean status = false;
        try {
            String query = "Insert into barang(nama,jumlah) values " + "('" + barang.getNama() + "'," + barang.getJumlah() + ")";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        conManager.logOff();
        return status;
    }

    public static boolean updateJumlahBarang(barang brg) {
        ConnectionManager conManager = new ConnectionManager();
        Connection con = conManager.logOn();
        boolean status = true;
        try {
            String query = "Update barang set jumlah = " + brg.getJumlah() + "where nama = '" + brg.getNama() + "';";
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        conManager.logOff();
        return status;
    }

    public static boolean deleteBarang(barang brg) {
        ConnectionManager conManager = new ConnectionManager();
        Connection con = conManager.logOn();
        boolean status = true;
        try {
            String query = "Delete from barang where nama = '" + brg.getNama() + "'";
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        conManager.logOff();
        return status;
    }
}
