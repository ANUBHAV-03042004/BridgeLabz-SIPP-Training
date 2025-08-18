package vehiclerentalsystem;


//Abstract Vehicle class
abstract class Vehicle implements Rentable {
protected String model;
protected double rentPerDay;

public Vehicle(String model, double rentPerDay) {
 this.model = model;
 this.rentPerDay = rentPerDay;
}

public abstract void displayDetails();
}
