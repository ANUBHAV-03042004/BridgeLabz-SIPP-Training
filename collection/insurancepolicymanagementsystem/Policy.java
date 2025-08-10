package insurancepolicymanagementsystem;

import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Policy implements Comparable<Policy> {
    String policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate,
                  String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " + expiryDate + " | "
                + coverageType + " | $" + premiumAmount;
    }
}
