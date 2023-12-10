package org.example.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// unlike hashset, hashmap can't have null value in it
// hashmap cant be traversed, u have to convert it into set firstly
// it's an interface
public class HashMapImplementation {
    public static void main(String[] arg){
       Map<Integer,String> map = new HashMap<>();

       map.put(1,"Sarthak Rastogi");
       map.put(2,"Harsh Singh");
       map.put(3,"Ratnesh Mishra");
       map.put(4,"Pranav Bisaria");
       map.put(5,"Ayush Rastogi");

       //traversing the map by converting it to entry set
        Set set = map.entrySet();
        Iterator itr =  set.iterator();
        while (itr.hasNext()){
            //converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //OR this is another way 👇
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
