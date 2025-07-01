package inheritance.animalheirarchy;

//Subclass: Bird
public class Bird extends Animal {

 public Bird(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound()
 @Override
 public void makeSound() {
     System.out.println("Bird says: Tweet!");
 }
}
