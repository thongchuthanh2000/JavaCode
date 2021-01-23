package com.company;

public class TestThisVL5 {
    int data=10;
    TestThisVL5(){
        B b = new B(this);
        b.display();
    }
    public static void main(String args[]) {
        TestThisVL5 a = new TestThisVL5();
    }


}
class B {
    TestThisVL5 obj;
    B(TestThisVL5 obj) {
        this.obj=obj;
    }
    void display() {
        System.out.println(obj.data);// sử dụng biến thành viên cửa lớp A4
    }
}