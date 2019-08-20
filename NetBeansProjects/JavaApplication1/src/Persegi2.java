
import javax.swing.*;
import java.awt.event.*;

public class Persegi2 extends JFrame {

    JTextField bilangan1, bilangan2;

    public Persegi2() {
        super("Hitung persegi");
        JFrame x =  new JFrame();
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.);

        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Sisi : ");

        bilangan1 = new JTextField(20);

        JButton tombol = new JButton("Count");
        JButton exit = new JButton("Exit");
        label1.setBounds(110, 20, 150, 20);
        bilangan1.setBounds(150, 20, 150, 20);
        tombol.setBounds(40, 80, 150, 30);
        exit.setBounds(200, 80, 150, 30);

        panel.setLayout(null);
        panel.add(label1);
        panel.add(bilangan1);
        panel.add(tombol);
        panel.add(exit);
        add(panel);

        tombol.addActionListener(new ActionListener() {
            int sisi;

            @Override
            public void actionPerformed(ActionEvent e) {
                sisi = Integer.parseInt(bilangan1.getText());
                int hasil1 = sisi * sisi;
                int hasil2 = sisi * 4;
                JOptionPane.showMessageDialog(null, "<html>Luas Persegi : " + hasil1 + "<br>Kelilising persegi : " + hasil2 + "</html>");
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Persegi2 apps = new Persegi2();
    }
}
