package encapsulationpolymorphisminterfaceandabstractclass.vehiclerentalsystem;
import java.util.*;


abstract class Vehicle {
    // Protected fields for encapsulation - accessible to subclasses but not external classes
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;
    
    // Constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    
    // Abstract method - must be implemented by all subclasses
    public abstract double calculateRentalCost(int days);
    
    // Concrete method - common functionality for all vehicles
    public String getVehicleDetails() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rate: $" + rentalRate;
    }
    
    // Getter methods for encapsulation
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
}

