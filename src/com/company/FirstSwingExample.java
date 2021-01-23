package com.company;

import javax.swing.*;

public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f  = new JFrame();

        JButton b = new JButton("click");
        b.setBounds(130,50,100,40);

        f.setTitle("Bai Dau Tien");
        f.add(b);

        f.setSize(400,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
