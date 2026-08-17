public class LoopBreak {
    public static void main(String[] args) {

        //Loops without break (SKIPS ON TO NEXT ITEM)
        int[] ages = {21,22,23,24,25, 17, 28};
        for (int i = 0; i < ages.length; i++){
            if (ages[i] < 18){
                System.out.println("You are too young!");
                continue;
            }

            System.out.println("You can enter!");
        }

        //Loops with break (DO NOT GO ON)
        String[] personalItems = {"cellphone", "lighter", "knife", "bag"};
        for (int i = 0; i < personalItems.length; i++){
            if  (personalItems[i].equals("knife")){
                break;
            }
            System.out.println("The items are: " + personalItems[i]);
        }

        int[] testArray1= {1,2,3,4};
        int[] testArray2= {5,6,7,8,9};

        for (int i = 0; i < testArray1.length; i++){
            for (int j = 0; j < testArray2.length; j++) {
                if (testArray2[j] == 6) {
                    System.out.println(j + ": " + testArray2[i]);
                    continue;
                }
            }
            System.out.println(i + ": " + testArray1[i]);
        }

    }
}
