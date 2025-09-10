package unitconversiontool;

public class UnitConversionTool {
    public static void main(String[] args) {
        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + UnitConverter.kgToLbs(5) + " lbs");
    }
}

