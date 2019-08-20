package kuis;

import javax.swing.JOptionPane;

public class no3 {

    public static void main(String[] args) {
        String uks = "";
        JOptionPane.showMessageDialog(null, "Selamat datang di restoran kami.");
        String nama = JOptionPane.showInputDialog("Masukkan nama anda");
        int paket = Integer.parseInt(JOptionPane.showInputDialog("Hallo, " + nama + " Mau paket apa : \n1. Paket A, Chicken Katsu & Karage\n2. Paket B, Yakiniku & Mabo Tofu\n3. Paket C, Shrimp Roll & Spicy Wings"));
        if (paket == 1) {
            JOptionPane.showMessageDialog(null, nama + " Memilih Paket A");
            int ukuran = Integer.parseInt(JOptionPane.showInputDialog("Mau ukuran apa : \n"
                    + "1. Family size, Katsu & Yakiniku large, 6 Karage, 4 Mabo Tofu, 6 Shrimp Roll, dan 10 Spicy wings\n"
                    + "2. Single size, Katsu & Yakiniku medium, 4 Karage, 1 Mabo Tofu, 2 Shrimp Roll, dan 2 Spicy Wings\n"
                    + "3. Kids size, Katsu & Yakiniku small, 2 Karage, 1 Mabo Tofu, Shrimp Roll, 2 Spicy Wings"));
            if (ukuran == 1) {
                uks = "Family size, Katsu & Yakiniku large,\n6 Karage, \n4 Mabo Tofu, \n6 Shrimp Roll, \n10 Spicy wings";
            }
            if (ukuran == 2) {
                uks = "Single size, Katsu & Yakiniku medium, \n4 Karage, \n1 Mabo Tofu, \n2 Shrimp Roll, \n2 Spicy Wings";
            }
            if (ukuran == 3) {
                uks = "Kids size, Katsu & Yakiniku small, \n2 Karage, \n1 Mabo Tofu, \n1 Shrimp Roll, \n2 Spicy Wings";
            }
            JOptionPane.showMessageDialog(null, "No. Pesanan 24\nAtas nama : " + nama + "\nPaket : A\nUkuran : " + uks);
        }
        if (paket == 2) {
            JOptionPane.showMessageDialog(null, nama + " Memilih Paket B");
            int ukuran = Integer.parseInt(JOptionPane.showInputDialog("Mau ukuran apa : \n"
                    + "1. Family size, Katsu & Yakiniku large, 6 Karage, 4 Mabo Tofu, 6 Shrimp Roll, dan 10 Spicy wings\n"
                    + "2. Single size, Katsu & Yakiniku medium, 4 Karage, 1 Mabo Tofu, 2 Shrimp Roll, dan 2 Spicy Wings\n"
                    + "3. Kids size, Katsu & Yakiniku small, 2 Karage, 1 Mabo Tofu, Shrimp Roll, 2 Spicy Wings"));
            if (ukuran == 1) {
                uks = "Family size, Katsu & Yakiniku large,\n6 Karage, \n4 Mabo Tofu, \n6 Shrimp Roll, \n10 Spicy wings";
            }
            if (ukuran == 2) {
                uks = "Single size, Katsu & Yakiniku medium, \n4 Karage, \n1 Mabo Tofu, \n2 Shrimp Roll, \n2 Spicy Wings";
            }
            if (ukuran == 3) {
                uks = "Kids size, Katsu & Yakiniku small, \n2 Karage, \n1 Mabo Tofu, \n1 Shrimp Roll, \n2 Spicy Wings";
            }
            JOptionPane.showMessageDialog(null, "No. Pesanan 24\nAtas nama : " + nama + "\nPaket : B\nUkuran : " + uks);
        }
        if (paket == 3) {
            JOptionPane.showMessageDialog(null, nama + " Memilih Paket C");
            int ukuran = Integer.parseInt(JOptionPane.showInputDialog("Mau ukuran apa : \n"
                    + "1. Family size, Katsu & Yakiniku large, 6 Karage, 4 Mabo Tofu, 6 Shrimp Roll, dan 10 Spicy wings\n"
                    + "2. Single size, Katsu & Yakiniku medium, 4 Karage, 1 Mabo Tofu, 2 Shrimp Roll, dan 2 Spicy Wings\n"
                    + "3. Kids size, Katsu & Yakiniku small, 2 Karage, 1 Mabo Tofu, Shrimp Roll, 2 Spicy Wings"));
            if (ukuran == 1) {
                uks = "Family size, Katsu & Yakiniku large,\n6 Karage, \n4 Mabo Tofu, \n6 Shrimp Roll, \n10 Spicy wings";
            }
            if (ukuran == 2) {
                uks = "Single size, Katsu & Yakiniku medium, \n4 Karage, \n1 Mabo Tofu, \n2 Shrimp Roll, \n2 Spicy Wings";
            }
            if (ukuran == 3) {
                uks = "Kids size, Katsu & Yakiniku small, \n2 Karage, \n1 Mabo Tofu, \n1 Shrimp Roll, \n2 Spicy Wings";
            }
            JOptionPane.showMessageDialog(null, "No Pesanan 24\nAtas nama : " + nama + "\nPaket : C\nUkuran : " + uks);
        }
    }
}
