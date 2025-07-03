package accessmodifiers.booklibrarysystem;
//Subclass
class EBook extends Book {
 public EBook(String ISBN, String title, String author) {
     super(ISBN, title, author);
 }

 public void showDetails() {
     System.out.println("ISBN: " + ISBN);             // Public
     System.out.println("Title: " + title);           // Protected
     System.out.println("Author: " + getAuthor());    // Private via getter
 }
}