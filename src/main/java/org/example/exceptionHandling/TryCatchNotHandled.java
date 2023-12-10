package org.example.exceptionHandling;
//WHAT HAPPENS WHEN YOU DON'T HANDLE EXCEPTION-->your program gets terminated as soon as exception is met
//jvm llooks for handling, if it does not find it then
public class TryCatchNotHandled {
    public static void main(String[] arg){
        int data = 500/0; //any code below this will not get executed because of exception that is not handled
        System.out.println(data);
    }
}
