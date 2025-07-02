package inheritance.hybridinheritance.restaurantmanagementsystem;

	// Subclass Waiter implementing Worker
	class Waiter extends Person implements Worker {
	    public Waiter(String name, int id) {
	        super(name, id);
	    }

	    @Override
	    public void performDuties() {
	        System.out.println("Waiter serves customers.");
	    }
	}
