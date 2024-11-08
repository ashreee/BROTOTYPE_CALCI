import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
    private JFrame jf;
    private JLabel displayLabel;

    public Calculator() {
        jf = new JFrame("Calculator");

        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displayLabel = new JLabel("HELLO");
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.setFocusPainted(false); // Remove the focus indicatori.e,square like thing inside button
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        JButton eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        eightButton.setFocusPainted(false);
        jf.add(eightButton);

        JButton nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        nineButton.setFocusPainted(false);
        jf.add(nineButton);

        JButton fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        fourButton.setFocusPainted(false);
        jf.add(fourButton);

        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        fiveButton.setFocusPainted(false);
        jf.add(fiveButton);

        JButton sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        sixButton.setFocusPainted(false);
        jf.add(sixButton);

        JButton oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        oneButton.setFocusPainted(false);
        jf.add(oneButton);

        JButton twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        twoButton.setFocusPainted(false);
        jf.add(twoButton);

        JButton threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80); // Change height to 80 for consistency
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        threeButton.setFocusPainted(false);
        jf.add(threeButton);

        JButton dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80); // Change height to 80 for consistency
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        dotButton.setFocusPainted(false);
        jf.add(dotButton);

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80); // Change height to 80 for consistency
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        zeroButton.setFocusPainted(false);
        jf.add(zeroButton);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80); // Change height to 80 for consistency
        equalButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalButton.addActionListener(this);
        equalButton.setFocusPainted(false);
        jf.add(equalButton);

        JButton divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80); // Change height to 80 for consistency
        divButton.setFont(new Font("Arial", Font.PLAIN, 20));
        divButton.addActionListener(this);
        divButton.setFocusPainted(false);
        jf.add(divButton);

        JButton mulButton = new JButton("*");
        mulButton.setBounds(330, 230, 80, 80); // Change height to 80 for consistency
        mulButton.setFont(new Font("Arial", Font.PLAIN, 20));
        mulButton.addActionListener(this);
        mulButton.setFocusPainted(false);
        jf.add(mulButton);

        JButton minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80); // Change height to 80 for consistency
        minusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        minusButton.addActionListener(this);
        minusButton.setFocusPainted(false);
        jf.add(minusButton);

        JButton addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80); // Change height to 80 for consistency
        addButton.setFont(new Font("Arial", Font.PLAIN, 20));
        addButton.addActionListener(this);
        addButton.setFocusPainted(false);
        jf.add(addButton);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        displayLabel.setText("7");
    }
}
