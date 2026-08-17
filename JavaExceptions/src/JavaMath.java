import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class JavaMath {
    public static void main(String[] args) {

        Random rand = new Random();

        int randomNum1 = rand.nextInt(5) + 1;
        int randomNum2 = rand.nextInt(5) + 1;

        if (randomNum1 == randomNum2) {
            System.out.println("The numbers are equal with the value of " + randomNum1);
        }
        else {
            System.out.println("The numbers are not equal, first number value is: " + randomNum1 +
                    ", and second number value is: " + randomNum2);
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String formattedDate = now.format(dtf);
        System.out.println(formattedDate);
    }
}