package linkedlist.singlylinkedlist.inventorymanagementsystem;
public class Main {
    public static void main(String[] args) {
    	InventoryManagementSystem inv = new InventoryManagementSystem ();

        inv.addFirst("Mouse", 101, 25, 499.99);
        inv.addLast("Keyboard", 102, 10, 999.50);
        inv.addAtPosition("Monitor", 103, 5, 8999.00, 1);

        System.out.println("Inventory List:");
        inv.display();

        System.out.println("\nSearch for Item with ID 102:");
        inv.search("102");

        System.out.println("\nUpdate Quantity of ID 101 to 30");
        inv.updateQuantity(101, 30);
        inv.display();

        System.out.println("\nTotal Inventory Value: Rs. " + inv.calculateTotalValue());

        System.out.println("\nSorting by Item Name (Ascending):");
        inv.sort(true, true);
        inv.display();

        System.out.println("\nRemoving item with ID 102:");
        inv.removeById(102);
        inv.display();
    }
}
