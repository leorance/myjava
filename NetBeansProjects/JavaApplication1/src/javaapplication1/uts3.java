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
public class uts3{
    public static void main(String[] args) {
        int tpd = Integer.parseInt(JOptionPane.showInputDialog("Tingkat kepercayaan diri"));
        int tk = Integer.parseInt(JOptionPane.showInputDialog("Tingkat Kesulitan"));
        int peluang = (tpd*2)-(tk*3);
        if(peluang >= 0 && peluang < 50 && tpd <50){
            System.out.println("Harus lebih percaya diri!!");
        }
        else if (peluang >= 0 && peluang < 50 && tk > 50){
            System.out.println("Harus banyak belajar!!");
        }
        else if(peluang >= 0 && peluang < 50 && tpd < 50 && tk > 50){
            System.out.println("Harus belajar dan percaya diri!!");
        }
        else if (peluang < 0){
            System.out.println("0");
        }
        
    }
}