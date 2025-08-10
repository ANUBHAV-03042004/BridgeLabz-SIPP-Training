package dynamiconlinemarketplace;

public class Main {
	  public static void main(String[] args) {
	        Product<BookCategory> book = new Product<>("Java Programming", 50, new BookCategory());
	        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 30, new ClothingCategory());

	        Marketplace.applyDiscount(book, 10);
	        Marketplace.applyDiscount(shirt, 20);

	        book.display();
	        shirt.display();
	    }
	}
