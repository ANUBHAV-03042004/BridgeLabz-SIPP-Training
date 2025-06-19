public class PenDivision {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;

        // Pens per student (integer division)
        int pensPerStudent = totalPens / totalStudents;

        // Remaining pens using modulus operator
        int remainingPens = totalPens % totalStudents;

        // Output the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
