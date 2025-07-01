package inheritance.animalheirarchy;

public class Main {
	    public static void main(String[] args) {
	        // Polymorphic references
	        Animal dog = new Dog("Bruno", 4);
	        Animal cat = new Cat("Whiskers", 2);
	        Animal bird = new Bird("Tweety", 1);

	        // Display info and sounds
	        dog.displayInfo();
	        dog.makeSound();

	        cat.displayInfo();
	        cat.makeSound();

	        bird.displayInfo();
	        bird.makeSound();
	    }
	}
