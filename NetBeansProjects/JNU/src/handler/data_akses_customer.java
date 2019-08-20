/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import data_class.customer;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectionManager;

/**
 *
 * @author leorence
 */
public class data_akses_customer {
    public static boolean insertData(customer c) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO Customer VALUES ("+c.getId_customer()+", "+c.getId_barang()+", '"+c.getStatus_pengiriman()+"', '"+c.getNama_customer()+"', '"+c.getNama_perusahaan()+"', '"+c.getNomor_telefon()+"');";
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
