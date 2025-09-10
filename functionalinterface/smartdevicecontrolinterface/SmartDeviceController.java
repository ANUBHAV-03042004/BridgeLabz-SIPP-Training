package smartdevicecontrolinterface;

public class SmartDeviceController {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new TV();
        
        light.turnOn();
        ac.turnOn();
        tv.turnOff();
    }
}