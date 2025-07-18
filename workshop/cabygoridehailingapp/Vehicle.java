package cabygoridehailingapp;
public abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    protected String type;

    protected double baseFare;
    protected double ratePerKm;

    public Vehicle(String vehicleNumber, int capacity) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateFare(double distance);
}