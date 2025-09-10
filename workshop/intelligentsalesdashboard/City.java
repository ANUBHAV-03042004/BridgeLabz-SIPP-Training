package intelligentsalesdashboard;
import java.util.*;
class City {
    private String cityName;
    private List<Store> stores;

    // Constructors, Getters
    public City(String cityName, List<Store> stores) {
        this.cityName = cityName;
        this.stores = stores;
    }

    public List<Store> getStores() {
        return stores;
    }
}