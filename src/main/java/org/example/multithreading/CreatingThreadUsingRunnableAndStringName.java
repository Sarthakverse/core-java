package org.example.multithreading;

class MyThread2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("thread is running...");
        for(int i=0 ;i<500 ; i++)
        {
            System.out.println(i);
        }
    }
}
public class CreatingThreadUsingRunnableAndStringName {
    public static void main(String [] args){
        Runnable r1 = new MyThread2();
        Thread mt2 = new Thread(r1,"1st thread");
        mt2.start();
        String str = mt2.getName();
        System.out.println(str);
        System.out.println(mt2.getState());
    }
}
