package insuranceclaimanalysis;

import java.util.*;
import java.util.stream.*;
class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
