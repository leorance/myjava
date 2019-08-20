
import javax.swing.JOptionPane;

public class uas {
    public static void main(String[] args) {
//    nomor 1 array 2 dimensi 4 baris 3 kolom
    String data[][];
    data = new String[4][3];
        for (int i = 0; i < 4; i++) {
            data[i][0] = JOptionPane.showInputDialog("Masukkan nama anda");
            data[i][1] = JOptionPane.showInputDialog("Masukkan NIM");
            data[i][2] = JOptionPane.showInputDialog("Masukkan alamat");
            System.out.println("\n-======================= Baris ke "+(i+1)+" ====================-");
            System.out.println("Nama : "+data[i][0]);
            System.out.println("Nim : "+data[i][1]);
            System.out.println("Alamat : "+data[i][2]);
        }
    }
}