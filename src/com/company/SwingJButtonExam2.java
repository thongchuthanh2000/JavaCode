package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingJButtonExam2 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingJButtonExam2(){
        prepareGUI();
    }

    public  static void main(String[] args){
        SwingJButtonExam2 swingJButtonExam2 = new SwingJButtonExam2();
        swingJButtonExam2.showButtonDemo();
    }

    private  void prepareGUI(){
        mainFrame = new JFrame("Vi Du Swing - Button");
        mainFrame.setSize(400,300);
        mainFrame.setLayout(new GridLayout(3,2));

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        headerLabel = new JLabel("", SwingConstants.CENTER);
        statusLabel =  new JLabel("",JLabel.CENTER);

        statusLabel.setSize(350,100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

    }
    private  void showButtonDemo(){
        headerLabel.setText("Control is action: Button");
        JButton okButton =  new JButton("Oke");
        JButton javaButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Oke Button clicked");
            }

        });
        javaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Submit Button clicked");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Cancel Button clicked.");
            }
        });
        controlPanel.add(okButton);
        controlPanel.add(javaButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);

    }
}
