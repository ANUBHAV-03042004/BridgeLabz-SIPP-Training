package inheritance.singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "ON", 24);
        thermostat.displayStatus();
    }
}
