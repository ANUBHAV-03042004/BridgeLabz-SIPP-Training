package petadoptionapp;

//Dog class extends Pet
class Dog extends Pet {
String breed;

public Dog(String name, int age, String breed) {
 super(name, age); // calling parent constructor
 this.breed = breed;
}

@Override
public void showDetails() {
 super.showDetails();
 System.out.println("Breed: " + breed);
}
}
