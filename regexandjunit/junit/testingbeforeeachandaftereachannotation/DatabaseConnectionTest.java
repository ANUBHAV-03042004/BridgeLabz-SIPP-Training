package junit.testingbeforeeachandaftereachannotation;

//File: DatabaseConnectionTest.java
import org.junit.jupiter.api.*;

public class DatabaseConnectionTest {
 DatabaseConnection db;

 @BeforeEach
 void setup() {
     db = new DatabaseConnection();
     db.connect();
 }

 @AfterEach
 void teardown() {
     db.disconnect();
 }

 @Test
 void testConnection() {
     Assertions.assertNotNull(db);
 }
}
