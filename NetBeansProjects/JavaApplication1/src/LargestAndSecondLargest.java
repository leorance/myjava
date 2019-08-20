
import javax.swing.JOptionPane;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        int[] angka = null;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int total = 0;
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "mau berapa nilai"));
        for (int x = 0; x < y; x++) {
            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai"));
            angka[x] = a;
            if (angka[x] >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = angka[x];
            } else if (angka[x] < max1 && angka[x] >= max2 && max1 != max2) {
                max3 = max2;
                max2 = angka[x];
            } else if (angka[x] < max2 && angka[x] >= max3 && max2 != max3) {
                max3 = angka[x];
            }
            total = total + angka[x];
        }
        System.out.println("Rata - Rata : " + total / y);
        System.out.println("Tertinggi ke-1 :" + max1);
        System.out.println("Tertinggi ke-2 :" + max2);
        System.out.println("Tertinggi ke 3 :" + max3);
    }
}
