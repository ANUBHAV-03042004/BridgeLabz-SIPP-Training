package cabygoridehailingapp;

public interface IRideService {
    void bookRide(String pickupLocation, String dropLocation, double distance);
    void endRide();
}