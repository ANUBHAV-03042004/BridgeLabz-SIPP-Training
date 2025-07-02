package javaconstructorsinstancevsclassvariablesaccessmodifiers.level1.book;

public class Book {
 // Attributes of the Book class
 String title;
 String author;
 double price;

 // Default Constructor
 public Book() {
     title = "Unknown Title";
     author = "Unknown Author";
     price = 0.0;
 }

 // Parameterized Constructor
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     this.price = price;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title  : " + title);
     System.out.println("Author : " + author);
     System.out.println("Price  : ₹" + price);
 }

 // Main method to test both constructors
 public static void main(String[] args) {
     // Using default constructor
     Book defaultBook = new Book();
     System.out.println("Default Book:");
     defaultBook.displayDetails();

     System.out.println();

     // Using parameterized constructor
     Book customBook = new Book("The Alchemist", "Paulo Coelho", 499.99);
     System.out.println("Custom Book:");
     customBook.displayDetails();
 }
}
