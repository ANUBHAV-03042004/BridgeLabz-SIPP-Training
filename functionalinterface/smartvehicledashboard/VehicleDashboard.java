package smartvehicledashboard;

interface VehicleDashboard {
    void displaySpeed(int speed);

    default void displayBattery(int battery) {
        System.out.println("Battery: " + battery + "%");
    }
}