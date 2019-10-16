
import javax.swing.JOptionPane;

public class ATM {

    public static void main(String[] args) {
        int i = 0;
        int x = 0;
        boolean pinn = false;
        for (int j = 0; j < 3; j++) {
            int pin = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan pin anda"));
            if (pin == 1234) {
                JOptionPane.showMessageDialog(null, "Pin benar!");
                pinn = true;
                break;
            } else if (pin != 1234) {
                JOptionPane.showMessageDialog(null, "Pin salah!");
            }
        }
        if (pinn == false) {
            JOptionPane.showMessageDialog(null, "Anda terblokir");
        }
    }
}