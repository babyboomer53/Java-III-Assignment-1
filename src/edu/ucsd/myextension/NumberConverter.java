package edu.ucsd.myextension;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.BLACK;
import static java.awt.Color.CYAN;
import static javax.swing.JOptionPane.*;

class Menu implements ActionListener {
    private String number;
    private JFrame frame;
    private JPanel panel;
    private JButton binaryToHex;
    private JButton binaryToDecimal;
    private JButton hexToBinary;
    private JButton hexToDecimal;
    private JButton decimalToHex;
    private JButton decimalToBinary;


    Menu(String number) {
        this.number = number.toUpperCase();
        frame = new JFrame("Select the conversion method for " + number);
        panel = new JPanel();
        binaryToHex = new JButton("Binary to Hex");
        binaryToHex.addActionListener(this::actionPerformed);
        binaryToDecimal = new JButton("Binary to Decimal");
        binaryToDecimal.addActionListener(this::actionPerformed);
        hexToBinary = new JButton("Hex to Binary");
        hexToBinary.addActionListener(this::actionPerformed);
        hexToDecimal = new JButton("Hex to Decimal");
        hexToDecimal.addActionListener(this::actionPerformed);
        decimalToHex = new JButton("Decimal to Hex");
        decimalToHex.addActionListener(this::actionPerformed);
        decimalToBinary = new JButton("Decimal to Binary");
        decimalToBinary.addActionListener(this::actionPerformed);
        this.panel.add(binaryToHex);
        this.panel.add(binaryToDecimal);
        this.panel.add(hexToBinary);
        this.panel.add(hexToDecimal);
        this.panel.add(decimalToHex);
        this.panel.add(decimalToBinary);
        this.frame.add(panel);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel.setBackground(CYAN);
        this.frame.pack();
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == binaryToHex) {
            showMessageDialog(null, Binary.convertToHexadecimal(number), "The hexadecimal equivalent is…",
                    INFORMATION_MESSAGE);
        } else if (actionEvent.getSource() == binaryToDecimal) {
            showMessageDialog(null, Binary.convertToDecimal(number), "The decimal equivalent is…",
                    INFORMATION_MESSAGE);
        } else if (actionEvent.getSource() == hexToBinary) {
            showMessageDialog(null, Hexadecimal.convertToBinary(number), "The binary equivalent is…",
                    INFORMATION_MESSAGE);
        } else if (actionEvent.getSource() == hexToDecimal) {
            showMessageDialog(null, Hexadecimal.convertToDecimal(number), "The decimal equivalent is…",
                    INFORMATION_MESSAGE);
        } else if (actionEvent.getSource() == decimalToHex) {
            showMessageDialog(null, Decimal.convertToHexadecimal(number), "The hexadecimal equivalent is…",
                    INFORMATION_MESSAGE);
        } else if (actionEvent.getSource() == decimalToBinary) {
            showMessageDialog(null, Decimal.convertToBinary(number), "The binary equivalent is…",
                    INFORMATION_MESSAGE);
        }

    }
}

public class NumberConverter {
    public static String number;

    public static void main(String[] arguments) {

        number = showInputDialog("Enter a binary, decimal or hexadecimal number…");

        Menu menu = new Menu(number);

    }
}
