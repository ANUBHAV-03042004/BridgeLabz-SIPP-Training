package thisstaticfinalkeywordandinstanceofoperator.level1.vehicleregistrationsystem;

public class Vehicle {
    // Static variable shared by all vehicles
    private static double registrationFee = 5000.00;

    // Final variable to ensure the registration number cannot be changed
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize variables
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Static method to display registration fee
    public static void displayRegistrationFee() {
        System.out.println("Current Registration Fee: Rs. " + registrationFee);
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

    // Static method to process object with instanceof check
    public static void processVehicle(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Valid Vehicle Record:");
            ((Vehicle) obj).displayVehicleDetails();
        } else {
            System.out.println("Invalid object. Not a Vehicle.");
        }
    }
}
