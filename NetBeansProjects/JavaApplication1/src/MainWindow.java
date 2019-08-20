
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {

    JTextField username, pass;

    public MainWindow() {
        JFrame z = new JFrame();
        JTextField username = new JTextField();
        JPasswordField pass =  new JPasswordField();
        JLabel xx = new JLabel("Masukkan Nama : ");
        JLabel xx2 = new JLabel("Masukkan Password : ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        this.add(xx);
        this.add(xx2);
        this.add(username);
        this.add(pass);
        xx.setBounds(20, 19, 200, 30);
        username.setBounds(220, 20, 200, 30);
        pass.setBounds(220, 70, 200, 30);
        xx2.setBounds(20, 69, 200, 34);
        this.setTitle("Jendela Utama");
        this.setSize(600, 320);
    }

    public static void main(String[] args) {
        MainWindow mWindow = new MainWindow();
        mWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
