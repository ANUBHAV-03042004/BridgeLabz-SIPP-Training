package thisstaticfinalkeywordandinstanceofoperator.level1.vehicleregistrationsystem;

public class Main {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle v1 = new Vehicle("MH12AB1234", "Ravi Kumar", "Car");
        Vehicle v2 = new Vehicle("UP32XY9876", "Anjali Mehta", "Bike");

        // Display vehicle details using processVehicle (with instanceof check)
        System.out.println("--- Vehicle 1 ---");
        Vehicle.processVehicle(v1);

        System.out.println("\n--- Vehicle 2 ---");
        Vehicle.processVehicle(v2);

        // Show current registration fee
        System.out.println("\n--- Registration Info ---");
        Vehicle.displayRegistrationFee();

        // Update registration fee
        System.out.println("\n--- Updating Registration Fee to Rs. 6000 ---");
        Vehicle.updateRegistrationFee(6000);

        // Display updated details
        System.out.println("\n--- Updated Vehicle Details ---");
        Vehicle.processVehicle(v1);
    }
}
