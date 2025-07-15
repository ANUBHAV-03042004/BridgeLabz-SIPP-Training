package universitycourseenrollmentsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] electives = {"music", "painting", "poetry", "acting", "cyber security", "aiml", "machine learning", "data science", "Internet of things"};
        String[] undergradCourses = {"btech", "bsc", "bpharma", "bcom", "bba", "bca", "ba"};
        String[] postgradCourses = {"mtech", "msc", "mcom", "mba", "mca", "ma"};
        String[] diplomaCourses = {"polytechnic", "hotel management", "animation", "interior design", "travel & tourism"};

        // FACULTY INPUT
        System.out.print("\nEnter number of faculty: ");
        int facultyCount = sc.nextInt();
        sc.nextLine();
        Faculty[] facultyArr = new Faculty[facultyCount];
        for (int i = 0; i < facultyCount; i++) {
            System.out.print("Enter faculty name: ");
            String facultyName = sc.nextLine();
            facultyArr[i] = new Faculty(i + 1, facultyName);
        }

        // COURSE INPUT
        System.out.print("\nEnter number of courses: ");
        int courseCount = sc.nextInt();
        sc.nextLine();
        Course[] courseArr = new Course[courseCount];
        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter course name: ");
            String courseName = sc.nextLine().toLowerCase();
            Faculty assignedFaculty = facultyArr[i % facultyArr.length];
            Course course = new Course(courseName, assignedFaculty.facultyid, assignedFaculty.facultyname);
            courseArr[i] = course;

            assignedFaculty.addCourse(course);
            course.addFaculty(assignedFaculty);
        }

        // STUDENT INPUT
        System.out.print("\nEnter number of students: ");
        int studentCount = sc.nextInt();
        sc.nextLine();
        Student[] studentArr = new Student[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("\nEnter student name: ");
            String studentName = sc.nextLine();

            System.out.print("Select elective course? (Yes/No): ");
            boolean wantsElective = sc.nextLine().equalsIgnoreCase("yes");

            System.out.print("Is the student Undergrad / Postgrad / Diploma? ");
            String studentType = sc.nextLine().toLowerCase();

            List<String> courseList;
            String defaultCourse;

            switch (studentType) {
                case "undergrad":
                case "undergraduate":
                    courseList = Arrays.asList(undergradCourses);
                    defaultCourse = "ba";
                    System.out.println("Available undergraduate courses: " + courseList);
                    break;
                case "postgrad":
                case "postgraduate":
                    courseList = Arrays.asList(postgradCourses);
                    defaultCourse = "ma";
                    System.out.println("Available postgraduate courses: " + courseList);
                    break;
                default:
                    courseList = Arrays.asList(diplomaCourses);
                    defaultCourse = "hotel management";
                    System.out.println("Available diploma courses: " + courseList);
                    break;
            }

            System.out.print("Enter course name to enroll: ");
            String enrolledCourseInput = sc.nextLine().toLowerCase();
            String enrolledCourse;

            if (!courseList.contains(enrolledCourseInput)) {
                System.out.println("Invalid or empty course. You get one more chance.");
                System.out.print("Enter valid course name again (or leave blank for default): ");
                String retry = sc.nextLine().toLowerCase();
                enrolledCourse = courseList.contains(retry) ? retry : defaultCourse;
            } else {
                enrolledCourse = enrolledCourseInput;
            }

            Student student;
            int facultyId = facultyArr[i % facultyArr.length].facultyid;

            switch (studentType) {
                case "undergrad":
                case "undergraduate":
                    student = new UnderGraduate(i + 1, studentName, facultyId);
                    break;
                case "postgrad":
                case "postgraduate":
                    student = new PostGraduate(i + 1, studentName, facultyId);
                    break;
                default:
                    student = new Diploma(i + 1, studentName, facultyId);
                    break;
            }

            Optional<Course> courseOpt = Arrays.stream(courseArr)
                    .filter(c -> c.coursename.equalsIgnoreCase(enrolledCourse))
                    .findFirst();

            Course selectedCourse = courseOpt.orElse(courseArr[0]);
            student.addCourse(selectedCourse);
            selectedCourse.addStudent(student);

            Optional<Faculty> facultyOpt = Arrays.stream(facultyArr)
                    .filter(f -> f.facultyid == selectedCourse.facultyid)
                    .findFirst();

            facultyOpt.ifPresent(faculty -> {
                student.addfaculty(faculty);
                faculty.addStudent(student);
                int[] marks = new int[5];
                for (int j = 0; j < 5; j++) marks[j] = random.nextInt(101);
                double gpa = faculty.calculategpa(marks);
                String result = faculty.assigngrade(gpa);
                student.setgpa(gpa);
                student.setresult(result);
            });

            if (wantsElective) {
                System.out.println("Available electives: " + Arrays.toString(electives));
                System.out.print("Choose elective: ");
                String elective = sc.nextLine().toLowerCase();
                if (Arrays.asList(electives).contains(elective)) {
                    int randomFaculty = random.nextInt(facultyArr.length);
                    Course electiveCourse = new Course(elective, facultyArr[randomFaculty].facultyid, facultyArr[randomFaculty].facultyname);
                    student.addelectivecourse(electiveCourse);
                }
            }

            studentArr[i] = student;
        }

        System.out.println("\n===== TRANSCRIPTS =====");
        for (Student s : studentArr) {
            s.gettranscript();
            System.out.println();
        }

        System.out.println("===== FACULTY DETAILS =====");
        for (Faculty f : facultyArr) {
            f.gettranscript();
            System.out.println();
        }

        System.out.println("===== COURSE DETAILS =====");
        for (Course c : courseArr) {
            c.gettranscript();
            System.out.println();
        }
        sc.close();
    }
}
