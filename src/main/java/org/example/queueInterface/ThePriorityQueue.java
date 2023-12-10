package org.example.queueInterface;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ThePriorityQueue {
    public static void main(String [] arg){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);//will add the element and return true on success
        pq.offer(90);// will add the element
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
//      pq.add(null);  null values cant be stored

        //.element() will retrieve the first element of the head
        System.out.println("head of this queue is :"+pq.element());
        Iterator<Integer> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("--------------------------------------------------------");
        //.peek() will retrieve the first element of the head or return null if the queue is empty
        System.out.println("head of the queue is : "+pq.peek());
        Iterator<Integer> itr2 = pq.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("--------------------------------------------------------");
        //.remove() will remove the element from head
        pq.remove();
        //.poll() will remove the element from head and return null if queue is empty
        pq.poll();
        Iterator<Integer> itr3 = pq.iterator();
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }

    }
}
