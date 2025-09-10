package passwordstrengthvalidator;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && 
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[@#$%^&+=].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Pass@123")); // true
        System.out.println(SecurityUtils.isStrongPassword("weak"));     // false
    }
}
