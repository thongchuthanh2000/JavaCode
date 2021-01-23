package com.company;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.WindowConstants;

public class AdjustmentListenerExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public AdjustmentListenerExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        AdjustmentListenerExam1 demo = new AdjustmentListenerExam1();
        demo.showAdjustmentListenerDemo();
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

    private void showAdjustmentListenerDemo() {
        headerLabel.setText("Listener in action: AdjustmentListener");
        JPanel panel = new JPanel();
        JScrollBar scrollbar = new JScrollBar();
        scrollbar.addAdjustmentListener(new CustomAdjustmentListener());
        panel.add(scrollbar);
        controlPanel.add(panel);
        mainFrame.setVisible(true);
    }

    class CustomAdjustmentListener implements  AdjustmentListener{

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            statusLabel.setText("Adjustment value: " +
                    Integer.toString(((JScrollBar)e.getSource()).getValue()));
        }
    }
}