package smarthomelightingsystem;


public class SmartHomeLightingSystem {
 public static void main(String[] args) {
     // Lambda for different triggers
     LightAction motionTrigger = () -> System.out.println("Lights ON: Motion detected!");
     LightAction timeTrigger = () -> System.out.println("Lights DIMMED: Evening mode activated.");
     LightAction voiceTrigger = () -> System.out.println("Lights OFF: Voice command received.");

     // Executing behaviors dynamically
     motionTrigger.activate();
     timeTrigger.activate();
     voiceTrigger.activate();
 }
}

