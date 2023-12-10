package org.example.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElementsToLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5);
        list.add(10);

        //way 1
        list.forEach((a)->{
            System.out.println(a);
        });

        System.out.println("-------------------------------------------");

        //way 2
        for(Integer listItem:list){
            System.out.println(listItem);
        }

        System.out.println("-------------------------------------------");

        //way 3
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("-------------------------------------------");

        //way 4
        Iterator itr2 = list.iterator();
        while(itr2.hasNext()){
            Integer s = (Integer)itr2.next();
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
        //reversing the linked list
        Iterator<Integer> itr3 = list.descendingIterator();
        while(itr3.hasNext()){
              System.out.println(itr3.next());
        }
    }
}
