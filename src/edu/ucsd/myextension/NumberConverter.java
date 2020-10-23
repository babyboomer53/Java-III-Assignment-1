package edu.ucsd.myextension;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.BLACK;
import static java.awt.Color.CYAN;
import static javax.swing.JOptionPane.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private JButton octalToBinary;
    private JButton octalToDecimal;

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
        octalToBinary = new JButton("Octal to Binary");
        octalToBinary.addActionListener(this::actionPerformed);
        octalToDecimal = new JButton("Octal to Decimal");
        octalToDecimal.addActionListener(this::actionPerformed);
        this.panel.add(binaryToHex);
        this.panel.add(binaryToDecimal);
        this.panel.add(hexToBinary);
        this.panel.add(hexToDecimal);
        this.panel.add(decimalToHex);
        this.panel.add(decimalToBinary);
        this.panel.add(octalToBinary);
        this.panel.add(octalToDecimal);
        this.frame.add(panel);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel.setBackground(CYAN);
        this.frame.pack();
        this.frame.setLocationRelativeTo(null);
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
        } else if (actionEvent.getSource() == octalToBinary) {
            showMessageDialog(null, Octal.convertToBinary(number), "The binary equivalent is…",
                    INFORMATION_MESSAGE);
        } else if (actionEvent.getSource() == octalToDecimal) {
            showMessageDialog(null, Octal.convertToDecimal(number), "The binary equivalent is…",
                    INFORMATION_MESSAGE);
        }

    }
}

public class NumberConverter {
    public static String number;

    public static void main(String[] arguments) {
//        Pattern pattern = Pattern.compile("^[0-9A-F]+$", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("ffae");
//        if (matcher.find()) {
//            System.out.println("The input is valid.");
//        } else {
//            System.err.println("The input is not valid.");
//        }

        number = showInputDialog("Enter a binary, decimal or hexadecimal number…");

        Menu menu = new Menu(number);

    }
}
