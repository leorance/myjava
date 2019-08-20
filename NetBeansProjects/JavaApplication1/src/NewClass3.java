
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
public class NewClass3 {

    public static void main(String[] args) {
        double n = 0;
        String nama;
        int jd = Integer.parseInt(JOptionPane.showInputDialog("Mau berapa mahasiswa"));
        int[] nilai = new int[jd];
        for (int x = 0; x < nilai.length; x++) {
            nama = JOptionPane.showInputDialog("Masukkan nama anda");
            nilai[x] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 1 : "));
            nilai[x] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 2 : "));
            nilai[x] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai 3 : "));
            double max = 0;
            double min = 1000;
            for (int i = 0; i < nilai.length; i++) {
                if (nilai[i] > max) {
                    max = nilai[i];
                } else if (nilai[i] < min) {
                    min = nilai[i];
                }
            }
            int nr = nilai[x] / jd;
            System.out.println("\nNama Peserta : " + nama);
            System.out.println("\nNilai tertinggi : " + max);
            System.out.println("Nilai rata-rata : " + nr);
        }
    }
}
