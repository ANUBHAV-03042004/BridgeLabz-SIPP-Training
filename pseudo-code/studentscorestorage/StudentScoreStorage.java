package studentscorestorage;
import java.util.*;

public class StudentScoreStorage {
 public static void main(String[] args) {
     Map<String, Integer> scores = new HashMap<>();
     scores.put("Rohit", 85);
     scores.put("Anubhav", 95);
     scores.put("Priya", 78);
     scores.put("Rahul", 88);

     // Find highest scorer
     scores.entrySet().stream()
           .max(Map.Entry.comparingByValue())
           .ifPresent(e -> System.out.println("Topper: " + e.getKey() + " with " + e.getValue() + " marks"));
 }
}
