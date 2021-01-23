package com.company;

public class DemTuMain {
    public static void main(String[] args) {
        DemTuView view = new DemTuView();
        new DemTuController(view);
    }
}
