package encapsulationpolymorphisminterfaceandabstractclass.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(int itemId, String title, String author, boolean reserved) {
        super(itemId, title, author, "Book");
        this.reserved = reserved;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public boolean reserveItem() {
        reserved = true;
        return reserved;
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
