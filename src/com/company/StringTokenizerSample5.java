package com.company;

import java.util.StringTokenizer;

public class StringTokenizerSample5 {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Toi-taen-,la-VietTut", "-,", false);
        System.out.println("Tổng số token: " + st.countTokens());
        // in chuỗi token dựa trên dấu phân cách
        System.out.println("Chuỗi token: " + st.nextToken("-,"));
        System.out.println("Chuỗi token kế tiếp: " + st.nextToken("a"));
    }
}