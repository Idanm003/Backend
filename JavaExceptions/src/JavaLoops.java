public class JavaLoops  {
    public static void main(String[] args) {
        //For

        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        //For Each

        String[] cars = {"Honda", "Ford", "Toyota"};
        for (String car : cars){
            System.out.println(car);
        }

        //While

        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }

        //For loop EX:

        System.out.println("For loop");

        for (int j = 0; j <= 30; j++){
            System.out.println(j + " ");
        }

        //While loop EX:

        System.out.println("While loop");

        int k = 0;
        while (k <= 30){
            System.out.println(k);
            k++;
        }

        //Matrix

        System.out.println("Matrix");

        int [][] matrix = {
                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20}
        };

        System.out.println("Matrix with For");

        for (int m = 0; m < matrix.length; m++){
            for (int n = 0; n < matrix[m].length; n++){
                System.out.print(matrix[m][n]);
            }
        }

        System.out.println("Matrix with For Each");

        for (int[] array : matrix){
            for (int value : array) {
                System.out.print(value);
            }
        }
    }
}