package org.example.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Product3{
    private Integer id;
    private String name;
    private Float price;

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

    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class MaximumAndMinimumUsingStreamAPI {
    public static void main(String []arg){
        List<Product3> list = new ArrayList<>();
        list.add(new Product3(1,"HP Laptop",25000f));
        list.add(new Product3(2,"Dell Laptop",30000f));
        list.add(new Product3(3,"Lenevo Laptop",28000f));
        list.add(new Product3(4,"Sony Laptop",28000f));
        list.add(new Product3(5,"Apple Laptop",90000f));
        //      FINDING MAXIMUM
        Product3 productA = list.stream().max((product1,product2)->product1.getPrice()>=product2.getPrice()?1:-1).get();
        System.out.println(productA.getPrice());
        //      FINDING MINIMUM
        Product3 productB = list.stream().min((product1,product2)->product1.getPrice()>=product2.getPrice()?1:-1).get();
        System.out.println(productB.getPrice());
    }
}
