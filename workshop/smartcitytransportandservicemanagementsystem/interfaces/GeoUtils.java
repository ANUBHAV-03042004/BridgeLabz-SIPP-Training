package smartcitytransportandservicemanagementsystem.interfaces;

import smartcitytransportandservicemanagementsystem.model.Location;

public interface GeoUtils {
    static double calculateDistanceKm(Location a, Location b) {
        double R = 6371;
        double dLat = Math.toRadians(b.lat - a.lat);
        double dLon = Math.toRadians(b.lon - a.lon);
        double lat1 = Math.toRadians(a.lat);
        double lat2 = Math.toRadians(b.lat);

        double sinDLat = Math.sin(dLat/2);
        double sinDLon = Math.sin(dLon/2);

        double hav = sinDLat*sinDLat + sinDLon*sinDLon * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(hav), Math.sqrt(1-hav));

        return R * c;
    }
}
