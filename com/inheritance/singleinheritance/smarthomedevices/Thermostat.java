package inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super.setdeviceid(deviceId);
        super.setstatus(status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Thermostat Temperature: " + temperatureSetting + "°C");
    }
}
