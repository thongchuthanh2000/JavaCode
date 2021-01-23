package com.company;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ItemListenerExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public ItemListenerExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        ItemListenerExam1 demo = new ItemListenerExam1();
        demo.showItemListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame();
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
        mainFrame.setTitle("Ví dụ ItemListener trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showItemListenerDemo() {
        headerLabel.setText("Listener in action: ItemListener");
        JCheckBox chkApple = new JCheckBox("Apple");
        JCheckBox chkMango = new JCheckBox("Mango");
        JCheckBox chBanana = new JCheckBox("Banana");

        chkApple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText(((JCheckBox) e.getItem()).getText()
                        + " Checkbox: "
                        + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        chkMango.addItemListener(new CustomItemListener());
        chBanana.addItemListener(new CustomItemListener());
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        controlPanel.add(chBanana);
        mainFrame.setVisible(true);
    }

    class CustomItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            statusLabel.setText(((JCheckBox) e.getItem()).getText()
                    + " Checkbox: "
                    + (e.getStateChange() == 1 ? "checked" : "unchecked"));
        }
    }
}
