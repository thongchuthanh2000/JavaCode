package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;

public class JCheckBoxExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JCheckBoxExam1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JCheckBoxExam1 swingControlDemo = new JCheckBoxExam1();
        swingControlDemo.showCheckBoxDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JCheckBox trong Java Swing");
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

    private void showCheckBoxDemo() {
        headerLabel.setText("Control in action: CheckBox");
        final  JCheckBox chkApple= new JCheckBox("Green");
        final JCheckBox chkMango = new JCheckBox("Red");
        final  JCheckBox chkPeer = new JCheckBox("Yellow");

        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        chkPeer.setMnemonic(KeyEvent.VK_P);

        chkApple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Green Checkbox: "+(e.getStateChange()==1?"Checked":"Unchecked"));
            }
        });
        chkMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Red Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        chkPeer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("Yellow Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        controlPanel.add(chkPeer);
        mainFrame.setVisible(true);
    }
}
