package trafficsignalsimulation;

public class TrafficSignalSimulation {
public static void main(String[] args) {
 TrafficSignal signal = new TrafficSignal();
 for (int i = 0; i < 6; i++) {
     System.out.println("Current Light: " + signal.getCurrentLight());
     signal.changeLight();
 }
}
}

