/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;

import data_class.nilai;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.ConnectionManager;

/**
 *
 * @author leorence
 */
public class data_akses {
    public static boolean insertData(nilai nilai) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "insert into 1218017_Nilai values ('"+nilai.getNim()+"','"+nilai.getNama()+"',"+nilai.getNilai_tugas()+","+nilai.getNilai_kuis1()+","+nilai.getNilai_uts()+","+nilai.getNilai_kuis2()+","+nilai.getNilai_tb()+","+nilai.getNilai_uas()+");";
            System.out.println(query);
            Statement st = (Statement) con.createStatement();
            status = st.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn.logOff();
        return status;
    }
    public static boolean updateData(nilai nilai) {
        ConnectionManager conn = new ConnectionManager();
        Connection con = conn.logOn();
        boolean status = false;
        try {
            String query = "update 1218017_Nilai'"+nilai.getNim()+"','"+nilai.getNama()+"',"+nilai.getNilai_tugas()+","+nilai.getNilai_kuis1()+","+nilai.getNilai_uts()+","+nilai.getNilai_kuis2()+","+nilai.getNilai_tb()+","+nilai.getNilai_uas()+";";
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
