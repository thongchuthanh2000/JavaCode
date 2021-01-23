package com.company;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class ClockExample extends JFrame {
    private  JLabel labelClock;
    public ClockExample(){
        setTitle("Dong Ho");
        labelClock = new JLabel();
        labelClock.setBounds(20,20,80,20);
        add(labelClock);
        setSize(400,200);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        setVisible(true);

        try{
            while (true){
                Calendar calendar = Calendar.getInstance();
                String hour = (calendar.getTime().getHours() > 9) ?
                        "" + calendar.getTime().getHours() + ""
                        : "0" + calendar.getTime().getHours();
                String minute = (calendar.getTime().getMinutes() > 9) ?
                        "" + calendar.getTime().getMinutes() + ""
                        : "0" + calendar.getTime().getMinutes();
                String second = (calendar.getTime().getSeconds() > 9) ?
                        "" + calendar.getTime().getSeconds() + ""
                        : "0" + calendar.getTime().getSeconds();
                labelClock.setText(hour + ":" + minute + ":" + second);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public  static  void main(String[] args){
        new ClockExample();
    }
}
