package org.example.multithreading;

class Simple1 extends Thread{
    @Override
    public void run(){
        for(int i=0 ;i<50 ; i++)
        {
            System.out.println("thread 1 is running");
        }
    }
}

class Simple2 extends Thread{
    @Override
    public void run(){
        for(int i =0 ;i<50 ;i++)
        {
            System.out.println("thread 2 is running");
        }
    }
}
public class RunTaskUsingThread {
    public static void main(String[] args) {
        Simple1 thread1 = new Simple1();
        Simple2 thread2 = new Simple2();
        thread1.start();
        thread2.start();
//      thread1.start(); second time you cant start the same thread until .join() is not used , it will give error

    }
}
