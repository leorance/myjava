
import java.util.ArrayList;
import javax.swing.JOptionPane;

// nilai, nama
public class cobalagi {

    public static void main(String[] args) {
        ArrayList x = new ArrayList();
        String nama;
        int nilai = 0, ubah = 0, del = 0, indeks = 0;
        nama = JOptionPane.showInputDialog("Masukkan nama");
        do {
            int app = Integer.parseInt(JOptionPane.showInputDialog("Hallo, " + nama + "! \n1. Masukkan nilai\n2. Ubah nilai\n3. Hapus nilai\n4. Liat nilai\n5. Exit"));
            if (app == 1) {
                do {
                    nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai"));
                } while (nilai > 101);
                x.add(nilai);
            } else if (app == 2) {
                indeks = Integer.parseInt(JOptionPane.showInputDialog("Mau nilai keberapa yang di ubah \n(Urutan dimulai dari [0])"));
                ubah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilainya"));
                x.set(indeks, ubah);
                System.out.println("Nilai telah di ubah : " + x);
            }
            if (app == 3) {
                del = Integer.parseInt(JOptionPane.showInputDialog("Mau nilai keberapa yang di hapus \n(Urutan dimulai dari [0])"));
                x.remove(del);
                System.out.println("Angka kamu sekarang : " + x);
            }
            if (app == 4) {
                System.out.println("Nilai kamu : " + x);
            }
            if (app == 5) {
                System.exit(0);
            }
        }while (true);
    }
}
