package VotingSystem;
import java.util.*;
class VotingSystem {
    Map<String, Integer> hashMap = new HashMap<>();
    Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

    public void vote(String candidate) {
        hashMap.put(candidate, hashMap.getOrDefault(candidate, 0) + 1);
        linkedHashMap.put(candidate, linkedHashMap.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        System.out.println("Votes (Insertion Order): " + linkedHashMap);
        TreeMap<String, Integer> sorted = new TreeMap<>(hashMap);
        System.out.println("Votes (Sorted by Candidate): " + sorted);
    }
    public static void main(String[] args) {
    	   VotingSystem vs = new VotingSystem();
           vs.vote("Alice");
           vs.vote("Bob");
           vs.vote("Alice");

           System.out.println("\n--- Voting System ---");
           vs.displayResults();

    }
}
