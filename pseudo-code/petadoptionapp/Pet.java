package petadoptionapp;


class Pet {
String name;
int age;

//Constructor
public Pet(String name, int age) {
 this.name = name;
 this.age = age;
}

//Method to display pet details
public void showDetails() {
 System.out.println("Pet Name: " + name + ", Age: " + age);
}
}

