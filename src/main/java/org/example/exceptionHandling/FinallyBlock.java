package org.example.exceptionHandling;

public class FinallyBlock {
    public static void main(String[] arg){
        try{
            int a = 20/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        finally{
            System.out.println("it will execute always");
        }
    }
}
