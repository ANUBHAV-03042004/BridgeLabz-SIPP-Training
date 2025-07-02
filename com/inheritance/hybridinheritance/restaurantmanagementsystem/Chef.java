package inheritance.hybridinheritance.restaurantmanagementsystem;

// Subclass Chef implementing Worker
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef prepares food.");
    }
}
