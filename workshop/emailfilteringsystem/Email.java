package emailfilteringsystem;

import java.util.*;
import java.util.regex.*;

// -------- Custom Exceptions --------
class InvalidEmailFormatException extends RuntimeException {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

class NoEmployeeFoundException extends Exception {
    public NoEmployeeFoundException(String message) {
        super(message);
    }
}

// -------- Email Class --------
class Email {
    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
        if (!isValid()) {
            throw new InvalidEmailFormatException("Invalid email format: " + emailAddress);
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (!isValid()) {
            throw new InvalidEmailFormatException("Invalid email format: " + emailAddress);
        }
        this.emailAddress = emailAddress;
    }

    public boolean isValid() {
        // Regex: username@company.com
        String regex = "^[a-z0-9._]+@company\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
