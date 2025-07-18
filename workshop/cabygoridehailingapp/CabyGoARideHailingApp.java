package cabygoridehailingapp;

public class CabyGoARideHailingApp {
	    public static void main(String[] args) {
	        Vehicle myVehicle = new Sedan("UP32AB1234", 4);
	        Driver myDriver = new Driver("Amit", "DL123456", 4.7);

	        IRideService ride = new RideService(myVehicle, myDriver);
	        ride.bookRide("Sector 18", "Airport", 12.5);
	        ride.endRide();
	    }
	}