import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseSize;
    private ArrayList<Student> courseStudents;

    public Course(String courseName, int courseSize, ArrayList<Student> courseStudents) {
        this.courseName = courseName;
        this.courseSize = courseSize;
        this.courseStudents = courseStudents;
    }

    public void registerStudent(Student student){
        if (courseStudents.size() <  courseSize) {
            courseStudents.add(student);
        }
        else {
            System.out.println("Student already exists");
        }
    }

    public void removeStudent(Student student){
        courseStudents.remove(student);
    }

    public void printCourseStudents(){
        System.out.println("Course students:");
        courseStudents.forEach(student -> System.out.println(student.getFirstName() + " " + student.getLastName()));
    }

}
