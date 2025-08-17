package junit.passwordstrengthvalidator;

//PasswordValidatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

 @Test
 void testValidPassword() {
     assertTrue(PasswordValidator.isValid("StrongPass1"));
 }

 @Test
 void testTooShortPassword() {
     assertFalse(PasswordValidator.isValid("Ab1"));
 }

 @Test
 void testNoUppercase() {
     assertFalse(PasswordValidator.isValid("weakpass1"));
 }

 @Test
 void testNoDigit() {
     assertFalse(PasswordValidator.isValid("Weakpass"));
 }
}
