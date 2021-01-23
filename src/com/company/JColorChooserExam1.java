package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserExam1 extends JFrame implements ActionListener {

    JButton b;
    Container c;

    JColorChooserExam1(){
        c = getContentPane();
        c.setLayout(new FlowLayout());

        b= new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color initalcolor = Color.RED;
        Color color = JColorChooser.showDialog(this,"Select a color",initalcolor);
        c.setBackground(color);
    }
    public  static  void main(String[] args){
        JColorChooserExam1 ch = new JColorChooserExam1();
        ch.setSize(400,200);
        ch.setVisible(true);
        ch.setTitle("Vi du JColorChooser trong Java Swing");
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
