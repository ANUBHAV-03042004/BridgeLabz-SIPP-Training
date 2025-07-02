package inheritance.hybridinheritance.restaurantmanagementsystem;

public class Main {
	// Driver class for Restaurant System
	    public static void main(String[] args) {
	        Chef chef = new Chef("Ravi", 101);
	        Waiter waiter = new Waiter("Aman", 102);

	        chef.displayInfo();
	        chef.performDuties();

	        waiter.displayInfo();
	        waiter.performDuties();
	    }
	}


