package librarymembershiptracker;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Member {
String name;
int id;
LocalDate membershipDate;

public Member(String name, int id, LocalDate membershipDate) {
   this.name = name;
   this.id = id;
   this.membershipDate = membershipDate;
}

// Check if membership is still valid (validity = 1 year)
public boolean isMembershipValid() {
   LocalDate today = LocalDate.now();
   long months = ChronoUnit.MONTHS.between(membershipDate, today);
   return months < 12;
}

public void displayInfo() {
   System.out.println("Member ID: " + id + ", Name: " + name);
   System.out.println("Membership Valid: " + (isMembershipValid() ? "Yes" : "No"));
}
}