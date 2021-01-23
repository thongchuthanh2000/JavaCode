package com.company;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MouseMotionListenerExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MouseMotionListenerExam1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        MouseMotionListenerExam1 demo = new MouseMotionListenerExam1();
        demo.showMouseMotionListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(450, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        mainFrame.setTitle("Ví dụ MouseMotionListener trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showMouseMotionListenerDemo() {
        headerLabel.setText("Listener in action: MouseMotionListener");
        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.addMouseMotionListener(new CustomMouseMotionListener());
        JLabel msglabel = new JLabel("Huong dan Java Swing.", JLabel.CENTER);
        panel.add(msglabel);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }
    class  CustomMouseMotionListener implements  MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {
            statusLabel.setText("Mouse Dragged: "
                    + "(" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusLabel.setText("Mouse Moved: "
                    + "(" + e.getX() + ", " + e.getY() + ")");
        }
    }
}