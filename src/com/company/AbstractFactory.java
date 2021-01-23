//package com.company;
//
//interface Human {
//    public void feedPet();
//}
//
//interface Pet{
//    public  void eat();
//}
//
//class Cat implements Pet {
//    public void eat() {
//        System.out.println("Con mèo khi ăn sẽ kêu meo meo!!!");
//    }
//}
//class Dog implements Pet {
//    public void eat(){
//        System.out.println("Con chó khi ăn sẽ kêu gâu gâu!!!");
//    }
//}
//class Pig implements Pet {
//    public void eat(){
//        System.out.println("Con lợn khi ăn sẽ kêu ụt ịt!!!");
//    }
//}
//
//class Child implements Human {
//    @Override
//    public void feedPet() {
//        System.out.println("Trẻ con không ý thức được khi cho thú cưng ăn.");
//    }
//}
//
// class Adult implements Human {
//    @Override
//    public void feedPet() {
//        System.out.println("Người lớn sẽ ý thức được khi cho thú cưng ăn.");
//    }
//}
//class Elder implements Human {
//@Override
//public void feedPet() {
//        System.out.println("Người già thì cho thú cưng ăn quá nhiều.");
//        }
//        }
//abstract class AbstractFactory {
//    abstract Pet getPet(String pet);
//    abstract Human getHuman(String human);
//}
//public class AbstractFactory {
//}
