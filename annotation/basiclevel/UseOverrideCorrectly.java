package basiclevel;

	class Animal {
	    public void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Dog barks 🐶");
	    }
	}

	public class UseOverrideCorrectly {
	    public static void main(String[] args) {
	        Animal a = new Dog();
	        a.makeSound();
	    }
	}
