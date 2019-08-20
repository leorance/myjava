/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leorence
 */
public class gagearray {

    public static void main(String[] args) {
        int asli[], ganjil[], genap[];
        asli = new int[100];
        ganjil = new int[100];
        genap = new int[100];
        System.out.print("Pure : \n");
        for (int i = 1; i < 100; i++) {
            asli[i] = i;
            System.out.print(asli[i]);
            System.out.print(", ");
        }
        System.out.println("\n\nGenap : ");
        for (int j = 1; j < 100; j++) {
            genap[j] = j;
            if (j % 2 == 0) {
                System.out.print(genap[j]);
                System.out.print(", ");
            }
        }
        System.out.println("\n\nGanjil : ");
        for (int x = 0; x < 100; x++) {
            ganjil[x] = x;
            if (x % 2 == 1) {
                System.out.print(ganjil[x]);
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
