package linkedlist.singlylinkedlist.inventorymanagementsystem;
class InventoryItem {
    String itemName;
    int itemId;
    int quantity;
    double price;
    InventoryItem next;

    public InventoryItem(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

 class InventoryManagementSystem {
	    private InventoryItem head;

	    // Add at beginning
	    public void addFirst(String name, int id, int qty, double price) {
	        InventoryItem newItem = new InventoryItem(name, id, qty, price);
	        newItem.next = head;
	        head = newItem;
	    }

	    // Add at end
	    public void addLast(String name, int id, int qty, double price) {
	        InventoryItem newItem = new InventoryItem(name, id, qty, price);
	        if (head == null) {
	            head = newItem;
	            return;
	        }
	        InventoryItem current = head;
	        while (current.next != null) current = current.next;
	        current.next = newItem;
	    }

	    // Add at specific position (0-based)
	    public void addAtPosition(String name, int id, int qty, double price, int pos) {
	        if (pos == 0) {
	            addFirst(name, id, qty, price);
	            return;
	        }
	        InventoryItem newItem = new InventoryItem(name, id, qty, price);
	        InventoryItem current = head;
	        for (int i = 0; i < pos - 1 && current != null; i++) {
	            current = current.next;
	        }
	        if (current == null) return;
	        newItem.next = current.next;
	        current.next = newItem;
	    }

	    // Remove by ID
	    public void removeById(int id) {
	        if (head == null) return;
	        if (head.itemId == id) {
	            head = head.next;
	            return;
	        }
	        InventoryItem current = head;
	        while (current.next != null && current.next.itemId != id) {
	            current = current.next;
	        }
	        if (current.next != null) current.next = current.next.next;
	    }

	    // Update quantity
	    public void updateQuantity(int id, int newQty) {
	        InventoryItem current = head;
	        while (current != null) {
	            if (current.itemId == id) {
	                current.quantity = newQty;
	                return;
	            }
	            current = current.next;
	        }
	    }

	    // Search by ID or Name
	    public void search(String keyword) {
	        InventoryItem current = head;
	        while (current != null) {
	            if (String.valueOf(current.itemId).equals(keyword) || current.itemName.equalsIgnoreCase(keyword)) {
	                System.out.println("Found: " + current.itemName + " ID: " + current.itemId);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Item not found.");
	    }

	    // Calculate total value
	    public double calculateTotalValue() {
	        double total = 0;
	        InventoryItem current = head;
	        while (current != null) {
	            total += current.quantity * current.price;
	            current = current.next;
	        }
	        return total;
	    }

	    // Sort by name or price (merge sort)
	    public void sort(boolean byName, boolean ascending) {
	        head = mergeSort(head, byName, ascending);
	    }

	    private InventoryItem mergeSort(InventoryItem node, boolean byName, boolean asc) {
	        if (node == null || node.next == null) return node;
	        InventoryItem mid = getMiddle(node);
	        InventoryItem midNext = mid.next;
	        mid.next = null;

	        InventoryItem left = mergeSort(node, byName, asc);
	        InventoryItem right = mergeSort(midNext, byName, asc);

	        return merge(left, right, byName, asc);
	    }

	    private InventoryItem merge(InventoryItem a, InventoryItem b, boolean byName, boolean asc) {
	        InventoryItem dummy = new InventoryItem("", 0, 0, 0);
	        InventoryItem tail = dummy;

	        while (a != null && b != null) {
	            boolean condition = byName ?
	                (asc ? a.itemName.compareToIgnoreCase(b.itemName) < 0 : a.itemName.compareToIgnoreCase(b.itemName) > 0)
	                : (asc ? a.price < b.price : a.price > b.price);

	            if (condition) {
	                tail.next = a;
	                a = a.next;
	            } else {
	                tail.next = b;
	                b = b.next;
	            }
	            tail = tail.next;
	        }
	        tail.next = (a != null) ? a : b;
	        return dummy.next;
	    }

	    private InventoryItem getMiddle(InventoryItem node) {
	        if (node == null) return null;
	        InventoryItem slow = node, fast = node;
	        while (fast.next != null && fast.next.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }

	    public void display() {
	        InventoryItem current = head;
	        while (current != null) {
	            System.out.println(current.itemName + " ID: " + current.itemId + " Qty: " + current.quantity + " Price: " + current.price);
	            current = current.next;
	        }
	    }
	}

