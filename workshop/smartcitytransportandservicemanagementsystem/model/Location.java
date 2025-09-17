package smartcitytransportandservicemanagementsystem.model;

public class Location {
    public final double lat, lon;
    public final String name;

    public Location(String name, double lat, double lon) {
        this.name = name; 
        this.lat = lat; 
        this.lon = lon;
    }

    @Override
    public String toString() {
        return name;
    }
}
