package javaconstructors.level1.librarybooksystem;

public class LibraryBookSystem {
 String title;
 String author;
 double price;
 boolean available;

 // Constructor
 public LibraryBookSystem(String title, String author, double price, boolean available) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.available = available;
 }

 // Method to borrow a book
 public void borrowBook() {
     if (available) {
         available = false;
         System.out.println(title + " has been borrowed.");
     } else {
         System.out.println(title + " is currently not available.");
     }
 }

 public void displayInfo() {
     System.out.println("Book: " + title + " by " + author);
     System.out.println("Price: ₹" + price + ", Available: " + (available ? "Yes" : "No"));
 }

 public static void main(String[] args) {
	 LibraryBookSystem book = new LibraryBookSystem("1984", "George Orwell", 399.0, true);
     book.displayInfo();
     book.borrowBook();
     book.borrowBook(); // Trying to borrow again
 }
}
