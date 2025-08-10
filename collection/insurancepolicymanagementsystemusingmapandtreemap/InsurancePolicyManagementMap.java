package insurancepolicymanagementsystemusingmapandtreemap;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class InsurancePolicyManagementMap {
    Map<String, Policy> hashMap = new HashMap<>();
    Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);
        treeMap.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    public Policy getPolicyByNumber(String number) {
        return hashMap.get(number);
    }

    public void listExpiringWithin30Days() {
        LocalDate now = LocalDate.now();
        System.out.println("Policies expiring within 30 days:");
        treeMap.subMap(now, now.plusDays(30)).values()
                .forEach(list -> list.forEach(System.out::println));
    }

    public void listByPolicyHolder(String holder) {
        System.out.println("Policies for: " + holder);
        hashMap.values().stream()
                .filter(p -> p.policyHolderName.equalsIgnoreCase(holder))
                .forEach(System.out::println);
    }

    public void removeExpired() {
        LocalDate now = LocalDate.now();
        List<String> toRemove = new ArrayList<>();
        for (Policy p : hashMap.values()) {
            if (p.expiryDate.isBefore(now)) {
                toRemove.add(p.policyNumber);
                treeMap.get(p.expiryDate).remove(p);
            }
        }
        toRemove.forEach(hashMap::remove);
        toRemove.forEach(linkedHashMap::remove);
        System.out.println("Expired policies removed: " + toRemove.size());
    }
}