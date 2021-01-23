package com.company;

public class TestThread {
    public  static  void main(String[] args){
        MyThread myThread0 = new MyThread();
        myThread0.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.setName("Luồng 2");   // thay đổi tên luồng thành Luồng 2
        myThread2.start();
    }
}
