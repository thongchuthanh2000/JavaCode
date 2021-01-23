package com.company;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class WindowAdapterExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public WindowAdapterExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        WindowAdapterExam1 demo = new WindowAdapterExam1();
        demo.showWindowAdapterDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
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
        mainFrame.setTitle("Ví dụ WindowAdapter trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showWindowAdapterDemo() {
        headerLabel.setText("Listener in action: WindowAdapter");
        JButton okButton = new JButton("OK");
        final JFrame aboutFrame = new JFrame();
        aboutFrame.setSize(300, 200);
        ;
        aboutFrame.setTitle("WindowAdapter Demo");
        aboutFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                aboutFrame.dispose();
            }
        });
        JLabel msgLabel = new JLabel("Huong dan Java Swing.", JLabel.CENTER);
        aboutFrame.add(msgLabel);
        aboutFrame.setVisible(true);
    }
}