package com.company;

import javax.swing.*;

public class JSliderExam1 extends JFrame {
    public  JSliderExam1(){
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel panel = new JPanel();
        panel.add(slider);

        add(panel);
        setTitle("JSlider trong JavaSwing");
        pack();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    }
    public  static  void main(String[] args){
        JSliderExam1 jSliderExam1 = new JSliderExam1();
        //jSliderExam1.pack();
        jSliderExam1.setVisible(true);
    }
}
