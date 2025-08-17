package junit.testingtemperatureconverter;

//TemperatureConverterTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

 @Test
 void testCelsiusToFahrenheit() {
     assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0));
     assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
 }

 @Test
 void testFahrenheitToCelsius() {
     assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32));
     assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212));
 }
}
