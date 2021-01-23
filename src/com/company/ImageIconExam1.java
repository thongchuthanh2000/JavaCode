package com.company;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

class DrawingPanel extends JPanel {
    private ImageIcon icon;

    public DrawingPanel() {

        loadImage();
        initPanel();
    }

    private void loadImage() {

        icon = new ImageIcon("D:\\Picture\\GirlAnime\\3d9e1a3a49a2dfbe137c7127c6b42228.jpg");
    }

    private void initPanel() {

        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        setPreferredSize(new Dimension(w, h));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g, 0, 0);
    }
}

public class ImageIconExam1 extends JFrame {

    public ImageIconExam1() {
        initUI();
    }

    private void initUI() {
        DrawingPanel dpnl = new DrawingPanel();

        createLayout(dpnl);

        setTitle("Image");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));

        gl.setVerticalGroup(gl.createParallelGroup().addComponent(arg[0]));

        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame f = new ImageIconExam1();
            f.setSize(400, 200);
            f.setVisible(true);
        });
    }
}