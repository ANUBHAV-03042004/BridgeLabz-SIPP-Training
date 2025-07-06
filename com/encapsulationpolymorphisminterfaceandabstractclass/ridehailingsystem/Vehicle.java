package encapsulationpolymorphisminterfaceandabstractclass.ridehailingsystem;

public abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    // Encapsulated getters and setters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per KM: Rs." + ratePerKm);
        System.out.println("Current Location: " + currentLocation);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}

