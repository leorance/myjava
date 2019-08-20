import javax.swing.JOptionPane;
public class Nilairata {

    public static void main(String[] args) {

        //Inisialisasi
        String nama[];
        int banyakMahasiswa,  banyakTes = 3, nilai[][], ntt[];
        float rata[], jumlah[], rtt;

        //Input jumlah mahasiswa
        banyakMahasiswa = Integer.parseInt(JOptionPane.showInputDialog("Berapa mahasiswa"));

        //Inisialisasi Array
        nilai = new int[banyakMahasiswa][banyakTes];
        jumlah = new float[banyakMahasiswa];
        rata = new float[banyakMahasiswa];
        ntt = new int[banyakTes];
        nama = new String[100];
        System.out.println();

        //Input Nilai
        for (int h = 0; h < banyakMahasiswa; h++) { //Mahasiswa
            nama[h] = JOptionPane.showInputDialog("Masukkan Nama mahasiswa");
            for (int i = 0; i < banyakTes; i++) { //Tes keberapa
                nilai[h][i] = Integer.parseInt(JOptionPane.showInputDialog("Nilai Tes ke " + (i + 1) + " : "));

                //Hitung Jumlah Tes
                jumlah[h] = jumlah[h] + nilai[h][i];
            }
            //Hitung rata-rata tes
            rata[h] = jumlah[h] / banyakTes;
            System.out.println();
        }

        //Nilai awal tertinggi & terendah
        for (int i = 0; i < banyakTes; i++) {
            ntt[i] = nilai[0][i];
        }
        //Nilai awal rata-rata tertinggi & terendah
        rtt = rata[0];
        //Cari nilai tertinggi & terendah
        for (int i = 0; i < banyakTes; i++) {
            for (int j = 0; j < banyakMahasiswa; j++) {
                if (ntt[i] < nilai[j][i]) {
                    ntt[i] = nilai[j][i];
                }
            }
        }
        //Cari nilai rata-rata tertinggi & terendah
        for (int i = 0; i < banyakMahasiswa; i++) {
            if (rtt < rata[i]) {
                rtt = rata[i];
            }
        }
        System.out.println("Daftar Nilai Mahasiswa : ");
        System.out.println();

        System.out.println("Nama\tTest 1\tTest 2\tTest 3\tRata-rata");

        //Output nilai
        for (int h = 0; h < banyakMahasiswa; h++) {
            System.out.print(nama[h]);
            for (int i = 0; i < banyakTes; i++) {
                System.out.print("\t" + nilai[h][i]);
            }
            System.out.print("\t" + rata[h]);
            System.out.println();
        }
        System.out.println();
        //Output nilai tertinggi
        System.out.print("Nilai Tertinggi\t");
        for (int j = 0; j < banyakTes; j++) {//Nilai tertinggi
            System.out.print(ntt[j] + "\t");
        }
        System.out.print(rtt);//Rata-rata tertinggi
        System.out.println();
    }
}