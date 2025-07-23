package smartwarehousemanagementsystem;

import java.util.*;

//Abstract class for warehouse items
abstract class WarehouseItem {
 private String name;

 public WarehouseItem(String name) {
     this.name = name;
 }

 public String getName() {
     return name;
 }

 public abstract String getCategory();
}

//Electronics item
class Electronics extends WarehouseItem {
 public Electronics(String name) {
     super(name);
 }

 @Override
 public String getCategory() {
     return "Electronics";
 }
}

//Groceries item
class Groceries extends WarehouseItem {
 public Groceries(String name) {
     super(name);
 }

 @Override
 public String getCategory() {
     return "Groceries";
 }
}

//Furniture item
class Furniture extends WarehouseItem {
 public Furniture(String name) {
     super(name);
 }

 @Override
 public String getCategory() {
     return "Furniture";
 }
}

//Generic storage class with bounded type parameter
class Storage<T extends WarehouseItem> {
 private List<T> items = new ArrayList<>();

 public void addItem(T item) {
     items.add(item);
 }

 public List<T> getItems() {
     return items;
 }
}

//Utility class to display items using wildcard
class WarehouseUtils {
 public static void displayItems(List<? extends WarehouseItem> items) {
     for (WarehouseItem item : items) {
         System.out.println(item.getName() + " [" + item.getCategory() + "]");
     }
 }
}

//Main method to test the system
public class SmartWarehouseManagementSystem {
 public static void main(String[] args) {
     Storage<Electronics> electronicsStorage = new Storage<>();
     Storage<Groceries> groceriesStorage = new Storage<>();
     Storage<Furniture> furnitureStorage = new Storage<>();

     electronicsStorage.addItem(new Electronics("Laptop"));
     electronicsStorage.addItem(new Electronics("Smartphone"));

     groceriesStorage.addItem(new Groceries("Rice"));
     groceriesStorage.addItem(new Groceries("Milk"));

     furnitureStorage.addItem(new Furniture("Chair"));
     furnitureStorage.addItem(new Furniture("Table"));

     System.out.println(" Electronics:");
     WarehouseUtils.displayItems(electronicsStorage.getItems());

     System.out.println("\n Groceries:");
     WarehouseUtils.displayItems(groceriesStorage.getItems());

     System.out.println("\n Furniture:");
     WarehouseUtils.displayItems(furnitureStorage.getItems());
 }
}