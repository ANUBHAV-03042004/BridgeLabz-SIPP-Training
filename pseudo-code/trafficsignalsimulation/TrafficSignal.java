package trafficsignalsimulation;


//Traffic signal class
class TrafficSignal {
private TrafficLight current;

public TrafficSignal() {
   this.current = TrafficLight.RED; // Initial state
}

// Switch lights in order
public void changeLight() {
   switch (current) {
       case RED -> current = TrafficLight.GREEN;
       case GREEN -> current = TrafficLight.YELLOW;
       case YELLOW -> current = TrafficLight.RED;
   }
}

public TrafficLight getCurrentLight() {
   return current;
}
}
