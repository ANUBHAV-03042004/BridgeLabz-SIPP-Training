package encapsulationpolymorphisminterfaceandabstractclass.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.25; // 25% additional for commercial vehicle
    }
    
  
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.08; // 8% insurance rate for trucks
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance - Policy: ***" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
    }
}
