package smartcitytransportandservicemanagementsystem.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Schedule {
    public final Route route;
    public final LocalDateTime departure;
    public final double baseFare;
    public final String serviceId;

    public Schedule(String serviceId, Route route, LocalDateTime departure, double baseFare) {
        this.serviceId = serviceId;
        this.route = route;
        this.departure = departure;
        this.baseFare = baseFare;
    }

    @Override
    public String toString() {
        return String.format("%s @%s fare:%.2f route:%s", serviceId,
            departure.format(DateTimeFormatter.ofPattern("HH:mm")), baseFare, route.id);
    }
}
