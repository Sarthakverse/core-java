package org.example.lambdaExpressions;
@FunctionalInterface
interface drawing{
    void draw();
}
public class WithLambdaExpression {
    public static void main(String[] arg){
        int width = 10;
        drawing d2 = ()->{
            System.out.println("drawing "+width);
        };
        d2.draw();
    }
}
