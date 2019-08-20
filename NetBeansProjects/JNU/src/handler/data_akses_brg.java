/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import data_class.barang;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectionManager;

/**
 *
 * @author leorence
 */
public class data_akses_brg {
    public static boolean insertData(barang brg) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO Barang VALUES ("+brg.getId_barang()+", '"+brg.getNamabarang()+"', "+brg.getId_penerima()+");";
            String query1 = "INSERT INTO Pendapatan VALUES ("+brg.getNoresi()+", "+brg.getBerat()+", "+brg.getTotal()+");";
            String query2 = "INSERT INTO Jenis_Pengiriman VALUES ("+brg.getId_barang()+", "+brg.getNoresi()+", '"+brg.getJenispengiriman()+"', '"+brg.getJenisbarang()+"');";
            String query3 = "INSERT INTO Barang_Masuk VALUES ("+brg.getId_barang()+", '"+brg.getTahun()+"/"+brg.getBulan()+"/"+brg.getTanggal()+"');";
            System.out.println(query);
            System.out.println(query1);
            System.out.println(query2);
            System.out.println(query3);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
            st.executeUpdate(query1);
            st.executeUpdate(query2);
            st.executeUpdate(query3);
        } catch (SQLException e) {
            System.err.println("Error : "+e);
        }
        conn.logOff();
        return status;
    }
}
