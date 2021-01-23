package com.company;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MouseMotionAdapterExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MouseMotionAdapterExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        MouseMotionAdapterExam1 demo = new MouseMotionAdapterExam1();
        demo.showMouseMotionAdapterDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(450, 250);
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
        mainFrame.setTitle("Ví dụ MouseMotionAdapter trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showMouseMotionAdapterDemo() {
        headerLabel.setText("Listener in action: MouseMotionAdapter");
        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                statusLabel.setText("Mouse Moved: "
                        + "(" + e.getX() + ", " + e.getY() + ")");
            }
        });
        JLabel msglabel = new JLabel("Huong dan Java Swing.", JLabel.CENTER);
        panel.add(msglabel);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
}