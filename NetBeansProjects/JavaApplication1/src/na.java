import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout.*;
import javax.swing.*;
import java.awt.Container.*;
import javax.swing.JLabel.*;

public class na extends JFrame implements ActionListener {

    private JTextField jTFnim, jTFnama, jTFjurusan, jTFmatkul, jTFtugas, jTFuts, jTFuas, jTFakhir, jTFgrade, jTFket;
    private JButton btnproses, btnkeluar;

    public static void main(String[] args) {
        na frame = new na();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.class);
        frame.setTitle("Nilai Akhir");
        JLabel label = new JLabel("Perhitungan Nilai Akhir");
        frame.setVisible(true);
        frame.setSize(420, 400);
        //  Menentukan layout Frame
        //frame.setLayout(null);
        //  Memasukkan Label ke dalam Frame
        frame.add(label);

    }

    public na(String this_is_just_an_example) {
        super(this_is_just_an_example);
    }

    public method na() {
        JPanel pl = new JPanel();
        pl.setLayout((LayoutManager) new GridLayout(4, 2));
        pl.add(new JLabel("NIM "));
        pl.add(jTFnim = new JTextField(14));
        pl.add(new JLabel("Nama "));
        pl.add(jTFnama = new JTextField(14));
        pl.add(new JLabel("Jurusan"));
        pl.add(jTFjurusan = new JTextField(14));
        pl.add(new JLabel("Mata Kuliah"));
        pl.add(jTFmatkul = new JTextField(14));
        JPanel p2 = new JPanel();
        p2.setLayout((LayoutManager) new GridLayout(2, 2));
        p2.add(new JLabel(" Nilai Tugas"));
        p2.add(jTFtugas = new JTextField(6));
        JPanel p3 = new JPanel();
        p3.setLayout((LayoutManager) new GridLayout(2, 2));;
        p3.add(new JLabel("   Nilai UTS"));
        p3.add(jTFuts = new JTextField(6));
        JPanel p4 = new JPanel();
        p4.setLayout((LayoutManager) new GridLayout(2, 2));
        p4.add(new JLabel("   Nilai UAS"));
        p4.add(jTFuas = new JTextField(6));
        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        p5.add(btnproses = new JButton("PROSES"));
        btnproses.addActionListener(this);
        JPanel p6 = new JPanel();
        p6.setLayout(new FlowLayout());
        p6.add(btnkeluar = new JButton("KELUAR"));
        btnkeluar.addActionListener(this);
        JPanel p7 = new JPanel();
        p7.setLayout((LayoutManager) new GridLayout(3, 1));
        p7.add(new JLabel("IPS"));
        p7.add(jTFakhir = new JTextField(3));
        jTFakhir.setEditable(false);
        p7.add(new JLabel("Grade"));
        p7.add(jTFgrade = new JTextField(4));
        jTFgrade.setEditable(false);
        p7.add(new JLabel("Keterangan"));
        p7.add(jTFket = new JTextField(15));
        jTFket.setEditable(false);

        Container container2 = getContentPane();
        container2.setLayout(new BorderLayout(150, 30));
        container2.add(pl);
        Container container1 = getContentPane();
        container1.setLayout(new BorderLayout(150, 100));
        container1.add(p2);
        container1.add(p3);
        container1.add(p4);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        container.add(p5);
        Container container4 = getContentPane();
        container4.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        container4.add(p7);
        Container container5 = getContentPane();
        container5.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        container5.add(p6);
        return null;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnproses) {
            double tugas = (Double.parseDouble(jTFtugas.getText().trim()));
            double uts = (Double.parseDouble(jTFuts.getText().trim()));
            double uas = (Double.parseDouble(jTFuas.getText().trim()));
            double hasil = (tugas + uts + uas) / 3;
            jTFakhir.setText(String.valueOf(hasil));
            double akhir = 0;
            if (akhir >= 80) {
                String grade = "A";
                String ket = "Great,Pertahankan!!";
                jTFgrade.setText(String.valueOf(grade));
                jTFket.setText(String.valueOf(ket));
            } else if (akhir < 80 && akhir >= 76) {
                String grade = "B";
                String ket = "Good,Terus Tingkatkan!";
                jTFgrade.setText(String.valueOf(grade));
                jTFket.setText(String.valueOf(ket));
            } else if (akhir < 76 && akhir >= 56) {
                String grade = "C";
                String ket = "Semangat,Lebih Rajin Lagi!";
                jTFgrade.setText(String.valueOf(grade));
                jTFket.setText(String.valueOf(ket));
            } else if (akhir < 56 && akhir > 39) {
                String grade = "D";
                String ket = "BELAJAR GIAT!!!";
                jTFgrade.setText(String.valueOf(grade));
                jTFket.setText(String.valueOf(ket));
            } else if (akhir <= 39) {
                String grade = "E";
                String ket = "Selamat Bertemu Lagi Tahun Depan!!";
                jTFgrade.setText(String.valueOf(grade));
                jTFket.setText(String.valueOf(ket));
            }
        }
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String nilai_Akhir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(Class<JFrame> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class method {

        public method() {
        }
    }
}