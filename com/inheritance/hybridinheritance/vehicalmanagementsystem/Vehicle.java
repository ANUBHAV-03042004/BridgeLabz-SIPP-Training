package inheritance.hybridinheritance.vehicalmanagementsystem;

//Superclass
class Vehicle {
 private String model;
 private int maxSpeed;

 public Vehicle(String model, int maxSpeed) {
     this.model = model;
     this.maxSpeed = maxSpeed;
 }

 public void displayInfo() {
     System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
 }
}
