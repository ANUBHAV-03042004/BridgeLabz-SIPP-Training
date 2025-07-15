package hashmapandlinkedlist.libraryorganizer;
import java.util.*;
public class Book extends Genre {
	class booklink{
String value;
booklink next;
   booklink(String value){
	   this.value=value;
	   this.next=null;
   }
	}
	Genre Genre = new Genre();
	HashMap<String,booklink>hmap=new HashMap<>();
	
	
	public void addBook(String genre, String value) {
	    linkedlist headgenre = Genre.head;
	    boolean genreExists = false;
	    while (headgenre != null) {
	        if (headgenre.data.equals(genre)) {
	            genreExists = true;
	            break;
	        }
	        headgenre = headgenre.next;
	    }

	    if (!genreExists) {
	        Genre.addgenre(genre);
	    }

	    booklink newNode = new booklink(value);
	    if (!hmap.containsKey(genre)) {
	        hmap.put(genre, newNode);
	    } else {
	        booklink temp = hmap.get(genre);
	        while (temp.next != null) {
	            if (temp.value.equals(value)) return;
	            temp = temp.next;
	        }
	        if (!temp.value.equals(value)) temp.next = newNode;
	    }
	}
	public void getbook(String genre) {
		if(hmap.containsKey(genre)) {
			booklink temp=hmap.get(genre);
			System.out.println("->"+genre);
			while(temp!=null) {
				System.out.println("~"+temp.value);
				temp=temp.next;
			}
		}
		else System.out.println("book not found");
	}
	}
