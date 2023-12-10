package org.example.lambdaExpressions;
//You can pass multiple statements inside lambda expressions
@FunctionalInterface
interface Talk{
    public void talking(String str);
}
public class LambdaExpressionMultipleStatements {
    public static void main(String[] arg){
        Talk t1 = (str) ->{
            System.out.println("hi there");
            String str2 = "sarthak" +str;
        };
        System.out.println("bhaji saab ");
    }
}
