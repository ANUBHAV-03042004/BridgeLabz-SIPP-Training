package smartfarmingsystem;

public class SmartFarmingSystem {
 public static void main(String[] args) {
     Crop rice = new Rice();
     Crop wheat = new Wheat();

     System.out.println(rice.name + " needs " + rice.waterRequirement() + "L water/day");
     rice.harvest();

     System.out.println(wheat.name + " needs " + wheat.waterRequirement() + "L water/day");
     wheat.harvest();
 }
}
