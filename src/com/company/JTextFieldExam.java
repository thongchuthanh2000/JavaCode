package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JTextFieldExam {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JTextFieldExam(){
        prepareGUI();
    }

    public static void main(String[] args) {
        JTextFieldExam swingDemo = new JTextFieldExam();
        swingDemo.showTextFieldDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JTextField - Java Swing");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showTextFieldDemo() {
        headerLabel.setText("Control in action: JTextField");
        JLabel nameLabel = new JLabel("User Id: ", JLabel.RIGHT);
        JLabel passwordLabel = new JLabel("Pass word",SwingConstants.CENTER);
        final  JTextField userTextField = new JTextField(6);
        final  JPasswordField passwordText = new JPasswordField(6);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="User name"+ userTextField.getText();
                data+=", Password: "+  new String(passwordText.getPassword());
                statusLabel.setText(data);
            }
        });
        controlPanel.add(nameLabel);
        controlPanel.add(userTextField);
        controlPanel.add(passwordLabel);
        controlPanel.add(passwordText);
        controlPanel.add(loginButton);
        mainFrame.setVisible(true);
    }
}
