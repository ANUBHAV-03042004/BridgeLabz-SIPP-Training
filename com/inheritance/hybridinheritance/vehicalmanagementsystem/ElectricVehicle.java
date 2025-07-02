package inheritance.hybridinheritance.vehicalmanagementsystem;

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}

