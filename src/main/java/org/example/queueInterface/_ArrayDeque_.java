package org.example.queueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//insertion and deletion can be donne from both the sides...
//deque can be used as stack(LIFO) and queue(FIFO) both
public class _ArrayDeque_ {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        Iterator<Integer> itr = deque.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
