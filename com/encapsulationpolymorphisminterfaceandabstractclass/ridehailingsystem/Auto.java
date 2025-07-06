package encapsulationpolymorphisminterfaceandabstractclass.ridehailingsystem;


public class Auto extends Vehicle implements GPS {

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // Rate might be fixed/lower
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
