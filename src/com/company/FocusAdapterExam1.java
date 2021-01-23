package com.company;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class FocusAdapterExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public FocusAdapterExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        FocusAdapterExam1 demo = new FocusAdapterExam1();
        demo.showFocusAdapterDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(500, 300);
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
        mainFrame.setTitle("Ví dụ FocusAdapter trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showFocusAdapterDemo() {
        headerLabel.setText("Listener in action: FocusAdapter");
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        okButton.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                statusLabel.setText(
                        statusLabel.getText()
                                + e.getComponent().getClass().getSimpleName()
                                + " gained focus. ");
            }
        });

        cancelButton.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                statusLabel
                        .setText(statusLabel.getText()
                                + e.getComponent().getClass().getSimpleName()
                                + " lost focus. ");
            }
        });

        controlPanel.add(okButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
}