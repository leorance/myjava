//3
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import data_class.customer;
import java.sql.Connection;
import java.sql.ResultSet;
import koneksi.ConnectionManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leorence
 */
public class data_akses_customer {

    public static boolean insertData(customer cus) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO penjualan VALUES ( '" + cus.getBarang() + "', '" + cus.getHarga() + "', " + cus.getQty() + ", '" + cus.getTotal() + "', '" + cus.getVia() + "');";
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
