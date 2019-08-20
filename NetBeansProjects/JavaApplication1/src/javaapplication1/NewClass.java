package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NewClass {

    public static void main(String[] args) {
        ArrayList angka = new ArrayList();
        int tampung = 0;
        int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa Nasabah?"));
        for (int i = 0; i < data; i++) {
            String nama = JOptionPane.showInputDialog(null, "Masukkan Nama");
            String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat");
            String nomor = JOptionPane.showInputDialog(null, "Masukkan Nomor Aktif");
            int pinjamm = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Jumlah Pinjaman"));
            int tanggal = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tanggal Pinjaman"));
            int bulan = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Bulan Pinjaman : \n1. Januari\n2. Februari\n3. Maret\n4. April\n5. Mei\n6. Juni\n7. Juli\n8. Agustus\n9. September\n10. Oktober\n11. November\n12. Desember"));
            int tahun = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tahun Pinjaman"));
            int hasil = 0;
            int pinjam = pinjamm;

            if (pinjam <= 5000000) {
                hasil = (pinjam * 5) / 100;
            } else if (pinjam > 5000000 && pinjam <= 10000000) {
                hasil = (pinjam * 10) / 100;
            } else if (pinjam > 10000000) {
                hasil = (pinjam * 20) / 100;
            }
            int bln = bulan + 1;
            int bulann = 0;
            if (bln < 12) {
                bulann = bln;
            } else if (bln >= 12) {
                bulann = bln - 12;
            }
            int buln = bulann;
            int thn = 0;
            if (buln == 1) {
                thn = tahun + 1;
            } else {
                thn = tahun;
            }

            //bulan lebh 12 di kurang 12
            hasil = hasil + pinjam;
            /*System.out.println("Total Pinjaman : " + hasil);
            System.out.println("Batas Terakhir Membayar : " + tanggal + " " + bulann + " " + thn);*/
            System.out.println("-===================================-");
            System.out.println("Nama : "+nama);
            System.out.println("Alamat : "+alamat);
            System.out.println("Nomor Hp : "+nomor);
            System.out.println("Meminjam Pada : "+tanggal+"-"+bulan+"-"+tahun);
            System.out.println("Total Pinjaman : Rp."+hasil);
            System.out.println("Batas Terakhir Pembayaran : "+ tanggal + "-"+bulann+"-"+thn);
        }
    }
}
