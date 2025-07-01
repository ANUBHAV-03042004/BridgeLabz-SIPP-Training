package classandobject.level2.shoppingcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Enter the number of items to add to the cart:");
        int no_of_items = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < no_of_items; i++) {
            System.out.println("Enter the Name of item:");
            String item = sc.nextLine();

            System.out.println("Enter the Price of item:");
            double price = sc.nextDouble();

            System.out.println("Enter the Quantity of item:");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            cart.addItem(new CartItem(item, price, quantity));
        }

        // Display total before removal
        System.out.println("\n Cart Summary Before Removal:");
        cart.displayTotal();

        // Remove an item
        System.out.println("\nEnter the Name of item to remove:");
        String itemToRemove = sc.nextLine();
        cart.removeItem(itemToRemove);

        // Display total after removal
        System.out.println("\n Cart Summary After Removal:");
        cart.displayTotal();

        sc.close();
    }
}