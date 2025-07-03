package javaconstructors.accessmodifiers.booklibrarysystem;

public class Book {
    public String ISBN;                // Public
    protected String title;            // Protected
    private String author;             // Private

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter/setter for private variable
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

