package insurancepolicymanagementsystemusingmapandtreemap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Policy {
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
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " + expiryDate +
                " | " + coverageType + " | $" + premiumAmount;
    }
}
