package inheritance.animalheirarchy;

//Subclass: Dog
public class Dog extends Animal {

 public Dog(String name, int age) {
     super(name, age); // Call to Animal constructor
 }

 // Overriding makeSound()
 @Override
 public void makeSound() {
     System.out.println("Dog says: Woof Woof!");
 }
}
