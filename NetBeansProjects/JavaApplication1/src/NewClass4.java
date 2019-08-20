/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leorence
 */
public class NewClass4 {
    public static void main(String[] args) {
        int[] nomor = new int [100];
        int x = 0;
        int i = 0;
        do {            
            if (i % 3 == 0 && i % 2 != 0 && x < 100) {
                nomor[x] = i;
                System.out.println(nomor[x]);
                x++;
            }
            i++;
        }while (x<100);
    }
}
