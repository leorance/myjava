
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tubesdaspro extends JFrame implements ActionListener {

    private JTextField Text1, Text2, Text3, Text4, Text5, Text6, Text7, Text8;
    private JButton IPA, IPS, pil1, pil2, pil3, Submit;

    public Tubesdaspro() {

        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        JLabel Label1 = new JLabel("Isi seluruh data dengan lengkap");
        JLabel Label11 = new JLabel("pilih IPA atau IPS");

        p.add(Label1);
        p.add(Label11);

        JPanel p1 = new JPanel();
        p1.setLayout((LayoutManager) new GridLayout(9, 2, 10, 10));

        JLabel Label2 = new JLabel("Nama");
        JLabel Label3 = new JLabel("Nim");
        JLabel Label4 = new JLabel("Nilai Matematika");
        JLabel Label5 = new JLabel("Nilai Bahasa Indonesia");
        JLabel Label6 = new JLabel("Nilai Bahasa Inggris");
        JLabel Label7 = new JLabel("IPA atau IPS");
        JLabel Lab = new JLabel("Pilih satu");
        JLabel Label8 = new JLabel(" --- ");
        JLabel Labspace0 = new JLabel(" : ");
        JLabel Labspace1 = new JLabel(" : ");
        JLabel Labspace2 = new JLabel(" : ");
        JLabel Labspace3 = new JLabel(" : ");
        JLabel Labspace4 = new JLabel(" : ");
        JLabel Labspace6 = new JLabel(" : ");
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(Labspace0);
        p2.add(Text1 = new JTextField(15));

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(Labspace1);
        p3.add(Text2 = new JTextField(15));

        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(Labspace2);
        p4.add(Text3 = new JTextField(15));

        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        p5.add(Labspace3);
        p5.add(Text4 = new JTextField(15));

        JPanel p6 = new JPanel();
        p6.setLayout(new FlowLayout());
        p6.add(Labspace4);
        p6.add(Text5 = new JTextField(15));

        JPanel p7 = new JPanel();
        p7.setLayout(new FlowLayout());

        p7.add(IPA = new JButton("IPA"));
        p7.add(IPS = new JButton("IPS"));

        JPanel p8 = new JPanel();
        p8.setLayout(new FlowLayout());
        p8.add(Labspace6);
        p8.add(Text6 = new JTextField(15));

        JPanel p9 = new JPanel();
        p9.setLayout(new FlowLayout());
        p9.add(pil1 = new JButton(""));
        p9.add(pil2 = new JButton(""));
        p9.add(pil3 = new JButton(""));

        p1.add(Label2);
        p1.add(p2);
        p1.add(Label3);
        p1.add(p3);
        p1.add(Label4);
        p1.add(p4);
        p1.add(Label5);
        p1.add(p5);
        p1.add(Label6);
        p1.add(p6);
        p1.add(Label7);
        p1.add(p7);

        p1.add(Lab);
        p1.add(p9);

        p1.add(Label8);
        p1.add(p8);

        JPanel p11 = new JPanel();
        p11.setLayout(new FlowLayout());
        p11.add(Submit = new JButton("Submit"));

        IPA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                pil1.setText("Fisika");
                pil2.setText("Kimia");
                pil3.setText("Biologi");

            }
        }
        );

        IPS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                pil1.setText("Ekonomi");
                pil2.setText("Geografi");
                pil3.setText("Sosiologi");

            }
        }
        );

        pil1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Label8.setText(pil1.getText().toString());

            }
        }
        );

        pil2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Label8.setText(pil2.getText().toString());

            }
        }
        );
        pil3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Label8.setText(pil3.getText().toString());
            }
        }
        );

        Container container = getContentPane();

        container.setLayout(
                new BoxLayout(container, BoxLayout.Y_AXIS));

        add(p);

        p.setAlignmentX(Component.LEFT_ALIGNMENT);

        add(p1);

        p1.setAlignmentX(Component.LEFT_ALIGNMENT);

        add(p11);

        Submit.addActionListener(this);

    }

    public static void main(String[] args) {
        Tubesdaspro frame = new Tubesdaspro();
        frame.pack();
        frame.setTitle("Program beasiswa online");
        frame.setVisible(true);
        frame.setSize(650, 600);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Submit) {

            if (Text1.getText() == ""|| Text2.getText() == ""|| Text3.getText() == ""|| Text4.getText() == ""|| Text5.getText() == ""|| Text6.getText() == ""){
                JOptionPane.showMessageDialog(null, "Harap isi semua data terlebih dahulu");
            } else {
                double n1 = 0, n2 = 0, n3 = 0, n4 = 0, nr;
                String nama = Text1.getText().trim();
                String nim = Text2.getText().trim();

                n1 = (Double.parseDouble(Text3.getText().trim()));
                n2 = (Double.parseDouble(Text4.getText().trim()));
                n3 = (Double.parseDouble(Text5.getText().trim()));
                n4 = (Double.parseDouble(Text6.getText().trim()));

                nr = (n1 + n2 + n3 + n4) / 4;

                String total = "";

                if (nr >= 0 && nr < 50) {
                    total = total + ("\nMaaf " + nama + " anda tidak lulus jalur beasiswa");
                } else if (nr >= 50 && nr <= 69) {
                    total = total + ("\nSelamat " + nama + " anda mendapat beasiswa sebesar 25%");
                } else if (nr >= 70 && nr <= 74) {
                    total = total + ("\nSelamat " + nama + " anda mendapat beasiswa sebesar 50%");
                } else if (nr >= 75 && nr <= 79) {
                    total = total + ("\nSelamat " + nama + " anda mendapat beasiswa sebesar 75%");
                } else if (nr >= 80 && nr <= 100) {
                    total = total + ("\nSelamat " + nama + " anda mendapat beasiswa sebesar 100%");
                }

                double[] nilai = {n1, n2, n3, n4};
                double max = 0;
                double min = 1000;
                for (int a = 0; a < nilai.length; a++) {
                    if (nilai[a] > max) {
                        max = nilai[a];
                    } else if (nilai[a] < min) {
                        min = nilai[a];
                    }
                }

                total = total + ("\nNama  Peserta   :" + nama);
                total = total + ("\nNIM  Peserta   :" + nim);
                total = total + ("\nMata pelajaran Matematika Nilai = " + n1);
                total = total + ("\nMata pelajaran Bahasa Indonesia Nilai = " + n2);
                total = total + ("\nMata pelajaran Bahasa Inggris Nilai = " + n3);

                total = total + ("\nMata pelajaran pilihan Nilai = " + n4);

                total = total + ("\nNilai Terbesar  : " + max);
                total = total + ("\nNilai Rata-Rata : " + nr);
                total = total + ("\nNilai Terkecil  : " + min);
                if (nr == 0) {
                    total = total + ("\nrata rata nilai akhir : E\n-=====================================================-");
                } else if (nr >= 0 && nr <= 50) {
                    total = total + ("\nrata rata nilai akhir : D\n-=====================================================-");
                } else if (nr >= 50 && nr <= 64) {
                    total = total + ("\nrata rata nilai akhir : C\n-=====================================================-");
                } else if (nr >= 65 && nr <= 70) {
                    total = total + ("\nrata rata nilai akhir : B\n-=====================================================-");
                } else if (nr >= 70 && nr <= 75) {
                    total = total + ("\nrata rata nilai akhir : B+\n-=====================================================-");
                } else if (nr >= 75 && nr <= 80) {
                    total = total + ("\nrata rata nilai akhir : A\n-=====================================================-");
                } else if (nr >= 80 && nr <= 100) {
                    total = total + ("\nrata rata nilai akhir : A+\n-=====================================================-");
                }

                JOptionPane.showMessageDialog(null, total);
            }
        }

    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void add(JPanel p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String program_beasiswa_online) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}