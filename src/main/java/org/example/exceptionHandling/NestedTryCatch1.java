package org.example.exceptionHandling;

public class NestedTryCatch1 {
    public static void main(String[] arg){
        try{

            try{
                System.out.println("nested try block-1");
                int a = 10/0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }

            try{
                System.out.println("Nested try block 2");
                int a[] = new int[5];
                a[5] = 4;
            }catch (IndexOutOfBoundsException e){
                System.out.println(e);
            }

            System.out.println("other statements");

        }catch(Exception e)
        {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");
    }
}
