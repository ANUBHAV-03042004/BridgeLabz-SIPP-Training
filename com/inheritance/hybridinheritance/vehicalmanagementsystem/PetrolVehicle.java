package inheritance.hybridinheritance.vehicalmanagementsystem;

//Subclass PetrolVehicle implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
 public PetrolVehicle(String model, int maxSpeed) {
     super(model, maxSpeed);
 }

 @Override
 public void refuel() {
     System.out.println("Petrol vehicle is refueling.");
 }
}