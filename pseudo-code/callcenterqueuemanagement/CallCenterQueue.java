package callcenterqueuemanagement;

//Call Center Queue Management using Queue
import java.util.LinkedList;
import java.util.Queue;

public class CallCenterQueue {
 public static void main(String[] args) {
     Queue<Customer> normalQueue = new LinkedList<>();
     Queue<Customer> emergencyQueue = new LinkedList<>();

     // Adding customers
     normalQueue.add(new Customer("Ravi", false));
     normalQueue.add(new Customer("Amit", false));
     emergencyQueue.add(new Customer("Priya", true));

     // Serving customers
     while (!emergencyQueue.isEmpty() || !normalQueue.isEmpty()) {
         if (!emergencyQueue.isEmpty()) {
             Customer c = emergencyQueue.poll();
             System.out.println("Serving Emergency: " + c.name);
         } else {
             Customer c = normalQueue.poll();
             System.out.println("Serving Normal: " + c.name);
         }
     }
 }
}
