package org.example.lambdaExpressions;
//WITHOUT USING LAMBDA EXPRESSION
interface drawable{
    public void draw();
}
public class WithoutLambdaExpression {
    public static void main(String [] arg){
        int width = 10;
        //defining anonymous inner class, because lambda expression not used
        drawable d= new drawable() {
            @Override
            public void draw() {
                System.out.println("drawing "+width);
            }
        };
        d.draw();

    }
}
