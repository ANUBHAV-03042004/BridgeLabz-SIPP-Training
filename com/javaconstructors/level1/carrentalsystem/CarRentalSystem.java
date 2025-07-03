package javaconstructors.level1.carrentalsystem;

public class CarRentalSystem {
	    String customerName;
	    String carModel;
	    int rentalDays;
	    double dailyRate;

	    // Constructor
	    public CarRentalSystem(String customerName, String carModel, int rentalDays, double dailyRate) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	        this.dailyRate = dailyRate;
	    }

	    // Method to calculate total rental cost
	    public double calculateTotalCost() {
	        return rentalDays * dailyRate;
	    }

	    public void displayRentalDetails() {
	        System.out.println("Customer: " + customerName);
	        System.out.println("Car Model: " + carModel);
	        System.out.println("Days: " + rentalDays + ", Daily Rate: ₹" + dailyRate);
	        System.out.println("Total Cost: ₹" + calculateTotalCost());
	    }

	    public static void main(String[] args) {
	        CarRentalSystem rental = new CarRentalSystem("Rahul", "Honda City", 5, 1200);
	        rental.displayRentalDetails();
	    }
	}