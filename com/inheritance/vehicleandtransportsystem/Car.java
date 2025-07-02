package inheritance.vehicleandtransportsystem;

public class Car extends Vehicle {
    private int seatCapacity;
// car has seat capacity
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car, Seat Capacity: " + seatCapacity);
    }
}
