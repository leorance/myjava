
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class belajarlagi {

    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        for (int i = 0; i < 3; i++) {
            String nama =JOptionPane.showInputDialog("Masukkan nama");
        }
        System.out.println("nama : "+x);
    }
}
