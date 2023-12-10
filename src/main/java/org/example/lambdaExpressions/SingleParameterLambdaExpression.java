package org.example.lambdaExpressions;
@FunctionalInterface
interface GroupDiscussion{
    public String letsTalk(String str);
}
public class SingleParameterLambdaExpression {
    public static void main(String [] arg){
        GroupDiscussion gd = (str)->{
            return "My name is "+str;
        };
        System.out.println(gd.letsTalk("Vansh Chaudhary"));

        GroupDiscussion gd2 = str ->{
            return "Your name is "+str;
        };
        System.out.println(gd2.letsTalk("Vansh Chaudhary"));
    }
}
