import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "1@1.com", 32);
        Student student2 = new Student("Jane", "Doe", "2@3.com", 32);
        Student student3 = new Student("Alex", "Smith", "3@4.com", 25);

        List<Student> studentList = List.of(student1, student2, student3);

        // Filter students aged 32 or older with clean single-line lambda syntax
        List<Student> filteredList = studentList.stream()
                .filter(student -> student.getAge() >= 32)
                .collect(Collectors.toList()); // Use .toList() if using Java 16+

        // Print formatted output
        filteredList.forEach(student ->
                System.out.println(student.getFirtsName() + " " + student.getLastName() + " - Age: " + student.getAge())
        );
    }
}