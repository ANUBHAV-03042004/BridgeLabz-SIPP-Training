package junit.listoperations;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
 ListManager manager = new ListManager();

 @Test
 void testAddElement() {
     List<Integer> list = new ArrayList<>();
     manager.addElement(list, 10);
     assertTrue(list.contains(10));
 }

 @Test
 void testRemoveElement() {
     List<Integer> list = new ArrayList<>();
     list.add(5);
     manager.removeElement(list, 5);
     assertFalse(list.contains(5));
 }

 @Test
 void testGetSize() {
     List<Integer> list = new ArrayList<>();
     manager.addElement(list, 1);
     manager.addElement(list, 2);
     assertEquals(2, manager.getSize(list));
 }
}
