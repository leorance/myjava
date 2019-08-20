
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class uas1 {
    public static void main(String[] args) {
//        Arraylist
        ArrayList x = new ArrayList();
        String nama;
        int nilai, app, ubah1, hapus, ubah2;
        nama = JOptionPane.showInputDialog("Masukkan nama ");
        do{
            app = Integer.parseInt(JOptionPane.showInputDialog("Hallo, "+nama+"!\n1. Masukkan nilai\n2. Lihat nilai\n3. Hapus nilai\n4. Ubah nilai\n5. Exit"));
            switch (app) {
                case 1:
                    nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
                    x.add(nilai);
                    break;
                case 2:
                    System.out.println("Nilai kamu : "+x);
                    break;
                case 3:
                    hapus = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ke berapa yang mau di ubah\n(Indeks di mulai dari 0)"));
                    x.remove(hapus);
                    break;
                case 4:
                    ubah1 = Integer.parseInt(JOptionPane.showInputDialog("Indeks ke berapa yang mau di rubah\n(Indeks di mulai dari 0)"));
                    ubah2 = Integer.parseInt(JOptionPane.showInputDialog("Mau jadi berapa nilainya"));
                    x.set(ubah1, ubah2);
                    System.out.println("Nilai kamu sekarang : "+x);
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }while(true);
    }
}