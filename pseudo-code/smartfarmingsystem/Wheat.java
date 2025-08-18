package smartfarmingsystem;

//Wheat Implementation
class Wheat extends Crop {
public Wheat() {
   super("Wheat");
}

@Override
int waterRequirement() {
   return 60;
}

@Override
void harvest() {
   System.out.println("Harvesting wheat using combine machine.");
}
}
