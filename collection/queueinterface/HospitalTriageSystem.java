package queueinterface;
import java.util.*;
public class HospitalTriageSystem {
	    static class Patient {
	        String name;
	        int severity; // Higher number = higher priority

	        public Patient(String name, int severity) {
	            this.name = name;
	            this.severity = severity;
	        }
	    }

	    public static void main(String[] args) {
	        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
	            (p1, p2) -> Integer.compare(p2.severity, p1.severity) // Highest severity first
	        );

	        triageQueue.offer(new Patient("John", 3));
	        triageQueue.offer(new Patient("Alice", 5));
	        triageQueue.offer(new Patient("Bob", 2));

	        System.out.println("Treatment order:");
	        while (!triageQueue.isEmpty()) {
	            Patient p = triageQueue.poll();
	            System.out.println(p.name + " (Severity: " + p.severity + ")");
	        }
	    }
	}
