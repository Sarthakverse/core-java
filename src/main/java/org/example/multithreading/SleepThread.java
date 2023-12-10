package org.example.multithreading;
class thread1 implements Runnable{
    @Override
    public void run(){
        for(int i=0 ;i<10 ;i++){
            try{
                Thread.sleep(100); //it throws checked exception so handling it is must
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SleepThread {
    public static void main(String[] args) {
       Thread t1 = new Thread(new thread1());
       Thread t2 = new Thread(new thread1());
       t1.start();
       t2.start();
    }
}
