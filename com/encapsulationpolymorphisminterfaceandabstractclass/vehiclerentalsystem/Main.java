package encapsulationpolymorphisminterfaceandabstractclass.vehiclerentalsystem;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles demonstrating polymorphism
        List<Vehicle> vehicles = new ArrayList<>();
        
        // Adding different types of vehicles to the same list
        vehicles.add(new Car("CAR001", 50.0, "POL12345"));
        vehicles.add(new Bike("BIKE001", 20.0, "POL67890"));
        vehicles.add(new Truck("TRUCK001", 100.0, "POL11111"));
        
        System.out.println("=== VEHICLE RENTAL SYSTEM ===\n");
        
        // Demonstrate polymorphism - same method call works for all vehicle types
        int rentalDays = 5;
        double totalRentalCost = 0;
        double totalInsuranceCost = 0;
        
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            
            // Polymorphism - calculateRentalCost() behaves differently for each vehicle type
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: $" + String.format("%.2f", rentalCost));
            
            // Check if vehicle is insurable and calculate insurance
            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: $" + String.format("%.2f", insuranceCost));
                System.out.println("Insurance Details: " + insurableVehicle.getInsuranceDetails());
                totalInsuranceCost += insuranceCost;
            }
            
            totalRentalCost += rentalCost;
            System.out.println("-".repeat(50));
        }
        
        // Display totals
        System.out.println("\n=== SUMMARY ===");
        System.out.println("Total Rental Cost: $" + String.format("%.2f", totalRentalCost));
        System.out.println("Total Insurance Cost: $" + String.format("%.2f", totalInsuranceCost));
        System.out.println("Grand Total: $" + String.format("%.2f", totalRentalCost + totalInsuranceCost));
        
        // Demonstrate encapsulation - trying to access private fields would cause compilation error
        // System.out.println(vehicles.get(0).insurancePolicyNumber); // This would not compile
        
        // Demonstrate method overriding and polymorphism
        System.out.println("\n=== POLYMORPHISM DEMONSTRATION ===");
        demonstratePolymorphism(vehicles, rentalDays);
    }
    

    private static void demonstratePolymorphism(List<Vehicle> vehicles, int days) {
        System.out.println("Processing different vehicle types with same method:");
        
        for (Vehicle v : vehicles) {
            // Runtime polymorphism - the actual method called depends on the object type
            processVehicleRental(v, days);
        }
    }
    
    private static void processVehicleRental(Vehicle vehicle, int days) {
        System.out.println("Processing " + vehicle.getType() + " " + vehicle.getVehicleNumber());
        System.out.println("Cost: $" + String.format("%.2f", vehicle.calculateRentalCost(days)));
        System.out.println();
    }
}