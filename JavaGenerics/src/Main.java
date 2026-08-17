import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //Initialize the classes
        Fruit fruit  = new Fruit();
        Chair chair = new Chair();

        //Set generic class as requested type of class
        Box<Fruit> fruitBox = new Box<>(fruit);
        Box<Chair> chairBox = new Box<>(chair);

        //Set class as requested item
        fruitBox.setItem(fruit);
        fruitBox.printItemClass();

        chairBox.setItem(chair);
        chairBox.printItemClass();

        //Key Value Pair
        KeyValuePair<String, Integer> keyValuePrice = new KeyValuePair<>("Table", 100);
        keyValuePrice.printKeyValuePair();

        //Array List

        Student firstStudent = new Student("Ben", "Meir", "ben@gmail.com");
        Student secondStudent = new Student("Ori", "David", "ori@gmail.com");
        Student thirdStudent = new Student("John", "Doe", "JDoe@gmail.com");
        ArrayList<Student> students = new ArrayList<>();

        Course fullstack = new Course("Fullstack", 2, students);
        fullstack.registerStudent(firstStudent);
        fullstack.registerStudent(secondStudent);
        fullstack.registerStudent(thirdStudent);
        fullstack.printCourseStudents();

        fullstack.removeStudent(firstStudent);
        fullstack.printCourseStudents();

    }
}
