package inheritance.vehicleandtransportsystem;
public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;
// parent class
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

