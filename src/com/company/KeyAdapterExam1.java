package com.company;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterExam1 {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public KeyAdapterExam1(){
        prepareGUI();
    }

    public static void main(String[] args) {
        KeyAdapterExam1 demo = new KeyAdapterExam1();
        demo.showKeyAdapterDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Vi du Java Swing");
        mainFrame.setSize(400, 300);
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
        mainFrame.setTitle("Ví dụ KeyAdapter trong Java Swing");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void showKeyAdapterDemo() {
        headerLabel.setText("Listener in action: KeyAdapter");
        final JTextField textField = new JTextField(10);
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    statusLabel.setText("   Entered text: " + textField.getText());
                }
            }
            public  void keyType(KeyEvent e){
                if (e.getKeyCode()==KeyEvent.VK_1){
                    statusLabel.setText("Entered text: " + textField.getText());
                }
            }
        });
        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Entered text: " + textField.getText());
            }
        });
        controlPanel.add(textField);
        controlPanel.add(okButton);
        mainFrame.setVisible(true);
    }
}