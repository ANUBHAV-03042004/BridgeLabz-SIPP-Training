package filteringexpiringmemberships;
import java.time.*;
import java.util.*;
import java.util.stream.*;
import java.time.temporal.ChronoUnit;
public class GymMembers {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(40)),
            new Member("Charlie", LocalDate.now().plusDays(25))
        );

        members.stream()
               .filter(m -> ChronoUnit.DAYS.between(LocalDate.now(), m.expiryDate) <= 30)
               .forEach(m -> System.out.println("Membership expiring soon: " + m.name));
    }
}