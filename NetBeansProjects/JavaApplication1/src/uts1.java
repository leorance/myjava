
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class uts1 {

    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        ArrayList y = new ArrayList();
        String nama;
        int nilai;
        for (int i = 0; i < 3; i++) {
            nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai"));
            if (nilai % 2 == 1) {
                x.add(nilai);
            } else {
                y.add(nilai);
            }
        }
        System.out.println("nilai Genap : "+y);
        System.out.println("nilai Ganjil : "+x);
    }
}