package librarymembershiptracker;
import java.time.LocalDate;
public class LibraryMembershipTracker {
 public static void main(String[] args) {
     Member m1 = new Member("Anubhav", 101, LocalDate.of(2024, 10, 1));
     Member m2 = new Member("Rahul", 102, LocalDate.of(2023, 5, 10));

     m1.displayInfo();
     System.out.println();
     m2.displayInfo();
 }
}
