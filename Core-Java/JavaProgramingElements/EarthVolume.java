public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        // Volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // 1 cubic kilometer = 0.239006 cubic miles
        double volumeMiles3 = volumeKm3 * 0.239006;

        System.out.printf("The volume of Earth in cubic kilometers is %.2f km^3%n", volumeKm3);
        System.out.printf("The volume of Earth in cubic miles is %.2f mi^3%n", volumeMiles3);


    }
}
