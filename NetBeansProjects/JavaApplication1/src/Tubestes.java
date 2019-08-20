import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Tubestes extends JFrame implements ActionListener {
    public Tubestes() {
        super("Belajar");
        Container c = getContentPane();
        setSize(400, 150);

        JPanel panel = new JPanel();
        JLabel x = new JLabel("Saya");
        add(x);
        setVisible(true);
        c.setLayout(new FlowLayout());
    }
    public static void main(String[] args) {
        Tubestes apps = new Tubestes() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
