package thisstaticfinalkeywordandinstanceofoperator.level1.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("ISBN001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("ISBN002", "1984", "George Orwell");

        // Displaying shared library name
        Book.displayLibraryName();

        System.out.println("\n--- Book 1 Details ---");
        Book.showIfBook(book1); // Valid Book object

        System.out.println("\n--- Book 2 Details ---");
        Book.showIfBook(book2); // Valid Book object

        System.out.println("\n--- Invalid Object Check ---");
        Book.showIfBook("NotABookObject"); // Invalid object, handled by instanceof
    }
}
