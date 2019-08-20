
import java.util.Scanner;

public class LeaderAnalytProgram {

    public static void main(String[] args) {
        int brs = 0;
        int kol = 0;
        int MAX = 0;
        String kota = "";
        int[][] data = new int[5][6];
        int[] total = new int[6];
        Scanner input = new Scanner(System.in);
        total[0] = 0;
        System.out.println("Toko Bercabang");
        for (kol = 1; kol < 6; kol++) {
            for (brs = 1; brs < 5; brs++) {
                if (kol == 1) {
                    kota = "Jakarta";
                } else if (kol == 2) {
                    kota = "Medan";
                } else if (kol == 3) {
                    kota = "Palembang";
                } else if (kol == 4) {
                    kota = "Surabaya";
                } else if (kol == 5) {
                    kota = "Bandung";
                }
                System.out.print("Masukkan pendapatan untuk Kota " + kota + " dan toko ke [" + brs + "]    : ");
                data[brs][kol] = input.nextInt();
                total[kol] = total[kol] + data[brs][kol];
            }
            System.out.println("Total keuntungan di Kota [" + kota + "] : " + total[kol]);
            if (total[kol] > MAX) {
                MAX = total[kol];
            }
        }
        int min = MAX;
        for (kol = 1; kol < 6; kol++) {

            if (total[kol] < min) {
                min = total[kol];
                  if (kol == 1) {
                    kota = "Jakarta";
                } else if (kol == 2) {
                    kota = "Medan";
                } else if (kol == 3) {
                    kota = "Palembang";
                } else if (kol == 4) {
                    kota = "Surabaya";
                } else if (kol == 5) {
                    kota = "Bandung";
                }
            }
        }

        System.out.println("Kota " + kota + " Bankrut");
    }
}