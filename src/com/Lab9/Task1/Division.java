package com.Lab9.Task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Division implements ActionListener {



    private JFrame frame;
    private JButton division;
    private JLabel label1;
    private JLabel label2;
    private JLabel error;
    private JLabel result;
    private JTextField inputBox1;
    private JTextField inputBox2;

    public Division() {

        setFrame();
        addInterface();
        division.addActionListener(this);
        frame.setVisible(true);
    }

    public void setFrame() {
        frame = new JFrame();//window, layout

        //settings of the frame
        frame.setSize(400,500);
        frame.setTitle("Division");
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addInterface() {
        label1 = new JLabel("Enter first number: ");
        label1.setBounds(10, 30, 150, 30);
        label2 = new JLabel("Enter second number: ");
        label2.setBounds(10, 80, 150, 30);

        inputBox1 = new JTextField();
        inputBox1.setBounds(160, 30, 200, 30);

        inputBox2 = new JTextField();
        inputBox2.setBounds(160, 80, 200, 30);

        division = new JButton("\\");
        division.setBounds(160, 150, 60, 60);

        result = new JLabel("Result: ");
        result.setBounds(10, 250, 150, 30);

        error = new JLabel();
        error.setBounds(10, 120, 200, 30);
        error.setForeground(Color.RED);

        frame.add(label1);
        frame.add(label2);
        frame.add(inputBox1);
        frame.add(inputBox2);
        frame.add(division);
        frame.add(result);
        frame.add(error);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object event = e.getSource();
        try
        {
            if (event == division) {
                double a = Double.parseDouble(inputBox1.getText());
                double b = Double.parseDouble(inputBox2.getText());
                double c = a / b;
                if(b == 13.0)
                {
                    throw new UnluckyException();
                }
                else if(b == 0.0)
                {
                    throw new ArithmeticException("You cannot divide by zero!");
                }
                result.setText("Result: " + c);
                error.setText("");
            }
        }
        catch (NumberFormatException ex)
        {
            error.setText("Insert only numbers!");
        }
        catch (UnluckyException unluckyException)
        {
            error.setText("You got the unlucky number!");
        }
    }
}
