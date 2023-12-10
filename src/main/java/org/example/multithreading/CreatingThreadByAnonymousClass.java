package org.example.multithreading;
//we don't create a thread class in extra...instead we use anonymous class
public class CreatingThreadByAnonymousClass {
    public static void main(String[] arg){
        new Thread(){
            @Override
            public void run(){
                for(int i=0 ;i<10 ;i++){
                    System.out.println((i));
                }
            }
        }.start();
    }
}
