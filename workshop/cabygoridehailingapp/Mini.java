package cabygoridehailingapp;

public class Mini extends Vehicle {
    public Mini(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity);
        this.type = "Mini";
        this.baseFare = 50;
        this.ratePerKm = 10;
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}