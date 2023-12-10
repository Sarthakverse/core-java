package org.example.lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    private Float price;

    public Product(Integer id, String name , Float price ){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class LambdaExpressionComparator {
    public static void main(String [] arg){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Computer",45000f));
        list.add(new Product(2,"Iphone",95000f));
        list.add(new Product(3,"BhagavadGeeta",100f));

        System.out.println("sorting on the basis of name");

        //IMPLEMENTING LAMBDA EXPRESSION

        list.sort((p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });
        for(Product p:list){
            System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
        }
    }

}
