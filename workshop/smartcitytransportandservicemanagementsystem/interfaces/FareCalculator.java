package smartcitytransportandservicemanagementsystem.interfaces;

import smartcitytransportandservicemanagementsystem.model.Route;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(Route route, double baseFare, boolean peak);
}
