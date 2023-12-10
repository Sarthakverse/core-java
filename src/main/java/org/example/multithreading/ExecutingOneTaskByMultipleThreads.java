package org.example.multithreading;

class task1 extends Thread{
    @Override
    public void run(){
       int i =0;
        while(i<10){
            System.out.println(i);
            i++;
        }
    }
}
public class ExecutingOneTaskByMultipleThreads {
    public static void main(String [] args)
    {
         task1 thread1 = new task1();
         task1 thread2 = new task1();
         thread1.start();
         thread2.start();
    }
}
