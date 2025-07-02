package inheritance.vehicleandtransportsystem;

public class Bike extends Vehicle {
    private boolean hasCarrier;
// bike has carrier or not.
    public Bike(int maxSpeed, String fuelType, boolean hasCarrier) {
    	  super.setmaxspeed(maxSpeed);
          super.setfueltype(fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle, Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
