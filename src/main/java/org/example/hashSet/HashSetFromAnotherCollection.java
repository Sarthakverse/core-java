package org.example.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetFromAnotherCollection {
    public static void main(String[] arg){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(null); //unlike others, set can have null value also
        list.add(40);
        list.add(50);
        list.add(50);

        HashSet<Integer> set = new HashSet<>(list);
        Iterator<Integer> itr =set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
