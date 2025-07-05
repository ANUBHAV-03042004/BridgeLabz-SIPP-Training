package encapsulationpolymorphisminterfaceandabstractclass.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {
    private boolean reserved;

    public DVD(int itemId, String title, String author, boolean reserved) {
        super(itemId, title, author, "DVD");
        this.reserved = reserved;
    }

    @Override
    public int getLoanDuration() {
        return 3;
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
