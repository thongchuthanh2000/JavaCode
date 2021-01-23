package com.company;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class WindowEventExam1 {
    private JFrame mainFrame;
    private JFrame aboutFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public WindowEventExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        WindowEventExam1 demo = new WindowEventExam1();
        demo.showWindowListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame();
        mainFrame.setSize(400, 300);
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
        mainFrame.setTitle("Ví dụ WindowListener trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showWindowListenerDemo() {
        headerLabel.setText("Listener in action: WindowListener");
        aboutFrame = new JFrame();
        aboutFrame.setSize(300, 200);
        aboutFrame.setTitle("WindowListener Demo");
        aboutFrame.addWindowListener(new CustomWindowListener());

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        JLabel msglabel = new JLabel("Huong dan Java Swing.",
                JLabel.CENTER);
        panel.add(msglabel);
        aboutFrame.add(panel);

    }

    class CustomWindowListener implements WindowListener {
        public void windowOpened(WindowEvent e) {
        }

        public void windowClosing(WindowEvent e) {
            aboutFrame.dispose();
            headerLabel.setText("aboutFrame was closed.");
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowActivated(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }
    }
}