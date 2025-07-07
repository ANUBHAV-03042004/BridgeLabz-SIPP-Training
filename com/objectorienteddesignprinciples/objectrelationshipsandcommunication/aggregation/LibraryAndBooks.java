package objectorienteddesignprinciples.objectrelationshipsandcommunication.aggregation;
import java.util.ArrayList;
	class Book {
	    private String title;
	    private String author;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    @Override
	    public String toString() {
	        return "Book: " + title + " by " + author;
	    }
	}

	class Library {
	    private String name;
	    private ArrayList<Book> books;

	    public Library(String name) {
	        this.name = name;
	        this.books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void removeBook(Book book) {
	        books.remove(book);
	    }

	    public void listBooks() {
	        System.out.println("Books in " + name + ":");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	}

	public class LibraryAndBooks {
	    public static void main(String[] args) {
	        // Create Book objects
	       Book book1 = new Book("1984", "George Orwell");
	       Book book2 = new Book("Pride and Prejudice", "Jane Austen");

	        // Create Library objects
	        Library library1 = new Library("City Library");
	        Library library2 = new Library("Town Library");

	        // Add books to libraries (demonstrating aggregation)
	        library1.addBook(book1);
	        library1.addBook(book2);
	        library2.addBook(book1); // Same book can exist in multiple libraries

	        // List books
	        library1.listBooks();
	        library2.listBooks();
	    }
	}