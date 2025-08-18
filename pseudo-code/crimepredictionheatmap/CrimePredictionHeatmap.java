package crimepredictionheatmap;

import java.util.*;


public class CrimePredictionHeatmap {

 // Graph represented as adjacency list (zone -> neighbors)
 private final Map<String, List<String>> graph = new HashMap<>();

 // Individual zone risk scores (e.g., from historical data)
 private final Map<String, Integer> riskScore = new HashMap<>();

 // Track visited nodes during DFS
 private final Set<String> visited = new HashSet<>();

 public void addZone(String zone, int risk) {
     graph.putIfAbsent(zone, new ArrayList<>());
     riskScore.put(zone, risk);
 }

 public void addEdge(String a, String b) {
     graph.get(a).add(b);
     graph.get(b).add(a);
 }

 /**
  * Finds connected components using DFS and computes the total risk per component.
  * Returns a list of components (each component is a list of zone names).
  */
 public List<List<String>> connectedComponents() {
     visited.clear();
     List<List<String>> components = new ArrayList<>();
     for (String zone : graph.keySet()) {
         if (!visited.contains(zone)) {
             List<String> comp = new ArrayList<>();
             dfs(zone, comp);
             components.add(comp);
         }
     }
     return components;
 }

 private void dfs(String node, List<String> comp) {
     visited.add(node);
     comp.add(node);
     for (String nb : graph.get(node)) {
         if (!visited.contains(nb)) {
             dfs(nb, comp);
         }
     }
 }

 /** Sum risk for a set of zones. */
 private int totalRisk(List<String> component) {
     int sum = 0;
     for (String z : component) sum += riskScore.getOrDefault(z, 0);
     return sum;
 }

 /** Flag components whose risk >= threshold. */
 public List<ComponentRisk> highRiskComponents(int threshold) {
     List<ComponentRisk> out = new ArrayList<>();
     for (List<String> comp : connectedComponents()) {
         int risk = totalRisk(comp);
         if (risk >= threshold) {
             out.add(new ComponentRisk(comp, risk));
         }
     }
     // Sort by risk descending for better reporting
     out.sort((a, b) -> Integer.compare(b.totalRisk, a.totalRisk));
     return out;
 }

 /** Helper record-like class (Java 8 compatible) */
 public static class ComponentRisk {
     public final List<String> zones;
     public final int totalRisk;

     public ComponentRisk(List<String> zones, int totalRisk) {
         this.zones = zones;
         this.totalRisk = totalRisk;
     }
 }

 /** Demo */
 public static void main(String[] args) {
     CrimePredictionHeatmap heatmap = new CrimePredictionHeatmap();

     // --- Build sample zones with risk scores (dummy data) ---
     heatmap.addZone("A1", 7);
     heatmap.addZone("A2", 3);
     heatmap.addZone("A3", 9);

     heatmap.addZone("B1", 2);
     heatmap.addZone("B2", 5);

     heatmap.addZone("C1", 10);
     heatmap.addZone("C2", 1);
     heatmap.addZone("C3", 4);

     // --- Adjacencies (undirected) ---
     // Component #1: A1-A2-A3
     heatmap.addEdge("A1", "A2");
     heatmap.addEdge("A2", "A3");

     // Component #2: B1-B2
     heatmap.addEdge("B1", "B2");

     // Component #3: C1-C2-C3
     heatmap.addEdge("C1", "C2");
     heatmap.addEdge("C2", "C3");

     // Choose a threshold to flag high-risk connected areas
     int threshold = 12;

     System.out.println("=== Connected Components & Risks ===");
     List<List<String>> comps = heatmap.connectedComponents();
     for (List<String> comp : comps) {
         int risk = heatmap.totalRisk(comp);
         System.out.println("Component: " + comp + " | Total Risk = " + risk);
     }

     System.out.println("\n=== HIGH-RISK Components (>= " + threshold + ") ===");
     List<ComponentRisk> flagged = heatmap.highRiskComponents(threshold);
     if (flagged.isEmpty()) {
         System.out.println("None");
     } else {
         for (ComponentRisk cr : flagged) {
             System.out.println("Zones: " + cr.zones + " | Total Risk: " + cr.totalRisk);
         }
     }

     // Optional: Identify the single most risky connected area
     if (!flagged.isEmpty()) {
         ComponentRisk top = flagged.get(0);
         System.out.println("\n🔥 Highest-Risk Area: " + top.zones + " (Score: " + top.totalRisk + ")");
     }
 }
}
