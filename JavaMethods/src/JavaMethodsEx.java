public class JavaMethodsEx {
    public static void main(String[] args) {
        String[] shoppingCart1 = {"Computer", "Mouse"};
        double total1 = calculateTotal(shoppingCart1);
        processPayment(total1, "cash");

        String[] shoppingCart2 = {"Screen", "Keyboard", "Printer"};
        double total2 = calculateTotal(shoppingCart2);
        processPayment(total2, "credit card");
    }

    public static double calculateTotal(String[] shoppingCart) {
        double total = 0;
        for (String item : shoppingCart) {
            switch (item) {
                case "Computer":
                    total += 2500;
                    break;
                case "Screen":
                    total += 1200;
                    break;
                case "Mouse":
                    total += 250;
                    break;
                case "Printer":
                    total += 500;
                    break;
                case "Keyboard":
                    total += 350;
                    break;
                default:
                    System.out.println("Unknown item: " + item);
            }
        }
        return total;
    }

    public static void processPayment(double total, String paymentMethod) {
        switch (paymentMethod) {
            case "cash":
                System.out.println("Please give " + total + " shekels to the cashier.");
                break;
            case "check":
                System.out.println("Please write a check for this amount " + total + " and give it to the cashier.");
                break;
            case "credit card":
                boolean isValid = true;
                if (isValid) {
                    System.out.println("Your credit card was charged with " + total + " shekels, thanks for buying!");
                break;
                }
                else {
                    System.out.println("Invalid credit card!");
                }
            default:
                System.out.println("Payment method not supported.");
        }
    }
}
