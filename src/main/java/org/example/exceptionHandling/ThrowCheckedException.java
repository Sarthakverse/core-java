package org.example.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException{
    public static void method1() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\rsart\\OneDrive\\Desktop\\Canteen App feature doc.docx");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }
    public static void main(String [] arg){
       try{
           method1();
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }

       System.out.println("rest of the code");
    }
}
