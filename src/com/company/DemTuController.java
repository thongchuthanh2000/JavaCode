package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DemTuController implements ActionListener {

    private  DemTuView view;
    public  DemTuController(DemTuView view){
        this.view = view;
        view.getBtnKetQua().addActionListener(this);

        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        view.getLabelSoTu().setText("So Tu" +
                view.getTextArea().getText().split("\\s").length);
        view.getLabelSoKyTu().setText("So Ky tu"+
                view.getTextArea().getText().length());
    }
}
