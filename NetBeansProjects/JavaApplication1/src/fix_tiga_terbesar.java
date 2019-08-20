import javax.swing.JOptionPane;
public class fix_tiga_terbesar {
    public static void main(String[] args) {
        int u;
        int temp1=0;
        int temp2=0;
        int temp3=0;
        String nama1=null;
        String nama2=null;
        String nama3=null;
        u = Integer.parseInt(JOptionPane.showInputDialog("Mau berapa Mahasiswa"));
        String data[][] = new String[u][3];
            for (int j = 0; j < u; j++) {
                data[j][0] = JOptionPane.showInputDialog("Masukkan nama");
                data[j][1] = JOptionPane.showInputDialog("Masukkan NIM : ");
                data[j][2] = JOptionPane.showInputDialog("Masukkan nilai");
            }
        int nilai[] = new int[u];
        for (int i = 0; i < u; i++) {
            nilai[i] = Integer.parseInt(data[i][2]);
        }
        for (int i = 0; i < u; i++) {
            if (nilai[i]>temp1) {
                temp1 = nilai[i];
            }
        }
        for (int i = 0; i < u; i++) {
            if (nilai[i]>temp2 && nilai[i]<temp1) {
                temp2 = nilai[i];
            }
        }
        for (int i = 0; i < u; i++) {
            if (nilai[i]>temp3 && nilai[i]<temp2) {
                temp3 = nilai[i];
            }
        }
        for (int i = 0; i < u; i++) {
                if (Integer.parseInt(data[i][2]) == temp1) {
                nama1 = data[i][0];
            }
        }
        for (int i = 0; i < u; i++) {
            if (Integer.parseInt(data[i][2]) == temp2) {
                nama2 = data[i][0];
            }
        }
        for (int i = 0; i < u; i++) {
            if (Integer.parseInt(data[i][2]) == temp3) {
                nama3 = data[i][0];
            }
        }
        System.out.println("Nama 1 terbesar : "+nama1);
        System.out.println("Nilai 1 terbesar : "+temp1);
        System.out.println("-==================================================-");
        System.out.println("Nama 2 terbesar : "+nama2);
        System.out.println("Nilai 2 terbesar : "+temp2);
        System.out.println("-==================================================-");
        System.out.println("Nama 3 terbesar : "+nama3);
        System.out.println("Nilai 3 terbesar : "+temp3);
        System.out.println("-==================================================-");
    }
}