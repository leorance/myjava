
import javax.swing.JOptionPane;

public class tiga_terbesar_array {

    public static void main(String[] args) {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int y = Integer.parseInt(JOptionPane.showInputDialog("Mau berapa angka"));
        for (int i = 1; i < y; i++) {
            int z = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));
            int angka[] = new int[z];
            for (int j = 0; j < y; j++) {
                if (angka[j] > max1) {
                    max1 = angka[j];
                }
            }
            for (int j = 0; j < y; j++) {
                if (angka[j] > max2 && angka[j] < max1) {
                    max2 = angka[j];
                }
            }
            for (int j = 0; j < y; j++) {
                if (angka[j] > max3 && angka[j] < max2) {
                    max3 = angka[j];
                }
            }
        }
            System.out.println("Tertinggi ke 1 " + max1);
            System.out.println("Tertinggi ke 2 " + max2);
            System.out.println("Tertinggi ke 3 " + max3);
    }
}
