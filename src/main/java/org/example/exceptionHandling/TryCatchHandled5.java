package org.example.exceptionHandling;

public class TryCatchHandled5 {
    public static void main(String [] arg){
        try{
            int data = 10/0;
        }
        catch(Exception e){
            int data2 = 50/0; // the catch block should only handle the exceptions, don't do anything else
        }
    }
}
