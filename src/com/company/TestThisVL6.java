package com.company;

class A {
    A getA() {
        return this;
    }
    void msg() {
        System.out.println("Hello Java");
    }
}

public class TestThisVL6 {
    public static void main(String args[]) {
        new A().getA().msg();
    }
}