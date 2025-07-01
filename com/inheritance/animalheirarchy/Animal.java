package inheritance.animalheirarchy;

//Superclass: Animal
public class Animal {
 protected String name;
 protected int age;

 // Constructor
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to be overridden
 public void makeSound() {
     System.out.println("Animal makes a sound");
 }

 // Method to display common animal details
 public void displayInfo() {
     System.out.println("Name: " + name + ", Age: " + age);
 }
}
