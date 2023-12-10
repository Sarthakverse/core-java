package org.example.exceptionHandling;

public class TryCatchHandled3 {
    public static void main(String[] arg){
        try{
            int data = 20/0;
        }
        catch(Exception e){
            System.out.println("Can't divide by zero");
        }
    }
}
