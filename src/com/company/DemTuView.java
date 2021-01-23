package com.company;

import javax.swing.*;

public class DemTuView extends JFrame{
    private JLabel labelSoTu;
    private JLabel labelSoKyTu;
    private  JButton btnKetQua;
    private JTextArea textArea;

    public DemTuView(){
        setTitle("JavaSwing De So Tu");

        labelSoTu = new JLabel("SoTu");
        labelSoKyTu =  new JLabel("So Ky Tu");
        labelSoTu.setBounds(20, 20, 100, 25);
        labelSoKyTu.setBounds(100, 20, 100, 25);

        textArea =  new JTextArea();
        textArea.setBounds(20,50,380,220);
        btnKetQua = new JButton("Ket Qua");
        btnKetQua.setBounds(20,280,80,25);

        add(labelSoTu);
        add(labelSoKyTu);
        add(textArea);
        add(btnKetQua);


        setLayout(null);
        setSize(450,400);

        setVisible(true);

    }
    public  JLabel getLabelSoTu(){
        return labelSoTu;
    }
    public void setLabelSoTu(JLabel labelSoTu){
        this.labelSoTu =  labelSoTu;
    }
    public JLabel getLabelSoKyTu() {
        return labelSoKyTu;
    }

    public void setLabelSoKyTu(JLabel labelSoKyTu) {
        this.labelSoKyTu = labelSoKyTu;
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
