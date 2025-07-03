package encapsulationpolymorphisminterfaceandabstractclass.vehiclerentalsystem;


class Car extends Vehicle implements Insurable {
    // Private field for insurance policy - demonstrates encapsulation
    private String insurancePolicyNumber;
    
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    
   
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.1; // 10% luxury tax for cars
    }
    
    @Override
    public double calculateInsurance() {
        return rentalRate * 0.05; // 5% insurance rate for cars
    }
    
    
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance - Policy: ***" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
    }
}