package kuis;
import javax.swing.JOptionPane;

public class no2 {

    public static void main(String[] args) {
        String a, b, c;
        int suara1 = 0;
        int suara2 = 0;
        int suara3 = 0;
        int v;
        String nama[];
        nama = new String[16];
        do {
            a = JOptionPane.showInputDialog("Masukkan kepala suku ke - 1");
        } while (a.equalsIgnoreCase(""));
        do {
            b = JOptionPane.showInputDialog("Masukkan kepala suku - 2");
        } while (b.equalsIgnoreCase(""));
        do {
            c = JOptionPane.showInputDialog("Masukkan kepala suku - 3");
        } while (c.equalsIgnoreCase(""));
        for (int i = 0; i < nama.length; i++) {
            do {
                nama[i] = JOptionPane.showInputDialog("Masukkan nama pemilih");
                if (nama[i].equalsIgnoreCase(a)) {
                    JOptionPane.showMessageDialog(null, "Anda sudah menjadi kepala suku");
                } else if (nama[i].equalsIgnoreCase(b)) {
                    JOptionPane.showMessageDialog(null, "Anda sudah menjadi kepala suku");
                } else if (nama[i].equalsIgnoreCase(c)) {
                    JOptionPane.showMessageDialog(null, "Anda sudah menjadi kepala suku");
                }
            } while (nama[i].equalsIgnoreCase(a) || nama[i].equalsIgnoreCase(b) || nama[i].equalsIgnoreCase(c));
        }
        do {
            for (int i = 0; i < nama.length; i++) {
                v = Integer.parseInt(JOptionPane.showInputDialog("Pilih kepala suku\n1. " + a + "\n2. " + b + "\n3. " + c));
                if (v == 1) {
                    JOptionPane.showMessageDialog(null, nama[i] + ", telah memilih " + a + " Sebagai kepala suku");
                    suara1 = suara1 + 1;
                }
                if (v == 2) {
                    JOptionPane.showMessageDialog(null, nama[i] + ", telah memilih " + b + " Sebagai kepala suku");
                    suara2 = suara2 + 1;
                }
                if (v == 3) {
                    JOptionPane.showMessageDialog(null, nama[i] + ", telah memilih " + c + " Sebagai kepala suku");
                    suara3 = suara3 + 1;
                }
            }
            if (suara1 > suara2 && suara1 > suara3) {
                JOptionPane.showMessageDialog(null, "Selamat, " + a + " Telah menjadi Kepala suku!\n\nDengan perolehan suara : " + suara1);
                System.exit(0);
            } else if (suara2 > suara1 && suara2 > suara3) {
                JOptionPane.showMessageDialog(null, "Selamat, " + b + " Telah menjadi Kepala suku!\n\nDengan perolehan suara : " + suara2);
                System.exit(0);
            } else if (suara3 > suara2 && suara3 > suara1) {
                JOptionPane.showMessageDialog(null, "Selamat, " + c + " Telah menjadi Kepala suku!\n\nDengan perolehan suara : " + suara3);
                System.exit(0);
            } else if (suara1 == suara2) {
                JOptionPane.showMessageDialog(null, a + " dan " + b + " Memiliki banyak suara yang sama dengan suara " + suara1 + " dan " + suara2);
                JOptionPane.showMessageDialog(null, "Pemungutan suara di ulang!");
            } else if (suara1 == suara3) {
                JOptionPane.showMessageDialog(null, a + " dan " + c + " Memiliki banyak suara yang sama dengan suara " + suara1 + " dan " + suara3);
                JOptionPane.showMessageDialog(null, "Pemungutan suara di ulang!");
            } else if (suara2 == suara3) {
                JOptionPane.showMessageDialog(null, b + " dan " + c + " Memiliki banyak suara yang sama dengan suara " + suara2 + " dan " + suara3);
                JOptionPane.showMessageDialog(null, "Pemungutan suara di ulang!");

            }
        } while (true);
    }
}
