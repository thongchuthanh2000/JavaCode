package com.company;

public class InternExample {
    public static void main(String args[]) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//trả về chuỗi từ Pool
        System.out.println(s1 == s2);//false vì reference là khác nhau
        System.out.println(s2 == s3);//true vì reference là giống nhau
    }
}