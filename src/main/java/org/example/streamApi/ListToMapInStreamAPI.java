package org.example.streamApi;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product5{
    private Integer id;
    private String name;
    private Float price;

    public Integer getId() {
        return id;
    }

    public Product5(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
}
public class ListToMapInStreamAPI {
    public static void main(String [] arg){
        List<Product5> list = new ArrayList<>();
        list.add(new Product5(1,"HP Laptop",25000f));
        list.add(new Product5(2,"Dell Laptop",30000f));
        list.add(new Product5(3,"Lenovo Laptop",28000f));
        list.add(new Product5(4,"Sony Laptop",28000f));
        list.add(new Product5(5,"Apple Laptop",90000f));

       Map<Integer,String> map = list.stream()
                .collect(Collectors.toMap(product5 -> product5.getId(),product5 -> product5.getName()));
       //similarly there is a .toSet function as well...which convert list to set(has no repeating elements in it)
        System.out.println(map);
    }
}
