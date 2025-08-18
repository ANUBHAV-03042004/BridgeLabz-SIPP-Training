package jobscheduler;

import java.util.PriorityQueue;

public class JobScheduler {
 public static void main(String[] args) {
     PriorityQueue<Job> pq = new PriorityQueue<>();
     pq.add(new Job("Job1", 3, 5));
     pq.add(new Job("Job2", 1, 2));
     pq.add(new Job("Job3", 2, 1));

     while (!pq.isEmpty()) {
         Job j = pq.poll();
         System.out.println("Executing " + j.name + " (Deadline: " + j.deadline + ", Time: " + j.processingTime + ")");
     }
 }
}
