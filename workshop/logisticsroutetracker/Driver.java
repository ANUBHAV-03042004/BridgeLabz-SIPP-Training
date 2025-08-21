package logisticsroutetracker;

import java.io.Serializable;

// ---------------- Driver ----------------
class Driver implements Serializable {
    private String driverId;
    private String name;
    private RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public RouteLinkedList<Checkpoint> getRouteHistory() { return routeHistory; }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);
        System.out.println("Critical Route Check: " + (routeHistory.consistencyCheck()
                ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}
