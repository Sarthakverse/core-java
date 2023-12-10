package org.example.collectionFramework.arrayList;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListClass{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("PineApple");
        fruits.add("Orange");
        fruits.add("Blueberry");
        fruits.add("Banana");

        //displaying the elements of arraylist
        System.out.println(fruits);

        // Accessing elements by index
        System.out.println(fruits.get(2));

        //updating an element
        System.out.println("previously 3rd element "+fruits.get(3));
        fruits.set(3,"Kiwi");
        System.out.println("after updating "+fruits);

        // Checking if an element exists
        if(fruits.contains("Apple")){
            System.out.println("apple is present in list");
        }
        else{
            System.out.println("apple is not present in list");
        }

        //size of array list
        System.out.println("size of arraylist is "+fruits.size());

        // Iterating through the ArrayList using for-each loop
        System.out.println("the elements of the array list are ");
        for(String fruit : fruits){
            System.out.print(fruit+" ");
        }

        // Iterating through the ArrayList using Iterator
        //iterator is one directional only...can go only in forward direction
        //Iterator basically has 3 methods
        //(1) hasNext() (2) next() (3) remove
        System.out.println("Iterating through the ArrayList using Iterator");
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        // Reversing the ArrayList
        System.out.println("Reversing the ArrayList");
        Collections.reverse(fruits);
        System.out.println(fruits);

        // Creating a sublist
        System.out.println("Creating a sublist");
        List<String> subList = fruits.subList(1,3);

        // Converting ArrayList to an array
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.print("ArrayList converted to Array: ");
        for(String fruit : fruitsArray){
            System.out.println(fruit);
        }
        System.out.println();

//        clear the array list
//        fruits.clear();
//        System.out.println("ArrayList after clearing: " + fruits);

        //iterating using FOR EACH method**
        fruits.forEach(a->{
            System.out.println(a);
        });

        //iteration using forEachRemaining() method
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr = fruits.iterator();
        itr.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}