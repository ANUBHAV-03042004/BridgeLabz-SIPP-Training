package petadoptionapp;

public class PetAdoptionApp {
 public static void main(String[] args) {
     Dog d = new Dog("Bruno", 3, "Labrador");
     Cat c = new Cat("Kitty", 2, "White");
     Bird b = new Bird("Mithu", 1, true);

     d.showDetails();
     System.out.println();
     c.showDetails();
     System.out.println();
     b.showDetails();
 }
}
