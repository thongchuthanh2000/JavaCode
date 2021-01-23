package com.company;

import javax.swing.*;

public class PTB2View extends JFrame{
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;

    private  JButton btnKetQua;
    private JTextArea textArea;

    public  PTB2View(){
        setTitle("GiaiPTBac2");
         JLabel labelHangSo = new JLabel("Hang So");
        JLabel labelHangSoA = new JLabel("a:");
        JLabel labelHangSoB = new JLabel("b:");
        JLabel labelHangSoC = new JLabel("c:");

        labelHangSo.setBounds(20,20,50,20);
        labelHangSoA.setBounds(20, 50, 30, 20);
        labelHangSoB.setBounds(100, 50, 30, 20);
        labelHangSoC.setBounds(180, 50, 30, 20);

        textFieldA =  new JTextField();
        textFieldB = new JTextField();
        textFieldC = new JTextField();
        textFieldA.setBounds(40, 50, 40, 20);
        textFieldB.setBounds(120, 50, 40, 20);
        textFieldC.setBounds(200, 50, 40, 20);

        btnKetQua =  new JButton("Ket Qua");
        btnKetQua.setBounds(20, 80, 80, 30);
        // tạo textarea để hiện thị kết quả
        textArea = new JTextArea();
        textArea.setBounds(20, 120, 350, 150);

        add(labelHangSo);
        add(labelHangSoA);
        add(textFieldA);
        add(labelHangSoB);
        add(textFieldB);
        add(labelHangSoC);
        add(textFieldC);
        add(btnKetQua);
        add(textArea);

        setLayout(null);
        // thiết lập kích thước jframe
        setSize(450, 400);
        // hiển thị jframe
        setVisible(true);

    }
    public JTextField getTextFieldA() {
        return textFieldA;
    }

    public void setTextFieldA(JTextField textFieldA) {
        this.textFieldA = textFieldA;
    }

    public JTextField getTextFieldB() {
        return textFieldB;
    }

    public void setTextFieldB(JTextField textFieldB) {
        this.textFieldB = textFieldB;
    }

    public JTextField getTextFieldC() {
        return textFieldC;
    }

    public void setTextFieldC(JTextField textFieldC) {
        this.textFieldC = textFieldC;
    }

    public JButton getBtnKetQua() {
        return btnKetQua;
    }

    public void setBtnKetQua(JButton btnKetQua) {
        this.btnKetQua = btnKetQua;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
}
