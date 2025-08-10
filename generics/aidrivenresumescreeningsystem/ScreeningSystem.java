package aidrivenresumescreeningsystem;

//Screening utility with wildcard method
class ScreeningSystem {
 public static void processResumes(java.util.List<? extends JobRole> resumes) {
     for (JobRole role : resumes) {
         System.out.println("Processing resume for: " + role.getTitle());
     }
 }
}
