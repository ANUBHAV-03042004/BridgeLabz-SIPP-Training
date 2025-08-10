package aidrivenresumescreeningsystem;

public class Main {
	    public static void main(String[] args) {
	        java.util.List<SoftwareEngineer> seResumes = java.util.Arrays.asList(new SoftwareEngineer(), new SoftwareEngineer());
	        java.util.List<DataScientist> dsResumes = java.util.Arrays.asList(new DataScientist());

	        ScreeningSystem.processResumes(seResumes);
	        ScreeningSystem.processResumes(dsResumes);
	    }
	}