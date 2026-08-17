import java.util.Arrays;

public class Teacher {
    private String name;
    private int age;
    String [] teachingSubjects;
    public Teacher(String name, int age, String[] teachingSubjects) {
        this.name = name;
        this.age = age;
        this.teachingSubjects = teachingSubjects;
    }
    
    public void getTeacherDetails(){
        System.out.println("Teacher Name: " + this.name);
        System.out.println("Teacher Age: " + this.age);
        System.out.println("Teacher Teaching Subjects: " + Arrays.toString(teachingSubjects));
    }
}
