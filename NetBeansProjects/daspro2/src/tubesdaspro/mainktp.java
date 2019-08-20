package tubesdaspro;

import external.*;
//import java.util.Scanner;?
import javax.swing.JOptionPane;

public class mainktp {

    public void isidata(data isi) {
        isi.ktp();
        isi.verifikasi();
    }

    public static void main(String[] args) {
        try {
            do {
                String x = JOptionPane.showInputDialog("ada 4 data \n\"l\" untuk leo\n\"c\" untuk celvin\n\n*2 Data external*\n\n\"a\" Untuk andi\n\"b\" Untuk Bimo");
                mainktp katepe = new mainktp();
                if (x.equalsIgnoreCase("l")) {
                    katepe.isidata(new leo("Leorance", "Laki - Laki", "Mahasiswa", "WNI", "Bandung, 24-08-1999"));
                    System.out.println("\n------------------------------------------\n");
                    JOptionPane.showMessageDialog(null, "Data akan muncul di output");
                    System.exit(0);
                } else if (x.equalsIgnoreCase("c")) {
                    katepe.isidata(new celvin("Celvin", "Laki - Laki", "Mahasiswa", "WNI", "Jakarta, 29-11-2000"));
                    System.out.println("\n------------------------------------------\n");
                    JOptionPane.showMessageDialog(null, "Data akan muncul di output");
                    System.exit(0);
                } else if (x.equalsIgnoreCase("a")) {
                    katepe.isidata(new akw("Andi Kurniawan", "Laki - Laki", "Mahasiswa", "WNI", "Tasikmalaya, 15-03-2000"));
                    System.out.println("\n------------------------------------------\n");
                    JOptionPane.showMessageDialog(null, "Data akan muncul di output");
                    System.exit(0);
                } else if (x.equalsIgnoreCase("b")) {
                    katepe.isidata(new bimo("Ignatius Aryo Bimo D", "Laki - Laki", "Mahasiswa", "WNI", "Solo, 29-09-2000"));
                    System.out.println("\n------------------------------------------\n");
                    JOptionPane.showMessageDialog(null, "Data akan muncul di output");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Inputan salah!");
                }
            } while (true);
        } catch (Exception x){
            JOptionPane.showMessageDialog(null, "Terimakasih, Selamat tinggal!");
            System.exit(0);
        }
    }
}