package com.company;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JFrameExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JLabel msglabel;

    public JFrameExam1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JFrameExam1 demo = new JFrameExam1();
        demo.showJFrameDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JFrame trong Java Swing");
        mainFrame.setSize(400, 200);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        msglabel = new JLabel("Chao mung ban den voi VietTuts.Vn", JLabel.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showJFrameDemo() {
        headerLabel.setText("Container in action: JFrame");
        final JFrame jFrame =  new JFrame();
        jFrame.setSize(300,100);
        jFrame.setLayout(new FlowLayout());

        jFrame.add(msglabel);
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                jFrame.dispose();
            }
        });
        JButton okeButton = new JButton("Open a Frame");
        okeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Mot Frame duoc hien thi toi nguoi dung.");
                jFrame.setVisible(true);
            }
        });
        controlPanel.add(okeButton);
        mainFrame.setVisible(true);
    }
}