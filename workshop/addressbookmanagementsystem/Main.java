package addressbookmanagementsystem;

public class Main {
    public static void main(String[] args) {
        AddressBook<Person> addressBook = new AddressBook<>();

        try {
            // Load contacts from CSV file
        	addressBook.loadFromCSV("C:\\Users\\HP\\eclipse-workspace\\BridgeLabz-SIPP-Training\\workshop\\addressbookmanagementsystem\\contacts.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("All Contacts:");
        addressBook.displayContacts();

        // Example: Search by phone
        System.out.println("\nSearch by Phone (9876543210): " +
                addressBook.searchByPhone("9876543210").orElse(null));

        // Example: Contacts with same address
        System.out.println("\nContacts in Delhi: " +
                addressBook.contactsWithSameAddress("Delhi"));

        // Example: Sorted by Name
        System.out.println("\nSorted by Name: " +
                addressBook.sortByName());
    }
}
