package petadoptionapp;

//Cat class extends Pet
class Cat extends Pet {
String color;

public Cat(String name, int age, String color) {
 super(name, age);
 this.color = color;
}

@Override
public void showDetails() {
 super.showDetails();
 System.out.println("Color: " + color);
}
}
