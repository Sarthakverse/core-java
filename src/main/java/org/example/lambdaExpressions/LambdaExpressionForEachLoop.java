package org.example.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForEachLoop {
    public static void main(String[] arg){
        List<String> list = new ArrayList<>();
        list.add("Sarthak Rastogi");
        list.add("Suraj Yadav");
        list.add("Satish Rana");

        list.forEach(
                (n)->{System.out.println(n);}
        );
    }
}
