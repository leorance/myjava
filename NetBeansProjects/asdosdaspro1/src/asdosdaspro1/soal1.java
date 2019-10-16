package asdosdaspro1;
import javax.swing.JOptionPane;
public class soal1 {
    public static void main(String[] args) {
        String namaMonster[] = new String[2];
        int darahMana[][] = new int[2][2];
        int x = 0;
        int daraha = darahMana[0][0] + 100;
        int darahb = darahMana[0][1] + 100;
        int manaa = darahMana[1][0] + 50;
        int manab = darahMana[1][1] + 50;
        for (int i = 0; i < 1; i++) {
            namaMonster[0] = JOptionPane.showInputDialog("Masukkan nama monster");
            namaMonster[1] = JOptionPane.showInputDialog("Masukkan nama monster");
        }
        System.out.println("Nama Monster ke -1  : " + namaMonster[0]);
        System.out.println("Darah Monster ke -1 : " + daraha);
        System.out.println("Darah Monster ke -1 : " + manaa);
        System.out.println("-=================================-");
        System.out.println("Nama Monster ke -2  : " + namaMonster[1]);
        System.out.println("Darah Monster ke -2 : " + darahb);
        System.out.println("Darah Monster ke -2 : " + manab);
        do {
            System.out.println();
            x = Integer.parseInt(JOptionPane.showInputDialog("Pilih Monster yang mau di serang :"
                    + "\n1. " + namaMonster[0]
                    + "\n2. " + namaMonster[1]));
            switch (x) {
                case 1:
                    if (daraha <= 10) {
                        JOptionPane.showMessageDialog(null, "Selamat, " + namaMonster[1] + " Adalah pemenangnya");
                        System.exit(0);
                    } else {
                        if (manab <= 0) {
                            JOptionPane.showMessageDialog(null, "Tidak bisa menyerang, Mana kurang! (12)");
                        } else {
                            manab -= 25;
                            daraha -= 25;
                        }
                        System.out.println("Darah " + namaMonster[1] + " Sekarang : " + daraha);
                        System.out.println("Mana " + namaMonster[0] + " Sekarang : " + manab);
                    }
                    break;
                case 2:
                    if (darahb <= 10) {
                        JOptionPane.showMessageDialog(null, "Selamat, " + namaMonster[0] + ", Adalah pemenangnya");
                        System.exit(0);
                    } else {
                        if (manaa <= 0) {
                            JOptionPane.showMessageDialog(null, "Tidak bisa menyerang, Mana kurang! (11)");
                        } else {
                            manaa -= 25;
                            darahb -= 25;
                        }
                        System.out.println("Darah " + namaMonster[1] + " Sekarang : " + darahb);
                        System.out.println("Mana " + namaMonster[0] + " Sekarang : " + manaa);
                    }
                    break;
                case 11:
                    if (manaa < 25) {
                        manaa += 25;
                        JOptionPane.showMessageDialog(null, "Mana '" + namaMonster[0] + "' bertambah!");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Perintah tidak di ketahui");
                        break;
                    }
                case 12:
                    if (manab < 25) {
                        manab += 25;
                        JOptionPane.showMessageDialog(null, "Mana '" + namaMonster[1] + "' bertambah!");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Perintah tidak di ketahui");
                        break;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Perintah tidak di ketahui");
                    break;
            }
        } while (true);
    }
}