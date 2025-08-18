package smartfarmingsystem;


//Abstract class
abstract class Crop {
protected String name;

public Crop(String name) {
this.name = name;
}

abstract int waterRequirement();   // liters per day
abstract void harvest();           // harvesting method
}
