package org.example.lambdaExpressions;

public class LambdaExpressionCreatingThread {
    public static void main(String [] arg){
//     creating thread without lambda
       Runnable r1 = new Runnable(){
           @Override
           public void run(){
               System.out.println("thread 1 is running");
           }
       };
       Thread t1 = new Thread(r1);
       t1.start();


//      creating thread with lambda
        Runnable r2 = ()->{
            System.out.println("thread 2 is running");
        };
        Thread t2 = new Thread(r2);
        t2.start();

    }
}
