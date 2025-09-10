package smartvehicledashboard;

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard ev = new ElectricCar();

        petrol.displaySpeed(80);
        ev.displaySpeed(60);
        ev.displayBattery(90);
    }
}