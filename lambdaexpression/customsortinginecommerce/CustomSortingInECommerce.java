package customsortinginecommerce;

//LambdaSorting.java
//Demonstrates sorting products dynamically using lambdas with Comparator

import java.util.*;

class Product {
 String name;
 double price;
 double rating;

 Product(String name, double price, double rating) {
     this.name = name;
     this.price = price;
     this.rating = rating;
 }

 @Override
 public String toString() {
     return name + " | Price: " + price + " | Rating: " + rating;
 }
}

public class CustomSortingInECommerce {
 public static void main(String[] args) {
     List<Product> products = new ArrayList<>();
     products.add(new Product("Laptop", 60000, 4.5));
     products.add(new Product("Phone", 30000, 4.7));
     products.add(new Product("Headphones", 2000, 4.2));

     System.out.println("Sort by Price:");
     products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
     products.forEach(System.out::println);

     System.out.println("\nSort by Rating:");
     products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
     products.forEach(System.out::println);
 }
}
