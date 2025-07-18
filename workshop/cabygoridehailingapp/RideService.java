package cabygoridehailingapp;

public class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private String pickupLocation;
    private String dropLocation;
    private double distance;
    private double fare;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(String pickupLocation, String dropLocation, double distance) {
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.fare = vehicle.calculateFare(distance);

        System.out.println("Ride booked with " + driver.getName() + " in a " + vehicle.getType() +
                " from " + pickupLocation + " to " + dropLocation + ".");
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Total fare: ₹" + fare);
    }

    public double getFare() {
        return fare;
    }
}