package LibraryBookFilter;

//LibraryBookFilter.java
import java.util.*;
import java.util.stream.*;

public class LibraryBookFilter {
 public static void main(String[] args) {
     List<Book> books = Arrays.asList(
             new Book("Java Basics", 2012, 4.6),
             new Book("Advanced Java", 2018, 4.8),
             new Book("Python Intro", 2016, 4.2),
             new Book("AI with ML", 2020, 4.9)
     );

     books.stream()
             .filter(b -> b.year > 2015 && b.rating > 4.5)
             .forEach(b -> System.out.println(b.title + " (" + b.year + ") Rating: " + b.rating));
 }
}
