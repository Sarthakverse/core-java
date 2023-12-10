package org.example.streamApi;

import java.util.ArrayList;
import java.util.List;

class Product4{
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

    public Product4(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class CountInStreamApi {
    public static void main(String [] arg){
          List<Product4> list = new ArrayList<>();
            list.add(new Product4(1,"HP Laptop",25000f));
            list.add(new Product4(2,"Dell Laptop",30000f));
            list.add(new Product4(3,"Lenovo Laptop",28000f));
            list.add(new Product4(4,"Sony Laptop",28000f));
            list.add(new Product4(5,"Apple Laptop",90000f));

            long count = list.stream()
                    .filter(product4 -> product4.getPrice()<30000)
                    .count();
            System.out.println(count);

    }
}
