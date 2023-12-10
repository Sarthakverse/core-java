package org.example.lambdaExpressions;

@FunctionalInterface
interface Conversation{
    public String say();
}
public class NoParameterLambdaExpression {
    public static void main(String [] arg){
        Conversation c = ()->{
            return "Hi i am doing conversation with the jvm";
        };
        System.out.println(c.say());
    }
}
