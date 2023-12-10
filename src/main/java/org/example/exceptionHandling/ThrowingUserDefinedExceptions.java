package org.example.exceptionHandling;

class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        super(str);
    }
}
public class ThrowingUserDefinedExceptions {
    public static void main(String[] arg){
        try{
            throw new UserDefinedException("this is user defined exception");
        }catch (UserDefinedException e){
            System.out.println("error is caught");
            System.out.println(e.getMessage());
        }
    }
}
