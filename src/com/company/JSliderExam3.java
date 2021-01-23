package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderExam3 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JSliderExam3() {
        prepareGUI();
    }

    public static void main(String[] args) {
        JSliderExam3 demo = new JSliderExam3();
        demo.showSliderDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JSlider trong Java Swing");
        mainFrame.setSize(400, 200);
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
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showSliderDemo() {
        headerLabel.setText("Control in action: JSlider");

        JSlider slider =  new JSlider(SwingConstants.HORIZONTAL,0,100,10);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(2);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                statusLabel.setText("Value"+((JSlider)(e.getSource())).getValue());
            }
        });
        controlPanel.add(slider);
        mainFrame.setVisible(true);
    }
}
