package org.example.multithreading;
class ThreadJoin extends Thread{
    @Override
    public void run(){

            for(int i=0 ; i<20 ; i++) {
                try {
                    Thread.sleep(300);
                    System.out.println("the name of current thread is : "+Thread.currentThread().getName());
                }catch(InterruptedException ie){
                    System.out.println("Exception has been caught "+ie);
                }
                System.out.println(i);
            }
    }
}
public class ThreadJoinMethod {
    public static void main(String [] args){
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.start();

        try{
            System.out.println("name of current thread is : "+Thread.currentThread().getName());
            t1.join();
        }catch(InterruptedException ie){
            System.out.println("exception is caught "+ie);
        }

        t2.start();

        try{
            System.out.println("the name of current thread is : "+Thread.currentThread().getName());
            t2.join();
        }catch(InterruptedException ie){
            System.out.println("the Exception has been caught "+ie);
        }

        t3.start();

    }
}
