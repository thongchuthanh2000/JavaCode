package com.company;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerExam1 {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JSpinnerExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        JSpinnerExam1 demo = new JSpinnerExam1();
        demo.showSpinnerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JSpinner trong Java Swing");
        mainFrame.setSize(450, 250);
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
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showSpinnerDemo() {

        headerLabel.setText("Control in action: JSpinner");
        SpinnerModel spinnerModel =  new SpinnerNumberModel(10,0,100,1);
        JSpinner spinner = new JSpinner(spinnerModel);
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                statusLabel.setText("Value"+((JSpinner) e.getSource()).getValue());
            }
        });
        controlPanel.add(spinner);
        mainFrame.setVisible(true);
    }
}