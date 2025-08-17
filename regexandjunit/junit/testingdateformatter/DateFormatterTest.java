package junit.testingdateformatter;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

 @Test
 void testValidDate() throws ParseException {
     assertEquals("31-12-2023", DateFormatter.formatDate("2023-12-31"));
 }

 @Test
 void testInvalidDateFormat() {
     assertThrows(ParseException.class, () -> DateFormatter.formatDate("12/31/2023"));
 }
}
