
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
public class NewClass5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int b;
        int[] nilai = new int[100];
        System.out.print("Masukkan jumlah data : ");
        x = input.nextInt();
        for (b=0;b<x;b++) {
            System.out.print("Masukkan nilai ke["+b+"] : ");
            nilai[b] = input.nextInt();
        }
        NewClass5.cetak(nilai,b);
    }

    private static void cetak(int[] nilai, int b) {
        int c;
        System.out.println("Percetakan nilai");
        for (c = 0; c < b; c++) {
            System.out.println("Nilai ke["+c+"] : "+nilai[c]);
            
        }
    }
}