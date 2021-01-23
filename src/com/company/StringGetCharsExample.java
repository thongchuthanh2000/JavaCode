package com.company;

public class StringGetCharsExample {
    public static void main(String args[]) {
        String str = new String("hello Java how are you?");
        char[] ch = new char[4];
        try {
            str.getChars(6, 10, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}