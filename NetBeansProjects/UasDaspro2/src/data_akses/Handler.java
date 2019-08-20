/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_akses;

//import data_class.Barang;
import data_class.barang;
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
public class Handler {
    
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
    
    public static List<barang> getAllBarang() {
        List<barang> list_Barang = new ArrayList();
        ConnectionManager conManager = new ConnectionManager();
        Connection con = conManager.logOn();
        try {
            String query = "select * from barang";
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                barang brg = new barang();
//                brg.setId(rs.getInt(1));
                brg.setNama(rs.getString(2));
                brg.setJumlah(rs.getInt(3));
                list_Barang.add(brg);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        conManager.logOff();
        return list_Barang;
    }
    
    public static barang getJumlahBarang(String nama) {
        ConnectionManager conManager = new ConnectionManager();
        Connection con = conManager.logOn();
        barang brg = new barang();
        try {
            String query = "select * from barang where nama = '"+nama+"'";
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                
//                brg.setId(rs.getInt(1));
                brg.setNama(rs.getString(2));      
                brg.setJumlah(rs.getInt(3));
                System.out.println("Handler GET " + brg.getJumlah());
                System.out.println("Handler RS " + rs.getInt(3));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        conManager.logOff();
        return brg;
    }
}