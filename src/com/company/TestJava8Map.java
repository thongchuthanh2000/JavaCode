package com.company;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestJava8Map {
    public  static  void main(String[] args){
        Map<Character, Integer> mapChar = new TreeMap<>();

        mapChar.put('A', 1);
        mapChar.put('B', 2);
        mapChar.put('C', 3);
        mapChar.put('D', 4);
        mapChar.put('E', 5);
        mapChar.put('F', 6);
//
//        mapChar.forEach((keyChar,ValueInt)-> System.out.println(keyChar + " "+ ValueInt));
//
//        for (Character key: mapChar.keySet()){
//            System.out.println(key);
//        }

        Iterator<Map.Entry<Character,Integer>> iterator =  mapChar.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Character,Integer> entry =  iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
