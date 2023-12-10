package org.example.exceptionHandling;
//MULTIPLE CATCH BLOCKS
public class TryCatchHandled6 {
    public static void main(String[] arg){
        try{
            int a = 10/0;
            int[] data = {1,2,3,4,5};
            System.out.println(data[5]);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("rest of the code");
    }
}
