
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author leorence
 */
public class Nilaiarray {

    public static void main(String[] args) {
        double n = 0;
        String nama;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int jd = Integer.parseInt(JOptionPane.showInputDialog("Mau berapa mahasiswa"));
        int[] nilai = new int[jd];
        nama = JOptionPane.showInputDialog("Masukkan nama anda");
        int x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai : "));
        int max = 0;
        int min = 1000;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        if (max > temp1) {
            max = temp1;
        }
        else if (temp1 > temp2) {
            temp1 = temp2;
        }
        if (temp2 > temp3) {
            temp2 = temp3;
        }
        int nr = jd / x;
        System.out.println("Nama Peserta : " + nama);
        System.out.println("\nNilai tertinggi 1 : " + temp3);
        System.out.println("\nNilai tertinggi 2 : " + temp2);
        System.out.println("\nNilai tertinggi 3 : " + temp1);
    }
}
