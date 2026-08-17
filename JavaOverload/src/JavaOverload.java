import java.util.Random;

public class JavaOverload {
    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c", "d"};
        int [] numArray = {1, 2, 3, 4};
        
        shuffleArray(stringArray);
        shuffleArray(numArray);

        printName("Idan");
        printName("Idan", "Magen");
    }

/*
    static void printName(String firstName){
        return printName();
    }
*/

    static void printName(String firstName) {
        System.out.println(firstName);
    }

    static void printName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }

    static void shuffleArray(String[] arrayToShuffle) {
        Random rand = new Random();
        
        for (int i = 0; i < arrayToShuffle.length; i++) {
            int randomNum = rand.nextInt(arrayToShuffle.length);
            
            String itemHolder = arrayToShuffle[randomNum];
            arrayToShuffle[randomNum] = arrayToShuffle[i];
            arrayToShuffle[i] = itemHolder;
        }
    }
    
    static void shuffleArray(int[] arrayToShuffle) {
        Random rand = new Random();
        
        for (int i = 0; i < arrayToShuffle.length; i++) {
            int randomNum = rand.nextInt(arrayToShuffle.length);

            int itemHolder = arrayToShuffle[randomNum];
            arrayToShuffle[randomNum] = arrayToShuffle[i];
            arrayToShuffle[i] = itemHolder;
        }
    }
}
