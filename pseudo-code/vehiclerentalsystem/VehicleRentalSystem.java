package vehiclerentalsystem;


//Main Function
public class VehicleRentalSystem {
 public static void main(String[] args) {
     Vehicle v1 = VehicleFactory.getVehicle("car", "Honda City", 1500);
     Vehicle v2 = VehicleFactory.getVehicle("bike", "Yamaha R15", 500);

     v1.displayDetails();
     v1.rent();
     v1.returnVehicle();

     v2.displayDetails();
     v2.rent();
     v2.returnVehicle();
 }
}
