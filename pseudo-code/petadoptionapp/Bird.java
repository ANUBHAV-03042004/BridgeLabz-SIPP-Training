package petadoptionapp;

//Bird class extends Pet
class Bird extends Pet {
boolean canTalk;

public Bird(String name, int age, boolean canTalk) {
   super(name, age);
   this.canTalk = canTalk;
}

@Override
public void showDetails() {
   super.showDetails();
   System.out.println("Can Talk: " + (canTalk ? "Yes" : "No"));
}
}