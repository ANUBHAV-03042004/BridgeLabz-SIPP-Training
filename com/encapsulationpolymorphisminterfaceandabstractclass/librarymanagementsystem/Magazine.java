package encapsulationpolymorphisminterfaceandabstractclass.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;

    public Magazine(int itemId, String title, String author, boolean reserved) {
        super(itemId, title, author, "Magazine");
        this.reserved = reserved;
    }

    @Override
    public int getLoanDuration() {
        return 7;
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
