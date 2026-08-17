import java.util.Scanner;

public class Main {
    void main() {
        String fName = "Idan";
        String lName = "Magen";
        System.out.println("My name is " + fName + " " + lName);

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Next year you will be " + (age + 1));
    }
}