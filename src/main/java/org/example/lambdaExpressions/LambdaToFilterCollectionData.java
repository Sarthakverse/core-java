package org.example.lambdaExpressions;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Products{
    private Integer id;
    private String name;
    private Float price;

    public Products(Integer id, String name, Float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
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
}
public class LambdaToFilterCollectionData {
   public static void main(String[] arg){
       List<Product> list = new ArrayList<>();
       list.add(new Product(1,"Computer",45000f));
       list.add(new Product(2,"Iphone",95000f));
       list.add(new Product(3,"BhagavadGeeta",100f));
       list.add(new Product(4,"Nokia Lumia",15000f));
       list.add(new Product(5,"Redmi4 ",26000f));
       list.add(new Product(6,"Lenovo Vibe",19000f));

       // with use of lambda expression
       Stream<Product> filtered_data = list.stream().filter((product)->{
           return product.getPrice() > 20000;
       });
       filtered_data.forEach((product) -> {
           System.out.println(product.getName() + " " + product.getPrice());
       });

       System.out.println("---------------------------------");

       //without use of lambda expression
       Stream<Product> filtered_data2 = list.stream().filter(new Predicate<Product>() {
           @Override
           public boolean test(Product product) {
               return product.getPrice() > 20000;
           }
       });
       filtered_data2.forEach((product) -> {
           System.out.println(product.getName() + " " + product.getPrice());
       });



   }
}
