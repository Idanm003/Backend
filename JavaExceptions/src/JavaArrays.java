import java.util.Random;

public class JavaArrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Toyota"};
        int[] nums = {1, 2, 3, 4, 5};

        //Gets address
        System.out.println(cars);
        System.out.println(nums);

        //Gets length
        System.out.println(cars.length);
        System.out.println(nums.length);

        //Gets first index
        System.out.println(cars[0]);
        System.out.println(nums[0]);

        cars[0] = "Honda"; //Replaces index with new argument
        System.out.println(cars[0]);

        String[] cars2 = new String[10]; //Initialize 10 items with the value of null
        System.out.println(cars2.length);
        System.out.println(cars2[2]);

        cars2[2] = "Honda"; //Initializes cars[2] as "Honda"
        System.out.println(cars2[2]);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrix);
        System.out.println(matrix[1][2]);

//---------------------------------------------------------------------------------------//

        String[] randomStrings = {"Apple", "Banana", "Pear", "Pineapple", "Strawberry"};
        int[] randomInts = {1, 2, 3, 4, 5};

        Random randomChange = new Random();

        int randomIntIndex = randomChange.nextInt(randomInts.length);
        randomInts[randomIntIndex] = 9;

        System.out.println("Int array after change:");
        for (int num : randomInts) {
            System.out.println(num);
        }

        int randomStringIndex = randomChange.nextInt(randomStrings.length);
        randomStrings[randomStringIndex] = "Hello";

        System.out.println("\nString array after change:");
        for (String str : randomStrings) {
            System.out.println(str);
        }

        int[][] matrix2 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
        };

        System.out.println("\nFirst column values:");
        System.out.println(matrix2[0][0] + ", " + matrix2[1][0]);
    }
}