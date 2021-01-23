package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static  void main(String[] args){

        Set<Integer> hashsetInteger = new HashSet<Integer>();
        hashsetInteger.add(41);
        hashsetInteger.add(1);
        hashsetInteger.add(0);
        hashsetInteger.add(8);
        hashsetInteger.add(1);
        hashsetInteger.add(2);
        hashsetInteger.add(10);

//        Set<Integer> treesetInteger = new TreeSet<Integer>();
//        treesetInteger.add(41);
//        treesetInteger.add(1);
//        treesetInteger.add(0);
//        treesetInteger.add(8);
//        treesetInteger.add(1);
//        treesetInteger.add(2);
//        treesetInteger.add(10);

        Set<Integer> treesetInteger =  new TreeSet<>(hashsetInteger);
        System.out.println("Các phần tử có trong hashsetInteger: ");
        System.out.println(hashsetInteger);
        System.out.println("Các phần tử có trong treesetInteger: ");
        System.out.println(treesetInteger);
    }
}
