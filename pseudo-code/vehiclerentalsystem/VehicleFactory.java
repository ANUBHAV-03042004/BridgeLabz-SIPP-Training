package vehiclerentalsystem;


//Factory Class
class VehicleFactory {
public static Vehicle getVehicle(String type, String model, double rentPerDay) {
if (type.equalsIgnoreCase("car")) return new Car(model, rentPerDay);
if (type.equalsIgnoreCase("bike")) return new Bike(model, rentPerDay);
throw new IllegalArgumentException("Unknown vehicle type!");
}
}
