package smartvehicledashboard;

class ElectricCar implements VehicleDashboard {
    public void displaySpeed(int speed) {
        System.out.println("Speed: " + speed + " km/h");
    }
}