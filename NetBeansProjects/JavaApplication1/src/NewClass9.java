
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author leorence
 */
public class NewClass9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total[] = null;
        int hasil[][];
        int min = 0;
        hasil = new int[4][4];
        total = new int[4];
        System.out.println("DATA PEROLEHAN PENDAPATAN TOKO MAINAN");
        for (int kol = 0; kol < hasil.length; kol++) {
            for (int bar = 0; bar < hasil[kol].length; bar++) {
                int i = total[bar];
                System.out.print("Masukkan pendapatan kota ke [" + bar + "] daerah ke [" + kol + "] : ");
                hasil[bar][kol] = input.nextInt();
            }
            for (int i = 0; i < hasil.length; i++) {
                for (int j = 0; j < hasil[i].length; j++) {
                    
                }
            }
        }
    }
}