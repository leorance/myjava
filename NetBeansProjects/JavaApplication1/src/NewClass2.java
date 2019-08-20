
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leorence
 */
public class NewClass2 {
    public static void main(String[] args) {
        String[][] nilai = new String[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 2; j++) {
                nilai[i][j] = JOptionPane.showInputDialog("hello");
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(nilai[i][j]);
            }
        }
    }
}