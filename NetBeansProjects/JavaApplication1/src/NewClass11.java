
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class NewClass11 {
    public static void main(String[] args) {
        ArrayList<Integer> deret = new ArrayList<Integer>();
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;

        for (int i = 0; i < 10; i++) {
            deret.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Nilai ke-" + (i + 1))));
        }

        for (int i = 0; i < deret.size(); i++) {
            if (deret.get(i) > temp1) {
                temp1 = deret.get(i);
            }
        }
        deret.remove(deret.indexOf(temp1));

        System.out.println("Tertinggi 1 = " + temp1);

        for (int i = 0; i < deret.size(); i++) {
            if (deret.get(i) > temp2) {
                temp2 = deret.get(i);
            }
        }
        deret.remove(deret.indexOf(temp2));

        System.out.println("Tertinggi 2 = " + temp2);

        for (int i = 0; i < deret.size(); i++) {
            if (deret.get(i) > temp3) {
                temp3 = deret.get(i);
            }
        }
        deret.remove(deret.indexOf(temp3));

        System.out.println("Tertinggi 3 = " + temp3);

        double rata = (temp1 + temp2 + temp3) / 3;
        System.out.println("Rata-rata 3 nilai tertinggi = " + rata);
    }

}