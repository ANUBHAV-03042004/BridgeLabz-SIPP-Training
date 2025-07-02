package inheritance.hybridinheritance.vehicalmanagementsystem;

public class Main {
	// Driver class for Vehicle System
	    public static void main(String[] args) {
	        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250);
	        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

	        ev.displayInfo();
	        ev.charge();

	        pv.displayInfo();
	        pv.refuel();
	    }
	}
