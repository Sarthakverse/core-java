package org.example.multithreading;
//daemon thread has only one role....it acts as a service provider to user threads for executing any background task
//its life is only until user thread lives
class testDaemon extends Thread{
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("yes this is daemon thread running...");
        }else{
            System.out.println("User thread is running.....");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        testDaemon t1 = new testDaemon();
        testDaemon t2 = new testDaemon();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
