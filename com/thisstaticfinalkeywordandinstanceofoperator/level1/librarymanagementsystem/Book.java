package thisstaticfinalkeywordandinstanceofoperator.level1.librarymanagementsystem;

public class Book {
    // Static: Shared across all book instances
    private static String libraryName = "City Central Library";

    // Final: ISBN should not change after initialization
    private final String isbn;

    // Instance variables
    private String title;
    private String author;

    // Constructor using 'this' to avoid ambiguity
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;         // 'this' is optional here but good for clarity
        this.title = title;
        this.author = author;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Getters for instance fields
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Instance method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Static method to check and display details only if object is a Book
    public static void showIfBook(Object obj) {
        if (obj instanceof Book) {
            System.out.println("This object is a Book. Showing details:");
            Book book = (Book) obj;
            book.displayBookDetails();
        } else {
            System.out.println("This object is not a Book.");
        }
    }
}
