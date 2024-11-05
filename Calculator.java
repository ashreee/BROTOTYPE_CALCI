import javax.swing.JFrame;

public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
