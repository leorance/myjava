
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewClass8 {

    public static void main(String[] args) {
        int u = 0;
        int bt = 3;
        ArrayList n = new ArrayList();
        ArrayList ni = new ArrayList();
        u = Integer.parseInt(JOptionPane.showInputDialog("Terdapat berapa mahasiswa ? "));
        for (int i = 0; i < u; i++) {
            String namaMahasiswa = JOptionPane.showInputDialog("Masukkan nama mahasiswa");
            n.add(namaMahasiswa);
        }
        for (int i = 0; i < bt; i++) {
            int nilaiMahasiswa = Integer.parseInt(JOptionPane.showInputDialog("Input nilai mahasiswa"));
            ni.add(nilaiMahasiswa);
        }
        System.out.println("Mahasiswa yang di masukkan : " + n);
        System.out.println("Nilai mahasiswa : " + ni);
    }
}
