
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class arraylistbelajar {

    public static void main(String[] args) {
        ArrayList hasil = new ArrayList();
        ArrayList gagal = new ArrayList();
        int hasilGagal = 0;
        int ulang =  Integer.parseInt(JOptionPane.showInputDialog(null, "Mau berapa angka : "));
        for (int i = 0; i < ulang; i++) {
            int nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nilai ke ["+(i+1)+"] : "));
            if (nilai <= 50) {
                hasil.add(nilai);
            }
            else{
                gagal.add(nilai);
            }
        }
        System.out.println("Yang bisa di proses : "+hasil);
        System.out.println("Yang tidak bisa di proses : "+gagal);
    }
}