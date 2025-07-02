package singleinheritance.librarymanagementsystem;
public class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

