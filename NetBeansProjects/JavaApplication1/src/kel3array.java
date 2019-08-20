/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leorence
 */
public class kel3array {
    public static void main(String[] args) {
        int [] angka = new int [601];
//        100 nilai kelipatan 3
        for (int i = 1; i < 601; i++) {
            angka [i] = i;
            if (i % 3 == 0) {
                if (i % 2 != 0) {
                    angka [i] = i;
                    System.out.println(i);
                }
            }
        }
    }
}