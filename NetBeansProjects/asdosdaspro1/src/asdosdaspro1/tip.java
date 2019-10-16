/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdosdaspro1;

import javax.swing.JOptionPane;

/**
 *
 * @author leorence
 */
public class tip {
    protected static int fitnessfee = 0;
    protected static int lunchfee = 0;
    protected static int massagefee = 0;
    public static void main(String[] args) {
        int jml = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah pendaftar"));
        int status;
        int fitness=0;
        int massage=0;
        int lunch=0;
        String name = "";
        for (int i = 0; i < jml; i++) {
            name = JOptionPane.showInputDialog("Masukkan nama anda");
            status = Integer.parseInt(JOptionPane.showInputDialog("Masukkan status :"
                    + "\n1. Premium"
                    + "\n2. VVIP"
                    + "\n3. VIP"));
            if (status == 1) {
                fitness = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah fitness entry"));
                if (fitness > 0) {
                    fitnessfee = fitness * 200000;
                }
                lunch = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah lunch entry"));
                if (lunch > 1) {
                    lunchfee = (lunch - 1)*200000;
                }
                massage = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah massage entry"));
                if (massage > 1) {
                    massagefee = (massage - 1)*500000;
                }
            } else if (status == 2) {
                fitness = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah fitness entry"));
                if (fitness > 2) {
                    fitnessfee = fitness * 400000;
                }
                lunch = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah lunch entry"));
                if (lunch > 2) {
                    lunchfee = (lunch - 2)*300000;
                }
                massage = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah massage entry"));
                if (massage > 2) {
                    massagefee = (massage - 2)*500000;
                }
            } else if (status == 3) {
                fitness = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah fitness entry"));
                if (fitness > 3) {
                    fitnessfee = (fitness - 3) * 400000;
                }
                lunch = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah lunch entry"));
                if (lunch > 3) {
                    lunchfee = (lunch - 3)*300000;
                }
                massage = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah massage entry"));
                if (massage > 3) {
                    massagefee = (massage - 3)*500000;
                }
            }
            System.out.println("Guest name : "+name);
            String stat = "";
            if (status == 1) {
                stat = "Premium";
            } else if (status == 2) {
                stat = "VIP";
            } else if (status == 3) {
                stat = "VVIP";
            }
            int total = fitnessfee + massagefee + lunchfee;
            System.out.println("Status : "+stat);
            System.out.println("Fitness : "+fitness);
            System.out.println("Fitness Charge : "+fitnessfee);
            System.out.println("Lunch : "+lunch);
            System.out.println("Lunch Charge : "+lunchfee);
            System.out.println("Massage : "+massage);
            System.out.println("Massage Charge : "+massagefee);
            System.out.println("Total = "+total);
            System.out.println("-=====================-");
            System.out.println();
        }
    }
}