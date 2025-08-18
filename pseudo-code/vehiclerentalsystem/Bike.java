package vehiclerentalsystem;


//Concrete Bike class
class Bike extends Vehicle {
public Bike(String model, double rentPerDay) {
super(model, rentPerDay);
}

@Override
public void rent() {
System.out.println("Bike " + model + " rented at " + rentPerDay + " per day.");
}

@Override
public void returnVehicle() {
System.out.println("Bike " + model + " returned.");
}

@Override
public void displayDetails() {
System.out.println("🏍️ Bike Model: " + model + ", Rent: " + rentPerDay);
}
}



