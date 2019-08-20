//3
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import data_class.mahasiswa;

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
public class data_akses {

    public static boolean insertData(mahasiswa mahasiswa) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "INSERT INTO mahasiswa VALUES ( '" + mahasiswa.getNama() + "', " + mahasiswa.getNim() + ");";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
        return status;
    }

    public static boolean updateData(mahasiswa mahasiswa) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "UPDATE mahasiswa SET nama = '" + mahasiswa.getNama() + "' WHERE nim = " + mahasiswa.getNim() + ";";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
        return status;
    }

    public static boolean deleteData(mahasiswa mahasiswa) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "DELETE FROM mahasiswa WHERE nim = " + mahasiswa.getNim() + ";";
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