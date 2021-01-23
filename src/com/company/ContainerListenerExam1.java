package com.company;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.*;

public class ContainerListenerExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public ContainerListenerExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        ContainerListenerExam1 demo = new ContainerListenerExam1();
        demo.showContainerListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame();
        mainFrame.setSize(450, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        mainFrame.setTitle("Ví dụ AdjustmentListener trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showContainerListenerDemo() {
        headerLabel.setText("Listener in action: ContainerListener");
        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.addContainerListener(new CustomContainerListener());

        JButton okeButton =  new JButton("Oke");
        okeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel msglabel = new JLabel("Huong dan Java Swing.",
                        JLabel.CENTER);
                panel.add(msglabel);
            }
        });
        controlPanel.add(okeButton);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
    class  CustomContainerListener implements  ContainerListener{

        @Override
        public void componentAdded(ContainerEvent e) {
            statusLabel.setText(statusLabel.getText() +
                    e.getComponent().getClass().getSimpleName() + " added. ");
        }

        @Override
        public void componentRemoved(ContainerEvent e) {
            statusLabel.setText(statusLabel.getText() +
                    e.getComponent().getClass().getSimpleName() + " removed. ");
        }
    }
}