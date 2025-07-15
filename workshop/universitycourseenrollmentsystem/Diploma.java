package universitycourseenrollmentsystem;

public class Diploma extends Student {

    public Diploma(int studentid, String studentname, int facultyid) {
        super(studentid, studentname, facultyid);
    }

    @Override
    public void gettranscript() {
        System.out.println("Student with id : " + studentid + " and name : " + studentname + " is enrolled in -");
        for (int i = 0; i < studentcourse.size(); i++) {
            System.out.println("# " + studentcourse.get(i).coursename);
        }
        System.out.println("is a Diploma Student");
        System.out.println("Faculty assigned : ");
        for (int i = 0; i < studentfaculty.size(); i++) {
            System.out.println("* " + studentfaculty.get(i).facultyname);
        }
        System.out.println("GPA : " + getgpa());
        System.out.println("Result: " + getresult());
    }
}
