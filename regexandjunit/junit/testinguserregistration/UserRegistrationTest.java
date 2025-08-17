package junit.testinguserregistration;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

 @Test
 void testValidRegistration() {
     assertTrue(UserRegistration.registerUser("JohnDoe", "john@example.com", "secret123"));
 }

 @Test
 void testEmptyUsername() {
     assertThrows(IllegalArgumentException.class, 
         () -> UserRegistration.registerUser("", "john@example.com", "secret123"));
 }

 @Test
 void testInvalidEmail() {
     assertThrows(IllegalArgumentException.class, 
         () -> UserRegistration.registerUser("JohnDoe", "johnexample.com", "secret123"));
 }

 @Test
 void testWeakPassword() {
     assertThrows(IllegalArgumentException.class, 
         () -> UserRegistration.registerUser("JohnDoe", "john@example.com", "123"));
 }
}
