package temperaturealertsystem;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> highTemp = t -> t > 40.0;

        double currentTemp = 42.5;
        if (highTemp.test(currentTemp)) {
            System.out.println("ALERT: High Temperature!");
        } else {
            System.out.println("Temperature is Normal.");
        }
    }
}
