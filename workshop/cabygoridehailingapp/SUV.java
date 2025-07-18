package cabygoridehailingapp;
public class SUV extends Vehicle {
    public SUV(String vehicleNumber, int capacity) {
        super(vehicleNumber, capacity);
        this.type = "SUV";
        this.baseFare = 100;
        this.ratePerKm = 20;
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + distance * ratePerKm;
    }
}