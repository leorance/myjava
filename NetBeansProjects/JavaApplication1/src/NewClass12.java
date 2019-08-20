
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leorence
 */
public class NewClass12 {
    public static void main(String[] args) {
//        variable nilai
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, nr = 0;
//        nilai akhir
        String AP = "A+";
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
//        program studi
        int pd;
        String f = "Fisika";
        String k = "Kimia";
        String b = "Biologi";
        String e = "Ekonomi";
        String g = "Geografi";
        String s = "Sosiologi";
        String mat = "Matematika";
        String bi = "Bahasa Indonesia";
        String bing = "Bahasa Inggris";
//        studi minat
        int sm = 0;
        int ms = 0;
        String nama = null;
        String total = "";
//        pengenalan program
        JOptionPane.showMessageDialog(null,
                "**********************************\n Program beasiswa online\n**********************************\n\n\tOleh : \n\tLeorence Satumalay\n\tIgnatius Aryo Bimo Danudoro", "Beasiswa", INFORMATION_MESSAGE);
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Mau berapa mahasiswa"));
        for (int i = 1; i <= x; i++) {
//          pengenalan nama siswa
            nama = JOptionPane.showInputDialog(null, "Masukkan nama peserta", "Beasiswa", INFORMATION_MESSAGE);
//        penginputan nilai
            do {
                n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai " + mat, "Beasiswa", INFORMATION_MESSAGE));
            } while (n1 > 100);
            do {
                n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai " + bi, "Beasiswa", INFORMATION_MESSAGE));
            } while (n2 > 100);
            do {
                n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai " + bing, "Beasiswa", INFORMATION_MESSAGE));
            } while (n3 > 100);
            do {
                pd = Integer.parseInt(JOptionPane.showInputDialog("1. IPA\n2. IPS"));
            } while (pd > 2);
            do {
                if (pd == 1) {
                    sm = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nama studi minat\n1. Fisika\n2. Kimia\n3. Biologi", "Beasiswa", INFORMATION_MESSAGE));
                } else if (pd == 2) {
                    ms = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nama studi minat\n1. Ekonomi\n2. Geografi\n3. Sosiologi", "Beasiswa", INFORMATION_MESSAGE));
                }
            } while (pd > 3 || sm > 3 || ms > 3);
//        list studi minat
            do {
                if (sm == 1) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai Fisika","Beasiswa", INFORMATION_MESSAGE));
                } else if (sm == 2) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai Kimia", "Beasiswa", INFORMATION_MESSAGE));
                } else if (sm == 3) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai Biologi", "Beasiswa", INFORMATION_MESSAGE));
                }
            } while (sm > 3 || n4 > 100);
            do {
                if (ms == 1) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai Ekonomi", "Beasiswa", INFORMATION_MESSAGE));
                } else if (ms == 2) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai Geografi", "Beasiswa", INFORMATION_MESSAGE));
                } else if (ms == 3) {
                    n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai Sosiologi", "Beasiswa", INFORMATION_MESSAGE));
                }
            } while (ms > 3 || n4 > 100);
//        rumus nilai rata - rata
            nr = (n1 + n2 + n3 + n4) / 4;
//        seleksi persen beasiswa
            if (nr < 50) {
                System.out.println("\nMaaf " + nama + " anda tidak lulus jalur beasiswa");
            } else if (nr >= 51 && nr <= 70) {
                System.out.println("\nSelamat " + nama + " anda mendapat beasiswa sebesar 25%");
            } else if (nr >= 70 && nr <= 75) {
                System.out.println("\nSelamat " + nama + " anda mendapat beasiswa sebesar 50%");
            } else if (nr >= 75 && nr <= 80) {
                System.out.println("\nSelamat " + nama + " anda mendapat beasiswa sebesar 75%");
            } else if (nr >= 80 && nr <= 100) {
                System.out.println("\nSelamat " + nama + " anda mendapat beasiswa sebesar 100%");
            }
//        pengurutan data/value
            double[] nilai = {n1, n2, n3, n4};
            double max = 0;
            double min = 1000;
            for (int a = 0; a < nilai.length; a++) {
                if (nilai[a] > max) {
                    max = nilai[a];
                } else if (nilai[a] < min) {
                    min = nilai[a];
                }
            }
//            output
            System.out.println("\nNama  Peserta   :" + nama);
            System.out.println("\nMata pelajaran " + mat + " Nilai = " + n1);
            System.out.println("\nMata pelajaran " + bi + " Nilai = " + n2);
            System.out.println("\nMata pelajaran " + bing + " Nilai = " + n3);
            if (sm == 1) {
                System.out.println("\nMata pelajaran " + f + " Nilai = " + n4);
            } else if (sm == 2) {
                System.out.println("\nMata pelajaran " + k + " Nilai = " + n4);
            } else if (sm == 3) {
                System.out.println("\nMata pelajaran " + b + " Nilai = " + n4);
            } else if (ms == 1) {
                System.out.println("\nMata pelajaran " + e + " Nilai = " + n4);
            } else if (ms == 2) {
                System.out.println("\nMata pelajaran " + g + " Nilai = " + n4);
            } else if (ms == 3) {
                System.out.println("\nMata pelajaran " + s + " Nilai = " + n4);
            }
            System.out.println("\n\nNilai Terbesar  : " + max);
            System.out.println("\nNilai Rata-Rata : " + nr);
            System.out.println("\nNilai Terkecil  : " + min);
            if (nr <= 0) {
                System.out.println("\nrata rata nilai akhir : " + E);
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            } else if (nr >= 0 && nr <= 50) {
                System.out.println("\nrata rata nilai akhir : " + D);
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            } else if (nr >= 50 && nr <= 64) {
                System.out.println("\nrata rata nilai akhir : " + C);
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            } else if (nr >= 65 && nr <= 70) {
                System.out.println("\nrata rata nilai akhir : " + B);
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            } else if (nr >= 70 && nr <= 75) {
                System.out.println("\nrata rata nilai akhir : " + B + "+");
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            } else if (nr >= 75 && nr <= 80) {
                System.out.println("\nrata rata nilai akhir : " + A);
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            } else if (nr >= 80 && nr <= 100) {
                System.out.println("\n\nrata rata nilai akhir : " + A + "+");
                System.out.println();
                System.out.println("\n-=====================================================-");
                System.out.println();
            }
//            JOptionPane.showMessageDialog(null, total);
        }
            JOptionPane.showMessageDialog(null, "Nama Peserta : "+nama);
    }
}