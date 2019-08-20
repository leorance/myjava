/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_akses;

import data_class.data_customer;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectionManager;

/**
 *
 * @author leorence
 */
public class dacus {
    public static boolean insertData(data_customer cus) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO customer VALUES (null, '"+cus.getUser()+"','"+cus.getPw()+"','"+cus.getNama()+"','"+cus.getAlamat()+"', '"+cus.getKota()+"');";
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
