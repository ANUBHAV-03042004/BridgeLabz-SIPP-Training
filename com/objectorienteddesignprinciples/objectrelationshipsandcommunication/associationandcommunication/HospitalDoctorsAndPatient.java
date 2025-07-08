package objectorienteddesignprinciples.objectrelationshipsandcommunication.associationandcommunication;

	import java.util.ArrayList;
	import java.util.List;

	class Patient {
	    private String name;
	    private List<Doctor> doctors;

	    public Patient(String name) {
	        this.name = name;
	        this.doctors = new ArrayList<>();
	    }

	    public void addDoctor(Doctor doctor) {
	        doctors.add(doctor);
	    }

	    public void viewConsultations() {
	        System.out.println("Consultations for " + name + ":");
	        for (Doctor doctor : doctors) {
	            System.out.println("- Consulted " + doctor.getName());
	        }
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Doctor {
	    private String name;
	    private List<Patient> patients;

	    public Doctor(String name) {
	        this.name = name;
	        this.patients = new ArrayList<>();
	    }

	    public void consult(Patient patient) {
	        patients.add(patient);
	        patient.addDoctor(this);
	        System.out.println(name + " is consulting " + patient.getName());
	    }

	    public String getName() {
	        return name;
	    }
	}

	class Hospital {
	    private String name;
	    private List<Doctor> doctors;
	    private List<Patient> patients;

	    public Hospital(String name) {
	        this.name = name;
	        this.doctors = new ArrayList<>();
	        this.patients = new ArrayList<>();
	    }

	    public void addDoctor(Doctor doctor) {
	        doctors.add(doctor);
	    }

	    public void addPatient(Patient patient) {
	        patients.add(patient);
	    }

	    public void consult(Doctor doctor, Patient patient) {
	        doctor.consult(patient);
	    }
	}

	public class HospitalDoctorsAndPatient {
	    public static void main(String[] args) {
	        // Create Hospital
	        Hospital cityHospital = new Hospital("City Hospital");

	        // Create Doctors and Patients
	        Doctor drBrown = new Doctor("Dr. Brown");
	        Patient alice = new Patient("Alice");

	        // Add to Hospital
	        cityHospital.addDoctor(drBrown);
	        cityHospital.addPatient(alice);

	        // Perform Consultation (Association)
	        cityHospital.consult(drBrown, alice);

	        // View Consultations
	        alice.viewConsultations();
	    }
	}