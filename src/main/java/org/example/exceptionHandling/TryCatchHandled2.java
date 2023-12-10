package org.example.exceptionHandling;

public class TryCatchHandled2 {
    public static void main(String [] arg){
        try{
            int data = 10/0;
            System.out.println(data); //if exception occurs in upper line then this line never gets executed
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
