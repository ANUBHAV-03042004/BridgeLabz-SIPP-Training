package encapsulationpolymorphisminterfaceandabstractclass.librarymanagementsystem;

public abstract class LibraryItem {
    protected int itemId;
    protected String title;
    protected String author;
    protected String type;

    public LibraryItem(int itemId, String title, String author, String type) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Type: " + type);
    }
}
