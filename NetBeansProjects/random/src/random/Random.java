/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author leorence
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> s = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        String pertanyaan = null;

        do {
                System.out.println("\nSelamat datang, di sistem acak nama.\n\nBagaimana sistem bekerja ? \n1. Anda menginput banyaknya orang.\n2. Jika nama terpilih maka sistem akan berhenti.\n");
                System.out.print("Masukkan jumlah orang : ");
                int jmlorang = x.nextInt();
                int angkaacak = (int) (Math.random() * jmlorang);
                String nama[];
                nama = new String[jmlorang];
                System.out.println(angkaacak);
                for (int urutanangka = 0; urutanangka < nama.length; urutanangka++) {
                    System.out.print("Masukkan nama orang ke -" + (urutanangka + 1) + " : ");
                    nama[urutanangka] = x.next();
                }
                for (int orangterpilih = 0; orangterpilih < nama.length; orangterpilih++) {
                    if (orangterpilih == angkaacak) {
                        s.add(nama[orangterpilih]);
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print("1, ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print("2, ");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.print("3!");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("\n" + nama[orangterpilih] + ", Adalah orang yang terpilih.\n");
                        TimeUnit.SECONDS.sleep(2);
                    }
                }
                do {
                    System.out.print("Mau menggunakan aplikasi lagi? (ya/tidak) ");
                    pertanyaan = x.next();
                    if (pertanyaan.equalsIgnoreCase("ya")) {
                        System.out.println("Orang yang tadi terpilih " + s);
                        System.out.println("\n-== Ashiaap ==-");
                    } else if (pertanyaan.equalsIgnoreCase("tidak")) {
                        System.out.println("Orang yang tadi terpilih " + s);
                        System.exit(0);
                    } else {
                        System.out.println("Invalid input");
                    }
                } while (!pertanyaan.equalsIgnoreCase("ya") || pertanyaan.equalsIgnoreCase(""));
        } while (true);
    }
}