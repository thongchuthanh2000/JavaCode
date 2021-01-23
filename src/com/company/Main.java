package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	    List<String> listString = new ArrayList<String>();
//	    Scanner scanner =  new Scanner(System.in);
//
//	    listString.add("Monday");
//	    listString.add("Tuesday");
//        listString.add("Wednesday");
//        listString.add("Thursday");
//        listString.add("Friday");
//        listString.add("Saturday");
//        listString.add("Sunday");
//
//        Iterator<String> iterator =  listString.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }
//
//        ListIterator<String> listIterator  = listString.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//
//
//        String element = scanner.nextLine();
//        int index = scanner.nextInt();
//
//        listString.set(index,element);
//        for(String str: listString){
//            System.out.println(str);
//        }
//        listString.remove("Tuesday");
//
//        for(String str:listString){
//            System.out.println(str);
//        }

        DemoThread demoThread0 = new DemoThread();
        Thread thread0 = new Thread(demoThread0);
        thread0.start();

        DemoThread demoThread1 = new DemoThread();
        Thread thread1 = new Thread(demoThread1);
        thread1.setName("Luồng 1");
        thread1.start();

        DemoThread demoThread2 = new DemoThread();
        Thread thread2 = new Thread(demoThread2);
        thread2.start();
    }
}
