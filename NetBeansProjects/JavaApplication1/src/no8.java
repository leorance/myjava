import java.util.Scanner;
public class no8 {
    public static void main(String[] args) {

        int brs = 0;
        int kol = 0;
        int[][] kota = new int[4][5];
        int[] total = new int[5];
        Scanner Input = new Scanner(System.in);
        total[0] = 0;
        total[1] = 0;
        total[2] = 0;
        total[3] = 0;
        total[4] = 0;

        System.out.println("DATA PEROLEHAN Pendapatan daerah");
        for (kol = 0; kol < 5; kol++) {
            for (brs = 0; brs < 4; brs++) {
                System.out.print("Masukan pendapatan ke [" + brs + "] dan kota ke [" + kol + "] : ");
                kota[brs][kol] = Input.nextInt();
                total[kol] = total[kol] + kota[brs][kol];
            }
            System.out.println("Total pendapatan kota ke [" + kol + "] : " + total[kol]);
        }
        if (total[0] < total[1] && total[0] < total[2] && total[0] < total[3] && total[0] < total[4]) {
            System.out.println("kota ke [0] ditutup");
        } else if (total[1] < total[0] && total[1] < total[2] && total[1] < total[3] && total[1] < total[4]) {
            System.out.println("kota ke [1] ditutup");
        } else if (total[2] < total[0] && total[2] < total[1] && total[2] < total[3] && total[2] < total[4]) {
            System.out.println("kota ke [2] ditutup");
        } else if (total[3] < total[0] && total[3] < total[1] && total[3] < total[2] && total[3] < total[4]) {
            System.out.println("kota ke [3] ditutup");
        } else if (total[4] < total[0] && total[4] < total[1] && total[4] < total[2] && total[4] < total[3]) {
            System.out.println("kota ke [4] ditutup");
        }
    }
}