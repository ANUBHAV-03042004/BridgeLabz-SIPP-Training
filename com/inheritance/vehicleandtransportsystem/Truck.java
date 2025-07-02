package inheritance.vehicleandtransportsystem;

public class Truck extends Vehicle {
    private int loadCapacity;
// truck has load capacity
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck, Load Capacity: " + loadCapacity + " kg");
    }
}
