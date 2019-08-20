/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author leorence
 */
public class uts2 {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Input : \n1. Tinggi Badan\n2. Berat Badan"));
        if (input == 1) {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi badan"));
            int bbi = (x/3) + (15/100 * x);
            System.out.println("Berat Badan ideal adalah : "+bbi);
        } 
        else if(input == 2){
            int y = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Berat Badan"));
            int tbi = (y*3) - (25/100*y);
            System.out.println("Tinggi Badan ideal adalah : "+tbi);
        }
        else{
            JOptionPane.showMessageDialog(null, "Inputan salah!!");
        }
    }
}
