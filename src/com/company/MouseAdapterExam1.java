package com.company;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MouseAdapterExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MouseAdapterExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        MouseAdapterExam1 demo = new MouseAdapterExam1();
        demo.showMouseAdapterDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(450, 200);
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
        mainFrame.setTitle("Ví dụ MouseAdapter trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showMouseAdapterDemo() {
        headerLabel.setText("Listener in action: MouseAdapter");
        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked: "
                        + "(" + e.getX() + ", " + e.getY() + ")");
            }
        });
        JLabel msglabel = new JLabel("Huong dan Java Swing.", JLabel.CENTER);

        msglabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Mouse Clicked: "
                        + "(" + e.getX() + ", " + e.getY() + ")");
            }
        });
        panel.add(msglabel);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
}