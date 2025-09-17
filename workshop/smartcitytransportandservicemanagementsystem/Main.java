package smartcitytransportandservicemanagementsystem;


import smartcitytransportandservicemanagementsystem.model.*;
import smartcitytransportandservicemanagementsystem.interfaces.*;
import smartcitytransportandservicemanagementsystem.service.*;
import smartcitytransportandservicemanagementsystem.util.Reports;

import java.time.*;
import java.util.*;
import static java.util.stream.Collectors.*;

public class Main {
    static FareCalculator defaultFareCalc = (route, baseFare, peak) ->
        baseFare * (peak ? 1.25 : 1.0) + 0.5 * route.distanceKm;

    public static void main(String[] args) {
        Location central = new Location("Central", 28.6139, 77.2090);
        Location uptown  = new Location("Uptown", 28.7, 77.2);

        Route r1 = new Route("R-101", central, uptown, GeoUtils.calculateDistanceKm(central, uptown));

        BusService bus = new BusService("BUS-1");
        bus.addSchedule(new Schedule(bus.getServiceId(), r1, LocalDateTime.now().plusMinutes(20), 25.0));

        TaxiService taxi = new TaxiService("TAXI-1");
        taxi.addSchedule(new Schedule(taxi.getServiceId(), r1, LocalDateTime.now().plusMinutes(5), 100.0));

        List<TransportService> services = Arrays.asList(bus, taxi);

        // Show services
        services.forEach(TransportService::printServiceDetails);

        // Simulate passengers
        List<Passenger> passengers = Arrays.asList(
            new Passenger("P1", "Alice", r1, LocalDateTime.now(), true, defaultFareCalc.calculateFare(r1, 25, true))
        );

        Reports.revenueAndUsageReports(passengers);
    }
}
