package inheritance.singleinheritance.librarymanagementsystem;
public class Book {
    private String title;
    private int publicationYear;

    public void settitle(String title) {
    	this.title=title;
    }
    public String gettitle()
    {
    	return title;
    }
    public void setpublicationyear(int publicationYear)
    {
    	this.publicationYear = publicationYear;
    }
    public int getpublicationyear() {
    	return publicationYear;
    }
//    public Book(String title, int year) {
//        this.title = title;
//        this.publicationYear = year;
//    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

