package javaconstructors.Instancevsclassvariablesandmethods;

public class VehicleRegistration {
	// Instance variables
	    private String ownerName;
	    private String vehicleType;

	    // Class variable: shared by all vehicles
	    private static double registrationFee = 5000;

	    // Constructor
	    public VehicleRegistration(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    // Instance method to display vehicle details
	    public void displayVehicleDetails() {
	        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: ₹" + registrationFee);
	    }

	    // Class method to update registration fee
	    public static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

	    public static void main(String[] args) {
	    	VehicleRegistration v1 = new VehicleRegistration("Ravi", "Car");
	    	VehicleRegistration v2 = new VehicleRegistration("Sita", "Bike");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        System.out.println("\nChanging Registration Fee...\n");
	        VehicleRegistration.updateRegistrationFee(4500);

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
	}
