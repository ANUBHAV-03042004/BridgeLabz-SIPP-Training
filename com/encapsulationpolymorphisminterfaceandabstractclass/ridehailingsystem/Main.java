package encapsulationpolymorphisminterfaceandabstractclass.ridehailingsystem;

public class Main {
    public static void main(String[] args) {
        Vehicle[] rides = new Vehicle[3];

        rides[0] = new Car("CAR101", "Arun", 15.5, "Indiranagar");
        rides[1] = new Bike("BIK202", "Ravi", 8.0, "HSR Layout");
        rides[2] = new Auto("AUT303", "Meena", 10.0, "Koramangala");

        double sampleDistance = 12.0; // in km

        for (Vehicle v : rides) {
            System.out.println("\n--- Ride Details ---");
            v.getVehicleDetails();
            double fare = v.calculateFare(sampleDistance);
            System.out.println("Fare for " + sampleDistance + " km: Rs." + fare);
        }
    }
}
