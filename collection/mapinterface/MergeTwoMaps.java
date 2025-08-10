package mapinterface;
import java.util.*;
public class MergeTwoMaps {
    public static Map<String, Integer> mergeMaps(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> merged = new HashMap<>(m1);
        for (Map.Entry<String, Integer> entry : m2.entrySet()) {
            merged.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return merged;
    }
    public static void main(String[] args) {
        Map<String, Integer> m3 = Map.of("A", 1, "B", 2);
        Map<String, Integer> m4 = Map.of("B", 3, "C", 4);
        System.out.println("Merged Map: " + mergeMaps(m3, m4));

    }
}
