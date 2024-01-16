import javax.swing.*;
import java.util.Random;

public class RandomForm extends JFrame{
    private JTextField txtField;
    private JButton generujButton;
    private JTextArea txtArea;
    private JPanel panel;
    private JButton kopirujButton;

    public RandomForm() {
        generujButton.addActionListener(e -> {
            Random generator = new Random();
            int randomNum = generator.nextInt(100);
            txtField.setText(String.valueOf(randomNum));
            txtArea.setEditable(false);
        });
        kopirujButton.addActionListener(e-> {
                txtArea.append((txtField.getText() + "\n"));
        });
    }

    public static void main(String[] args) {
        RandomForm r = new RandomForm();
        r.setContentPane(r.panel);
        r.setTitle("Random Generátor");
        r.setSize(500,500);
        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
        r.setVisible(true);
    }
}
