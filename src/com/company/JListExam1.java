package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JListExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JListExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        JListExam1 jListExam1 = new JListExam1();
        jListExam1.showListDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du JList trong Java Swing");
        mainFrame.setSize(500, 300);
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
    }

    private void showListDemo() {
        headerLabel.setText("Control in action: JList");
        final  DefaultListModel colorsName = new DefaultListModel();
        colorsName.addElement("Green");
        colorsName.addElement("Red");
        colorsName.addElement("Yello");
        colorsName.addElement("Black");

        final  JList fruitList =  new JList(colorsName);
        fruitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fruitList.setSelectedIndex(0);
        fruitList.setVisibleRowCount(3);

        JScrollPane fruitListScrollPane = new JScrollPane(fruitList);

        final DefaultListModel vegName = new DefaultListModel();
        vegName.addElement("Broccoli");
        vegName.addElement("Onion");
        vegName.addElement("Potato");
        vegName.addElement("Tomato");
        final JList vegList = new JList(vegName);
        vegList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        vegList.setSelectedIndex(0);
        vegList.setVisibleRowCount(3);
        JScrollPane vegListScrollPane = new JScrollPane(vegList);

        JButton showButton = new JButton("Show");
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="";
                if (fruitList.getSelectedIndex()!=-1){
                    data= "Colors Selected: "+  fruitList.getSelectedValue();
                    statusLabel.setText(data);
                }
                if (vegList.getSelectedIndex() != -1) {
                    data += ", Vegetables selected: ";
                    for (Object vegetable : vegList.getSelectedValues()) {
                        data += vegetable + ", ";
                    }
                }
                statusLabel.setText(data);
            }
        });
        controlPanel.add(fruitListScrollPane);
        controlPanel.add(vegListScrollPane);
        controlPanel.add(showButton);

        mainFrame.setVisible(true);
    }
}
