package org.example.hashSet;

import java.util.Iterator;
import java.util.LinkedList;

public class SetHasUniqueElementsOnly {
    public static void main(String[] arg){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        Iterator<Integer> itr =list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

    }
}
