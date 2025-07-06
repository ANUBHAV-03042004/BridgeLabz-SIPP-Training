package encapsulationpolymorphisminterfaceandabstractclass.hospitalpatientmanagementsystem;

public class InPatient extends Patient {
    private int numberOfDays;
    private double costPerDay;

    public InPatient(int patientId, String name, int age, int numberOfDays, double costPerDay) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.costPerDay = costPerDay;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * costPerDay;
    }
}
