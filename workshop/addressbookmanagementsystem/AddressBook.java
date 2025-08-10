package addressbookmanagementsystem;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBook<T extends Person> {
    private Map<String, T> contacts = new HashMap<>();

    public void addContact(String key, T person) {
        contacts.put(key, person);
    }

    public void removeContact(String key) {
        contacts.remove(key);
    }

    public Optional<T> searchByName(String name) {
        return contacts.values().stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public Optional<T> searchByPhone(String phone) {
        return contacts.values().stream()
                .filter(p -> p.getPhone().equals(phone))
                .findFirst();
    }

    public List<T> contactsWithSameAddress(String address) {
        return contacts.values().stream()
                .filter(p -> p.getAddress().equalsIgnoreCase(address))
                .collect(Collectors.toList());
    }

    public List<T> sortByName() {
        return contacts.values().stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
    }

    public List<T> sortByPhone() {
        return contacts.values().stream()
                .sorted(Comparator.comparing(Person::getPhone))
                .collect(Collectors.toList());
    }

    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(new ArrayList<>(contacts.values()));
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<T> loadedContacts = (List<T>) ois.readObject();
            contacts.clear();
            for (T contact : loadedContacts) {
                contacts.put(contact.getName(), contact);
            }
        }
    }

    // Load from CSV
    @SuppressWarnings("unchecked")
    public void loadFromCSV(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Remove quotes and split by comma
                line = line.replace("\"", "").trim();
                String[] parts = line.split("\\s*,\\s*");
                if (parts.length == 4) {
                    T person = (T) new Person(parts[0], parts[1], parts[2], parts[3]);
                    addContact(parts[0], person);
                }
            }
        }
    }

    public void displayContacts() {
        contacts.values().forEach(System.out::println);
    }
}
