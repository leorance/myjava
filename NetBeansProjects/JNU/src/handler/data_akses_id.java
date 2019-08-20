/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import data_class.customer;
import data_class.identity;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectionManager;

/**
 *
 * @author leorence
 */
public class data_akses_id {
    public static boolean insertData(identity id) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO Penerima VALUES ( "+id.getId_penerima()+",'"+id.getNama()+"','"+id.getProvinsi()+"','"+id.getKotkab()+"','"+id.getKec()+"','"+id.getKel()+"','"+id.getKp()+"','"+id.getStreet()+"','"+id.getNotelp()+"');";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
        return status;
    }
    
    public static boolean updateData(identity id) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
        return status;
    }
    
    public static boolean deleteData(identity id) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "DELETE FROM x WHERE nim = " + id.getId_penerima() + ";";
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
