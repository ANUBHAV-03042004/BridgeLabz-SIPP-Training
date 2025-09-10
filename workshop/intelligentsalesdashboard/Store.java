package intelligentsalesdashboard;
import java.util.*;
class Store {
    private String storeName;
    private Map<String, List<Item>> customerToPurchases;

    // Constructors, Getters
    public Store(String storeName, Map<String, List<Item>> customerToPurchases) {
        this.storeName = storeName;
        this.customerToPurchases = customerToPurchases;
    }

    public Map<String, List<Item>> getCustomerToPurchases() {
        return customerToPurchases;
    }
}