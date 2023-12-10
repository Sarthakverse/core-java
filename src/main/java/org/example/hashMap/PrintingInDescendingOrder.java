package org.example.hashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class PrintingInDescendingOrder {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103, "Suman");
        map.put(104, "Neha");
        map.put(105, "Ravi");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);



    }
}
