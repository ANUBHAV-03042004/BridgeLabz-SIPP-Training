package smartfarmingsystem;

//Rice Implementation
class Rice extends Crop {
public Rice() {
 super("Rice");
}

@Override
int waterRequirement() {
 return 100; // example liters
}

@Override
void harvest() {
 System.out.println("Harvesting rice with sickle.");
}
}

