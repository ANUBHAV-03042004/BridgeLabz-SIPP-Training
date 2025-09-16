package studentresultgrouping;

	import java.util.*;
	import java.util.stream.*;

	public class StudentResultGrouping {
	    public static void main(String[] args) {
	        List<Student> students = Arrays.asList(
	            new Student("Alice", "A"),
	            new Student("Bob", "B"),
	            new Student("Charlie", "A"),
	            new Student("David", "C"),
	            new Student("Eve", "B")
	        );

	        Map<String, List<String>> grouped = students.stream()
	            .collect(Collectors.groupingBy(
	                s -> s.gradeLevel, 
	                Collectors.mapping(s -> s.name, Collectors.toList())
	            ));

	        grouped.forEach((grade, names) -> 
	            System.out.println("Grade " + grade + ": " + names));
	    }
	}

