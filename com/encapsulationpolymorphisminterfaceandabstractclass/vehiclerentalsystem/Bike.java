package encapsulationpolymorphisminterfaceandabstractclass.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
    /**
     * Bike-specific rental cost calculation
     * Base rate with discount for eco-friendly transport
     */
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9; // 10% discount for eco-friendly bikes
    }
    
    /**
     * Bike insurance calculation - 3% of rental cost
     */
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.03; // 3% insurance rate for bikes
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance - Policy: ***" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
    }
}
