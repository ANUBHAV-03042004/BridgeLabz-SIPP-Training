package encapsulationpolymorphisminterfaceandabstractclass.ridehailingsystem;


public class Bike extends Vehicle implements GPS {

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Usually lower rate
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
