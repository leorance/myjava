import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextFieldTest extends JFrame {

    private JTextField text1, text2, text3;
    private JPasswordField password;
    public TextFieldTest() {
        super("Penggunaan JTextField dann JPasswordField");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        text1 = new JTextField(10);
        c.add(text1);
        text2 = new JTextField("Ketik teks di sini");
        c.add(text2);
        text3 = new JTextField("Teks tak dapat di edit", 20);
        text3.setEditable(false);
        c.add(text3);
        password = new JPasswordField("Teks tersembunyi");
        c.add(password);
        TextFieldHandler handler = new TextFieldHandler();
        text1.addActionListener(handler);
        text2.addActionListener(handler);
        text3.addActionListener(handler);
        password.addActionListener(handler);
        setSize(325, 100);
        show();
    }

    public static void main(String[] args) {
        TextFieldTest app = new TextFieldTest();
        app.addWindowListener(
                new WindowAdapter() {
            public void windowsClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private class TextFieldHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = "";
            if (e.getSource() == text1) {
                s = "text1 : " + e.getActionCommand();
            } else if (e.getSource() == text2) {
                s = "text2 : " + e.getActionCommand();
            } else if (e.getSource() == text3) {
                s = "text3 : " + e.getActionCommand();
            } else if (e.getSource() == password) {
                JPasswordField pwd
                        = (JPasswordField) e.getSource();
                s = "password : "
                        + new String(pwd.getPassword());
            }
            JOptionPane.showMessageDialog(null, s);
        }
    }

}
