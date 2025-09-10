package smartdevicecontrolinterface;

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}