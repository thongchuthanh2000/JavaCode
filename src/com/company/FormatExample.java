package com.company;

import java.util.Locale;

public class FormatExample {
    public static void main(String args[]) {
        String name = "sonoo";
        Locale locale = new Locale("vi","VN");
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format(locale,"value is %.12f", 32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
}