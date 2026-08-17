import java.util.Random;

public class BreakAndContinue {
    public static void main(String[] args) {
        Random random = new Random();

        String[] houseItems = {"Computer", "Tv", "Fan", "Chair", "Phone"};
        String[] foodItems = {"Pizza", "Hamburger", "Chips", "Beef", "Rice"};

        String targetHouseItem = "Tv";
        String targetFoodItem = "Chips";


        // Shuffling houseItems
        for (int i = 0; i <houseItems.length; i++) {
            int randomNum = random.nextInt(5);
            String itemHolder = houseItems[randomNum];

            houseItems[randomNum] = houseItems[i];
            houseItems[i] = itemHolder;
        }

        //Shuffling foodItems
        for (int i = 0; i < foodItems.length; i++) {
            int randomNum = random.nextInt(5);
            String itemHolder = foodItems[randomNum];
            
            foodItems[randomNum] = foodItems[i];
            foodItems[i] = itemHolder;
        }

        for (String item : houseItems) {
            if (item.equals(targetHouseItem)) {
                System.out.println("The iteration was stopped because I chose: " + item);
                break;
            }
            System.out.println("House Item: " + item);
        }

        for (String item : foodItems) {
            if (item.equals(targetFoodItem)) {
                continue;
            }
            System.out.println("Food Item: " + item);
        }
    }
}