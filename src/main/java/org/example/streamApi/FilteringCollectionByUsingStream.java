package org.example.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    private Integer id;
    private String name;
    private float price;

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class FilteringCollectionByUsingStream {
    public static void main(String[] arg){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(2,"Dell Laptop",30000f));
        list.add(new Product(3,"Lenovo Laptop",28000f));
        list.add(new Product(4,"Sony Laptop",28000f));
        list.add(new Product(5,"Apple Laptop",90000f));

        List<Float> collectedList=list.stream()
                .map(product -> product.getPrice()) //fetches data
                .filter(price -> price >30000)//filters data
                .collect(Collectors.toList());//collects data

        System.out.println(collectedList);
    }
}
