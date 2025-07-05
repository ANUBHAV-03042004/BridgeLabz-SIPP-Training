package encapsulationpolymorphisminterfaceandabstractclass.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book(101, "The Alchemist", "Paulo Coelho", false);
        items[1] = new Magazine(102, "Forbes", "Various", false);
        items[2] = new DVD(103, "Inception", "Christopher Nolan", true);

        for (LibraryItem item : items) {
            System.out.println("\n----------------------------");
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                System.out.println("Reserved Now: " + r.reserveItem());
                System.out.println("Available After Reserve: " + r.checkAvailability());
            }
        }
    }
}
