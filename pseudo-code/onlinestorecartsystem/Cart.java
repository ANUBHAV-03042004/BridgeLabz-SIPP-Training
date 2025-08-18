package onlinestorecartsystem;

import java.util.*;
class Cart {
 private List<Item> items = new ArrayList<>();

 public void addItem(Item item) {
     items.add(item);
 }

 // Generic method to calculate total price
 public <T extends Item> double calculateTotal(List<T> items) {
     return items.stream().mapToDouble(i -> i.price).sum();
 }

 public void showCart() {
     items.forEach(i -> System.out.println(i.name + " - $" + i.price));
     System.out.println("Total: $" + calculateTotal(items));
 }
}