package linkedlist.doublylinkedlist.librarymanagementsystem;

public class Main {
	    public static void main(String[] args) {
//	    	also reverse the linked list
	    	LibraryManagementSystem lib = new LibraryManagementSystem();

	        lib.addFirst("The Alchemist", "Paulo Coelho", "Fiction", 1, true);
	        lib.addLast("1984", "George Orwell", "Dystopian", 2, true);
	        lib.addAtPosition("Sapiens", "Yuval Noah Harari", "History", 3, true, 1);

	        System.out.println("Books in Forward Order:");
	        lib.displayForward();

	        System.out.println("\nBooks in Reverse Order:");
	        lib.displayReverse();

	        System.out.println("\nSearching for Book by Author 'Orwell':");
	        lib.search("Orwell");

	        System.out.println("\nUpdating availability of Book ID 1 to false:");
	        lib.updateAvailability(1, false);
	        lib.displayForward();

	        System.out.println("\nRemoving Book ID 2:");
	        lib.removeById(2);
	        lib.displayForward();

	        System.out.println("\nTotal Books: " + lib.countBooks());
	    }
	}
