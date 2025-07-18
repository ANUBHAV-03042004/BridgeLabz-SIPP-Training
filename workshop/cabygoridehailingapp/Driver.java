package cabygoridehailingapp;

public class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public double getRating() {
        return rating;
    }

    public void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            this.rating = newRating;
        }
    }
}