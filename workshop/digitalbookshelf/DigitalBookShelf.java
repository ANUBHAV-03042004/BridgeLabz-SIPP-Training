package digitalbookshelf;
import java.util.*;
public class DigitalBookShelf
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String>books=new ArrayList<>();
		ArrayList<String>searchedbooks=new ArrayList<>();
		System.out.println("enter the number of books to be entered :");
		int t=sc.nextInt();
		while(t-->0)
		{
		    System.out.println("Enter the title :");
	    String title=sc.next();
	    System.out.println("Enter the Author :");
	        String author=sc.next();
		    addBooks(title,author,books);
		}
sortBooksAlphabetically(books);
System.out.println("Enter the Author name to get the book searched :");
sc.nextLine();
String authorSearch=sc.nextLine();
searchByAuthor(authorSearch,books,searchedbooks);
DisplaySearchedBooks(searchedbooks);
sc.close();
	}
	public static List addBooks(String title,String author,ArrayList<String>books){
	    books.add(title +"-"+author);
	    return books;
	}
	public static List sortBooksAlphabetically(ArrayList<String>books){
	    for(int i=0;i<books.size();i++)
	    {
	        String a=books.get(i);
	        for(int j=i+1;j<books.size();j++)
	        {
	            String b=books.get(j);
	            if(a.compareTo(b)>0)
	            {
	                books.set(j,a);
	                books.set(i,b);
	            }
	        }
	    }
	    return books;
	}
	public static void searchByAuthor(String author_name,ArrayList<String>books,ArrayList<String>searchedbooks)
	{
	    boolean bookfound=false;
	    for(int i=0;i<books.size();i++)
	    {
	        if(books.get(i).contains(author_name))
	        {
	            searchedbooks.add(splitbooks(books.get(i)));
	            bookfound=true;
	        }
	    }
	    if(!bookfound) searchedbooks.add("Book Not found");
	}
	public static String splitbooks(String books){
	    String []b=books.split("-");
	    return b[0];
	}
	public static void DisplaySearchedBooks(ArrayList<String>searchedbooks){
	    String ans[]=new String[searchedbooks.size()];
	    		for(int i=0;i<searchedbooks.size();i++){
		   ans[i] = searchedbooks.get(i);
		}
				for(int i=0;i<ans.length;i++){
		    System.out.println(ans[i]);
		}
	}
}