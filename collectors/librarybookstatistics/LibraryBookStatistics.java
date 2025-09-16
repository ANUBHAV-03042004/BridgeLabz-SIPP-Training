package librarybookstatistics;
import java.util.*;
import java.util.stream.*;

public class LibraryBookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book A", "Fiction", 300),
            new Book("Book B", "Fiction", 450),
            new Book("Book C", "Science", 500),
            new Book("Book D", "Science", 200),
            new Book("Book E", "History", 350)
        );

        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(Collectors.groupingBy(
                b -> b.genre,
                Collectors.summarizingInt(b -> b.pages)
            ));

        stats.forEach((genre, stat) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages: " + stat.getSum());
            System.out.println("  Avg Pages: " + stat.getAverage());
            System.out.println("  Max Pages: " + stat.getMax());
        });
    }
}
