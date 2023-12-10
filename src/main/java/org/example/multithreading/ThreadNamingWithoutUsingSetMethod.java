package org.example.multithreading;
class threadName extends Thread{
    threadName(String name){
        super(name);
    }
    @Override
    public void run(){
        try{

            for(int i=0 ;i<20 ;i++){
                Thread.sleep(300);
                System.out.println(Thread.currentThread().getName()+" thread is executing....");
            }
        }catch(InterruptedException ie){
            System.out.println("exception has been caught "+ie);
        }


    }
}
public class ThreadNamingWithoutUsingSetMethod {
    public static void main(String [] args){
        threadName th1 = new threadName("first thread");
        threadName th2 = new threadName("second thread");
        th1.start();
        try{
            th1.join();
        }catch(InterruptedException ie){
            System.out.println("exception has been caught "+ie);
        }
        th2.start();

    }
}
