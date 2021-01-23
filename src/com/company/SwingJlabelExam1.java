package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingJlabelExam1 {
    private JFrame  mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingJlabelExam1(){
        prepareGUI();
    }
    public  static void main(String [] args){
        SwingJlabelExam1 swingJlabelExam1 = new SwingJlabelExam1();
        swingJlabelExam1.showLabelDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(400,300);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        headerLabel = new JLabel("",JLabel.CENTER);
        statusLabel  = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

    }

    private  void showLabelDemo(){
        headerLabel.setText("Control in action: Jlabel");
        JLabel label = new JLabel("",JLabel.CENTER);
        label.setText("Chao mung toi voi bai huong dan Java Swing");
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);

        controlPanel.add(label);
        mainFrame.setVisible(true);

    }

}
