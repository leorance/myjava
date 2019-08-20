package awtbutton;

import javax.swing.JOptionPane;

public class NewClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("masukkan nilai y"));
        int ku = x * x;
        int ki = y * y;
        int yy = ku + ki;
        int oo = yy * yy;
        System.out.println(yy + " = "+ oo);
    }
}
