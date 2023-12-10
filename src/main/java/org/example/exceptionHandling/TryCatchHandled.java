package org.example.exceptionHandling;

public class TryCatchHandled {
    public static void main(String [] arg){
        try {
            int data = 20/0;
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the statements of code");
    }
}
