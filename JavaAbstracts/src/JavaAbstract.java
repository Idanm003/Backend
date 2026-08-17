public class JavaAbstract {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveRight();

        Bird bird = new Bird("Eagle", 2);
        //FlyingAnimal = new FlyingAnimal("Bird", 1); Can not be done because abstract
        Teacher teacher = new Teacher("Idan", 28, new String[]{"Backend", "Frontend", "Fullstack"});
        Course course = new Course("Fullstack", 14, teacher);

        course.printCourseDetails();

        Cat cat = new Cat("Cat");
        cat.greets();

        Dog dog = new Dog("Dog");
        dog.greets();
        dog.greets(dog);

        BigDog bigDog = new BigDog("BigDog");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(bigDog);
    }
}