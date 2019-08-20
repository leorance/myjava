
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class uas3 {

    public static void main(String[] args) {
        ArrayList pertemanan = new ArrayList();
        JOptionPane.showMessageDialog(null, "Aplikasi Temanku");
        do {
            int opsi = Integer.parseInt(JOptionPane.showInputDialog("Temanku!\n\n1. Tambahkan Teman\n2. Hapus pertemenan\n3. Lihat Temanku\n4. Keluar"));
            if (opsi == 1) {
                String teman = JOptionPane.showInputDialog("Tambahkan Teman");
                pertemanan.add(teman);
            }
            if (opsi == 2) {
                String hapus = JOptionPane.showInputDialog("Masukkan pertemanan keberapa yang mau di hapus\n(Masukkan namanya)");
                pertemanan.remove(hapus);
            }
            if (opsi == 3) {
                System.out.println("Temanku : "+pertemanan);
            }
            if (opsi == 4) {
                System.exit(0);
            }
        } while (true);
    }
}
