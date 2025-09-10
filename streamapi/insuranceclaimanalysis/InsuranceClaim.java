package insuranceclaimanalysis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaim {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 20000),
            new Claim("Auto", 15000),
            new Claim("Health", 30000),
            new Claim("Home", 50000),
            new Claim("Auto", 25000)
        );

        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(c -> c.type, Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> 
            System.out.println("Claim Type: " + type + " | Avg Amount: " + avg));
    }
}
