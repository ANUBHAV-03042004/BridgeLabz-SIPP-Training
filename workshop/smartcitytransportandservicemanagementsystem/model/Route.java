package smartcitytransportandservicemanagementsystem.model;

public class Route {
    public final String id;
    public final Location from, to;
    public final double distanceKm;

    public Route(String id, Location from, Location to, double distanceKm) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.distanceKm = distanceKm;
    }

    @Override
    public String toString() {
        return id + " (" + from + "->" + to + ")";
    }
}
