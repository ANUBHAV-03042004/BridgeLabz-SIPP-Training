package javaconstructors.level1.person;

public class Person {
 String name;
 int age;

 // Parameterized constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Copy constructor
 public Person(Person other) {
     this.name = other.name;
     this.age = other.age;
 }

 public void display() {
     System.out.println("Name: " + name + ", Age: " + age);
 }

 public static void main(String[] args) {
     Person p1 = new Person("John", 30);
     Person p2 = new Person(p1); // cloning p1

     System.out.println("Original Person:");
     p1.display();

     System.out.println("Cloned Person:");
     p2.display();
 }
}
