package kuis;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class no1b {
    public static void main(String[] args) {
//        Arraylist
        ArrayList x = new ArrayList();
        String nama;
        int nilai, app, ubah1, hapus, ubah2;
        nama = JOptionPane.showInputDialog("Masukkan nama ");
        do{
            app = Integer.parseInt(JOptionPane.showInputDialog("Hallo, "+nama+"!\n1. Masukkan nilai\n2. Lihat nilai\n3. Hapus nilai\n4. Ubah nilai\n5. Exit"));
            if (app == 1) {
                nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
                x.add(nilai);
            }
            else if (app == 2) {
                System.out.println("Nilai kamu : "+x);
            }
            else if (app == 3) {
                hapus = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ke berapa yang mau di ubah\n(Indeks di mulai dari 0)"));
                x.remove(hapus);
            }
            else if (app == 4) {
                ubah1 = Integer.parseInt(JOptionPane.showInputDialog("Indeks ke berapa yang mau di rubah\n(Indeks di mulai dari 0)"));
                ubah2 = Integer.parseInt(JOptionPane.showInputDialog("Mau jadi berapa nilainya"));
                x.set(ubah1, ubah2);
                System.out.println("Nilai kamu sekarang : "+x);
            }
            else if(app == 5){
                System.exit(0);
            }
        }while(true);
    }
}
