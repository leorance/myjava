
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leorence
 */
public class NewClass1 {
    public static void main(String[] args) {
        String [][] nilai= new String[3][2];
        nilai[0][0] = JOptionPane.showInputDialog("Masukkan nama 1 :");
        nilai[0][1] = JOptionPane.showInputDialog("Masukkan nilai 1 :");
        nilai[1][0] = JOptionPane.showInputDialog("Masukkan nama 2 :");
        nilai[1][1] = JOptionPane.showInputDialog("Masukkan nilai 2 :");
        nilai[2][0] = JOptionPane.showInputDialog("Masukkan nama 3 :");
        nilai[2][1] = JOptionPane.showInputDialog("Masukkan nilai 3 :");
        System.out.println(nilai[0][0]);
        System.out.println(nilai[0][1]);
        System.out.println(nilai[1][0]);
        System.out.println(nilai[1][1]);
        System.out.println(nilai[2][0]);
        System.out.println(nilai[2][1]);
    }
}
