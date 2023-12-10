package org.example.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CompareByKey {
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
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
