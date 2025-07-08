package objectorienteddesignprinciples.objectrelationshipsandcommunication.aggregationandcommunication;
//order aggregation product
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.println("Products in Order " + orderId + ":");
        for (Product product : products) {
            System.out.println("- " + product);
        }
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public Order placeOrder(String orderId) {
        Order order = new Order(orderId);
        orders.add(order);
        return order;
    }

    public void listOrders() {
        System.out.println("Orders for " + name + ":");
        for (Order order : orders) {
            order.listProducts();
        }
    }
}

public class ECommerceWithOrderCustomerAndProduct {
    public static void main(String[] args) {
        // Create Customer
        Customer bob = new Customer("Bob");

        // Create Products
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 499.99);

        // Place Order and Add Products (Aggregation)
        Order order1 = bob.placeOrder("O001");
        order1.addProduct(laptop);
        order1.addProduct(phone);

        // Demonstrate Association and Aggregation
        bob.listOrders();
    }
}