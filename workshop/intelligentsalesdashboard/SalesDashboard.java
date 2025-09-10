package intelligentsalesdashboard;
	import java.util.*;
	import java.util.stream.*;

	public class SalesDashboard {

	    public static void main(String[] args) {
	        // Sample Items
	        Item i1 = new Item("Smartphone", "Electronics", 699);
	        Item i2 = new Item("Blender", "Home Appliances", 120);
	        Item i3 = new Item("Yoga Mat", "Fitness", 40);
	        Item i4 = new Item("Laptop", "Electronics", 999);
	        Item i5 = new Item("Toaster", "Home Appliances", 35);
	        Item i6 = new Item("Dumbbells", "Fitness", 60);
	        Item i7 = new Item("Smartwatch", "Electronics", 250);
	        Item i8 = new Item("Kettle", "Home Appliances", 45);
	        Item i9 = new Item("Resistance Band", "Fitness", 25);
	        Item i10 = new Item("Earbuds", "Electronics", 80);
	        Item i11 = new Item("Fan", "Home Appliances", 70);
	        Item i12 = new Item("Jump Rope", "Fitness", 15);

	        // Sample Customers
	        Map<String, List<Item>> store1Customers = Map.of(
	            "Alice", List.of(i1, i2, i3, i4),
	            "Bob", List.of(i5, i6, i7),
	            "Charlie", List.of(i8, i9)
	        );

	        Map<String, List<Item>> store2Customers = Map.of(
	            "Dave", List.of(i10, i11, i12),
	            "Eve", List.of(i1, i3, i5, i7),
	            "Frank", List.of(i2, i4, i6)
	        );

	        // Stores
	        Store store1 = new Store("Store A", store1Customers);
	        Store store2 = new Store("Store B", store2Customers);

	        // Cities
	        City city1 = new City("Delhi", List.of(store1));
	        City city2 = new City("Mumbai", List.of(store2));

	        List<City> cityList = List.of(city1, city2);

	        // 🔄 Stream Pipeline
	        Map<String, List<Item>> categoryToItems = cityList.stream()
	            .flatMap(city -> city.getStores().stream())
	            .flatMap(store -> store.getCustomerToPurchases().entrySet().stream())
	            .filter(entry -> entry.getValue().size() >= 3)
	            .map(Map.Entry::getValue)
	            .flatMap(List::stream)
	            .distinct()
	            .sorted(Comparator.comparingDouble(Item::getPrice).reversed())
	            .peek(item -> System.out.println("Logging: " + item.getName() + " - $" + item.getPrice()))
	            .skip(2)
	            .limit(10)
	            .collect(Collectors.groupingBy(Item::getCategory));

	        // 📊 Insights
	        long electronicsCount = categoryToItems.getOrDefault("Electronics", List.of()).size();
	        boolean anyExpensive = categoryToItems.values().stream()
	            .flatMap(List::stream)
	            .anyMatch(item -> item.getPrice() > 500);
	        double totalValue = categoryToItems.values().stream()
	            .flatMap(List::stream)
	            .mapToDouble(Item::getPrice)
	            .sum();

	        // 🖨️ Display Results
	        System.out.println("\n--- Grouped Items by Category ---");
	        categoryToItems.forEach((category, items) -> {
	            System.out.println(category + ": " + items);
	        });

	        System.out.println("\nElectronics Count: " + electronicsCount);
	        System.out.println("Any item over $500? " + anyExpensive);
	        System.out.println("Total Value of Selected Items: $" + totalValue);
	    }
	}