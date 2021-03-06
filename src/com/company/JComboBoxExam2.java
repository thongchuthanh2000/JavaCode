package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class JComboBoxExam2 {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public JComboBoxExam2(){
        prepareGUI();
    }

    public static void main(String[] args) {
        JComboBoxExam2 swingDemo = new JComboBoxExam2();
        swingDemo.showComboboxDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du combobox - java swing");
        mainFrame.setSize(400, 400);
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

    private void showComboboxDemo() {
        headerLabel.setText("Control in action: JComboBox");
        final DefaultComboBoxModel cityName = new DefaultComboBoxModel();
        cityName.addElement("Ha Noi");
        cityName.addElement("TP. HCM");
        cityName.addElement("Da Nang");
        cityName.addElement("Hai Phong");
        final JComboBox fruitCombo = new JComboBox(cityName);
        fruitCombo.setSelectedIndex(0);
        JScrollPane sp = new JScrollPane(fruitCombo);
        JButton bt =  new JButton("Show");
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="";
                if (fruitCombo.getSelectedIndex()!=-1){
                    data= "City selected: "+ fruitCombo.getItemAt(fruitCombo.getSelectedIndex());
                }
                statusLabel.setText(data);
            }
        });
        controlPanel.add(sp);
        controlPanel.add(bt);
        mainFrame.setVisible(true);
    }

}
