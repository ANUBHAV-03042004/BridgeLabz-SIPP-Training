package inheritance.animalheirarchy;

//Subclass: Cat
public class Cat extends Animal {

 public Cat(String name, int age) {
     super(name, age);
 }

 // Overriding makeSound()
 @Override
 public void makeSound() {
     System.out.println("Cat says: Meow!");
 }
}
