package classandobject.level1.handlemobilephonedetails;

public class HandleMobilePhoneDetails {
	    String brand;
	    String model;
	    double price;

	    // Constructor to initialize phone details
	    HandleMobilePhoneDetails(String brand, String model, double price) {
	        this.brand = brand;
	        this.model = model;
	        this.price = price;
	    }

	    // Method to display phone details
	    void displayDetails() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: Rs." + price);
	    }
}
