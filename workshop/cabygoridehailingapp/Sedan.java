package cabygoridehailingapp;


public class Sedan extends Vehicle {
    public Sedan(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity);
        this.type = "Sedan";
        this.baseFare = 80;
        this.ratePerKm = 15;
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}