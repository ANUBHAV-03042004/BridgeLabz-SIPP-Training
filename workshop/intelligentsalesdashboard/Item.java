package intelligentsalesdashboard;

class Item {
    private String name;
    private String category;
    private double price;

    // Constructors, Getters, Setters
    public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
//    @Deprecated
    public String toString() {
        return name + " ($" + price + ") [" + category + "]";
    }
}