
import java.awt.Label;
import javax.swing.*;

public class NewClass17 {
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("Contoh SWING");
        Label myLabel = new Label("ITHB");
        frame.add(myLabel);
        frame.setSize(300,100);
        frame.setLocation(800, 500);
        frame.setVisible(true);
    }
}
