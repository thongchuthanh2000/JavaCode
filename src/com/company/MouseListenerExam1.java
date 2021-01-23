package com.company;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public MouseListenerExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        MouseListenerExam1 demo = new MouseListenerExam1();
        demo.showMouseListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(400, 300);
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
    }

    private void showMouseListenerDemo() {
        headerLabel.setText("Listener in action: MouseListener");
        JPanel panel = new JPanel();
        panel.setBackground(Color.magenta);
        panel.setLayout(new FlowLayout());
        panel.addMouseListener(new CustomeMouseListener());

        JLabel msglabel = new JLabel("Click vao day de lay toa do.",
                JLabel.CENTER);
        panel.add(msglabel);
        mainFrame.addMouseListener(new CustomeMouseListener());
        msglabel.addMouseListener(new CustomeMouseListener());
        panel.add(msglabel);
        controlPanel.add(panel);
        mainFrame.setVisible(true);

    }
    class  CustomeMouseListener implements  MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked: "+ e.getX() +":" + e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}