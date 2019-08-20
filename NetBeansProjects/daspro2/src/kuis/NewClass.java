package kuis;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int angka1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka ke 1"));
        int angka2 = Integer.parseInt(JOptionPane.showInputDialog("masukkan angka2"));
        int kali = angka1 * angka2;
        System.out.println(angka1+" * "+angka2+" = "+kali);
    }
}
