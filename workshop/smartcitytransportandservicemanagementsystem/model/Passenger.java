package smartcitytransportandservicemanagementsystem.model;

import java.time.LocalDateTime;

public class Passenger {
    public final String id;
    public final String name;
    public final Route route;
    public final LocalDateTime bookedAt;
    public final boolean peak;
    public final double paidFare;

    public Passenger(String id, String name, Route route, LocalDateTime bookedAt, boolean peak, double paidFare) {
        this.id = id;
        this.name = name;
        this.route = route;
        this.bookedAt = bookedAt;
        this.peak = peak;
        this.paidFare = paidFare;
    }
}
