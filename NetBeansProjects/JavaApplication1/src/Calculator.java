
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField input, input2, hasil;
    private JButton kali, bagi, tambah, kurang;

    public static void main(String[] args) {
        Calculator frame = new Calculator();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);
        frame.setSize(600, 175);
    }

    public Calculator() {
        JPanel p1 = new JPanel();
        p1.setLayout( new FlowLayout());
        p1.add(new JLabel("Bilangan 1"));
        p1.add(input = new JTextField(3));
        p1.add(new JLabel("Bilangan 2"));
        p1.add(input2 = new JTextField(3));
        p1.add(new JLabel("Hasil"));
        p1.add(hasil = new JTextField(4));
        hasil.setEditable(false);
        
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(kali = new JButton("*"));
        kali.addActionListener(this);
        
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(tambah = new JButton("+"));
        tambah.addActionListener(this);
        
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(kurang = new JButton("-"));
        kurang.addActionListener(this);
        
        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout());
        p5.add(bagi = new JButton("/"));
        bagi.addActionListener(this);
        
        Container container1 = getContentPane();
        container1.setLayout(new BorderLayout(150, 10));
        container1.add(p1);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT, 40, 10));
        container1.add(p2);
        container1.add(p3);
        container1.add(p4);
        container1.add(p5);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == kali) {
            double bilangan1 = Double.parseDouble(input.getText().trim());
            double bilangan2 = Double.parseDouble(input2.getText().trim());
            double hasil1 = bilangan1 * bilangan2;
            hasil.setText(String.valueOf(hasil1));
        } else if (e.getSource() == bagi) {
            double bilangan1 = Double.parseDouble(input.getText().trim());
            double bilangan2 = Double.parseDouble(input2.getText().trim());
            double hasil1 = bilangan1 / bilangan2;
            hasil.setText(String.valueOf(hasil1));
        } else if (e.getSource() == tambah) {
            double bilangan1 = Double.parseDouble(input.getText().trim());
            double bilangan2 = Double.parseDouble(input2.getText().trim());
            double hasil1 = bilangan1 + bilangan2;
            hasil.setText(String.valueOf(hasil1));
        } else if (e.getSource() == kurang) {
            double bilangan1 = Double.parseDouble(input.getText().trim());
            double bilangan2 = Double.parseDouble(input2.getText().trim());
            double hasil1 = bilangan1 - bilangan2;
            hasil.setText(String.valueOf(hasil1));
        }
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
