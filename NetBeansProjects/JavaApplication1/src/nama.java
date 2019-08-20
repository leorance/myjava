
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class nama {

    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            angka.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai ke-" + (i + 1))));
        }

        for (int i = 0; i < angka.size(); i++) {
            if (angka.get(i) < 51) {
             System.out.println(angka.get(i));   
            }
        }
    }
}