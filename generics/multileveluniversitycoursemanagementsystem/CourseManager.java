package multileveluniversitycoursemanagementsystem;

class CourseManager {
    public static void displayCourses(java.util.List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getTitle());
        }
    }
}