package org.example.lambdaExpressions;

@FunctionalInterface
interface Lecture{
    public String whichLectureAtWhatTime(String lecture,String time);
}
public class MultipleParametersLambdaExpression {
    public static void main(String[] arg){
        Lecture l1 = (lecture,time) ->{
            return "current lecture is "+lecture+" and it will end at "+time;
        };
        System.out.println(l1.whichLectureAtWhatTime("Technical Communication","11:50AM"));
    }
}
