
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
public class aa {
    public static void main(String[] args) {
//        int dialogButton = JOptionPane.YES_NO_CANCEL_OPTION;
        int x = JOptionPane.showConfirmDialog(null, "Yakin?");
        if (x == JOptionPane.YES_OPTION) {
            System.out.println("ea");
        } else if (x == JOptionPane.NO_OPTION) {
            System.out.println("owieowei");
        } else {
            System.exit(0);
        }
    }
}
