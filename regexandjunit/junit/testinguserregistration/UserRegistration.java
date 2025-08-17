package junit.testinguserregistration;


public class UserRegistration {

 public static boolean registerUser(String username, String email, String password) {
     if (username == null || username.isEmpty())
         throw new IllegalArgumentException("Username cannot be empty");

     if (email == null || !email.contains("@"))
         throw new IllegalArgumentException("Invalid email");

     if (password == null || password.length() < 6)
         throw new IllegalArgumentException("Password too short");

     return true; // Registration successful
 }
}
