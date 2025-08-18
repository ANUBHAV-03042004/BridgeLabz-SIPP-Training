package vehiclerentalsystem;


//Concrete Car class
class Car extends Vehicle {
public Car(String model, double rentPerDay) {
super(model, rentPerDay);
}

@Override
public void rent() {
System.out.println("Car " + model + " rented at " + rentPerDay + " per day.");
}

@Override
public void returnVehicle() {
System.out.println("Car " + model + " returned.");
}

@Override
public void displayDetails() {
System.out.println("🚗 Car Model: " + model + ", Rent: " + rentPerDay);
}
}
