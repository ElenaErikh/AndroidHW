package Lesson_7.Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator(){
        setBounds(600, 200, 250, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Calculator");

        JPanel jp1 = new JPanel();
        jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
        JTextField textField1 = new JTextField();
        jp1.add(textField1);

        JTextField textField2 = new JTextField();
        jp1.add(textField2);
        JTextField textField3 = new JTextField();
        jp1.add(textField3);

        add(jp1, BorderLayout.NORTH);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(3, 2));
        JButton[] jButtons = new JButton[]{
                new JButton("+"),
                new JButton("-"),
                new JButton("*"),
                new JButton("/"),
        };

        for (JButton jbt : jButtons) {
            jbt.setPreferredSize(new Dimension(50, 50));
            jp2.add(jbt, BorderLayout.SOUTH);
        }
        add(jp2, BorderLayout.SOUTH);

        jButtons[0].addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            textField3.setText("" + (a + b));
        });

        jButtons[1].addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            textField3.setText("" + (a - b));
        });

        jButtons[2].addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            textField3.setText("" + (a * b));
        });

        jButtons[3].addActionListener(e -> {
            int a = Integer.parseInt(textField1.getText());
            int b = Integer.parseInt(textField2.getText());
            textField3.setText("" + (a / b));
        });



        setVisible(true);

    }

}
