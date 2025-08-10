package insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicyManagement {
    private HashSet<Policy> hashSet = new HashSet<>();
    private LinkedHashSet<Policy> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Unique Policies:");
        hashSet.forEach(System.out::println);
    }

    public void displayExpiringSoon() {
        LocalDate now = LocalDate.now();
        System.out.println("\nPolicies expiring within 30 days:");
        for (Policy p : treeSet) {
            if (!p.expiryDate.isBefore(now) && !p.expiryDate.isAfter(now.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    public void displayByCoverage(String type) {
        System.out.println("\nPolicies with coverage type: " + type);
        hashSet.stream()
                .filter(p -> p.coverageType.equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    public void findDuplicates(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for (Policy p : policies) {
            if (!seen.add(p.policyNumber)) {
                System.out.println(p);
            }
        }
    }
}
