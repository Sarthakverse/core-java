package org.example.hashSet.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class linkedHashSetMaintainsOrder {
    public static void main(String [] arg){
        //it is same as HashSet
        //but uses more memory
        //use only when maintaining order is necessary
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(1);
        linkedSet.add(null); //yes null can also be added
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(5);
        Iterator<Integer> itr = linkedSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
