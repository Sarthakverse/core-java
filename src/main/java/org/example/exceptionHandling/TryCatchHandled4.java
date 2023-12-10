package org.example.exceptionHandling;
// resolving the exception in a catch block
public class TryCatchHandled4 {
    public static void main(String[] arg){
        int number = 50;
        int divideBy = 0;
        int data;
        try{
            data = number/divideBy; //if the error is encountered then increase the divisor value by 2
        }
        catch(Exception e){
            System.out.println(number/(divideBy+2));
        }
    }
}
