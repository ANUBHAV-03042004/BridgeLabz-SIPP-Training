package dynamiconlinemarketplace;

class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    public void display() {
        System.out.println(name + " (" + category.getCategoryName() + ") - $" + price);
    }
}

