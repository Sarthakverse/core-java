package org.example.multithreading;

public class SpawningAThread {
    public static void main(String[] args) {
        Thread t1 = new Thread("my first thread"); //spawning a new thread using Thread class directly
        t1.start();

        String str = t1.getName();
        System.out.println(str);
    }
}
