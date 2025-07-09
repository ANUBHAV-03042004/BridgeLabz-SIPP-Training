package linkedlist.doublylinkedlist.librarymanagementsystem;

	class Book {
	    String title, author, genre;
	    int bookId;
	    boolean available;
	    Book prev, next;

	    public Book(String title, String author, String genre, int bookId, boolean available) {
	        this.title = title;
	        this.author = author;
	        this.genre = genre;
	        this.bookId = bookId;
	        this.available = available;
	    }
	}

	public class LibraryManagementSystem{
	    private Book head, tail;

	    public void addFirst(String title, String author, String genre, int id, boolean avail) {
	        Book newBook = new Book(title, author, genre, id, avail);
	        newBook.next = head;
	        if (head != null) head.prev = newBook;
	        else tail = newBook;
	        head = newBook;
	    }

	    public void addLast(String title, String author, String genre, int id, boolean avail) {
	        Book newBook = new Book(title, author, genre, id, avail);
	        if (head == null) {
	            head = tail = newBook;
	            return;
	        }
	        tail.next = newBook;
	        newBook.prev = tail;
	        tail = newBook;
	    }

	    public void addAtPosition(String title, String author, String genre, int id, boolean avail, int pos) {
	        if (pos == 0) {
	            addFirst(title, author, genre, id, avail);
	            return;
	        }
	        Book current = head;
	        for (int i = 0; i < pos - 1 && current != null; i++) current = current.next;
	        if (current == null || current.next == null) {
	            addLast(title, author, genre, id, avail);
	            return;
	        }
	        Book newBook = new Book(title, author, genre, id, avail);
	        newBook.next = current.next;
	        newBook.prev = current;
	        current.next.prev = newBook;
	        current.next = newBook;
	    }

	    public void removeById(int id) {
	        Book current = head;
	        while (current != null && current.bookId != id) current = current.next;
	        if (current == null) return;
	        if (current.prev != null) current.prev.next = current.next;
	        else head = current.next;
	        if (current.next != null) current.next.prev = current.prev;
	        else tail = current.prev;
	    }

	    public void updateAvailability(int id, boolean status) {
	        Book current = head;
	        while (current != null) {
	            if (current.bookId == id) {
	                current.available = status;
	                return;
	            }
	            current = current.next;
	        }
	    }

	    public void search(String keyword) {
	        Book current = head;
	        while (current != null) {
	            if (current.title.equalsIgnoreCase(keyword) || current.author.equalsIgnoreCase(keyword)) {
	                System.out.println("Found: " + current.title + " by " + current.author);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Book not found.");
	    }

	    public void displayForward() {
	        Book current = head;
	        while (current != null) {
	            System.out.println(current.title + " (" + current.bookId + ") - " + (current.available ? "Available" : "Not Available"));
	            current = current.next;
	        }
	    }

	    public void displayReverse() {
	        Book current = tail;
	        while (current != null) {
	            System.out.println(current.title + " (" + current.bookId + ") - " + (current.available ? "Available" : "Not Available"));
	            current = current.prev;
	        }
	    }

	    public int countBooks() {
	        int count = 0;
	        Book current = head;
	        while (current != null) {
	            count++;
	            current = current.next;
	        }
	        return count;
	    }
	}
