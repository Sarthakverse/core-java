package org.example.exceptionHandling;
//it is not necessary to handle unchecked exceptions or declare in throws clause.
public class ThrowUncheckedExceptions {
    public static void ageValidation(int age){
        if(age<18){
            throw new ArithmeticException("you should be above or 18 years old");
        }else{
            System.out.println("Welcome to the Club");
        }


    }
    public static void main(String [] arg){
        ageValidation(100);
        System.out.println("rest of the code...");
    }
}
