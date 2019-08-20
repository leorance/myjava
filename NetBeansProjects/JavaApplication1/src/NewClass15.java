
import javax.swing.*;

class Swing extends JFrame {

    Swing() {
        setSize(800,600);
        show();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Swing sw = new Swing();
    }
}
