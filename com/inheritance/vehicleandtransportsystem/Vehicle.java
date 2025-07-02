package inheritance.vehicleandtransportsystem;
public class Vehicle {
    private int maxSpeed;
    private String fuelType;
// parent class
    public void setmaxspeed(int maxSpeed) {
    	  this.maxSpeed = maxSpeed;
    }
    public int getmaxspeed() {
    	return maxSpeed;
    }
    public void setfueltype(String fuelType)
    {
    	  this.fuelType = fuelType;
    }
    public String setfueltype()
    {
    	return fuelType;
    }
//    public Vehicle(int maxSpeed, String fuelType) {
//        this.maxSpeed = maxSpeed;
//        this.fuelType = fuelType;
//    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

