public class GamingChair extends Chair {
    private boolean isAllowAdjustments;
    private boolean isSpinning;
    private boolean hasDiscount;
    private double discountAmount; // Discount per chair

    public GamingChair(String model, int numberOfLegs, double price,
                       boolean isAllowAdjustments, boolean isSpinning,
                       boolean hasDiscount, double discountAmount) {
        super(model, numberOfLegs, price);
        this.isAllowAdjustments = isAllowAdjustments;
        this.isSpinning = isSpinning;
        this.hasDiscount = hasDiscount;
        this.discountAmount = discountAmount;
    }

    public boolean getIsAllowAdjustments() { return isAllowAdjustments; }
    public boolean getIsSpinning() { return isSpinning; }
    public boolean getHasDiscount() { return hasDiscount; }
    public double getDiscountAmount() { return discountAmount; }

    public void setAllowAdjustments(boolean allowAdjustments) { isAllowAdjustments = allowAdjustments; }
    public void setSpinning(boolean spinning) { isSpinning = spinning; }
    public void setHasDiscount(boolean hasDiscount) { this.hasDiscount = hasDiscount; }
    public void setDiscountAmount(double discountAmount) { this.discountAmount = discountAmount; }

    @Override
    public void printChair() {
        super.printChair();
        System.out.println("Type: Gaming Chair");
        System.out.println("Allows Adjustments: " + isAllowAdjustments);
        System.out.println("Spins: " + isSpinning);
        System.out.println("Has Discount: " + hasDiscount);
        if (hasDiscount) {
            System.out.println("Discount Amount: $" + discountAmount);
        }
    }

    @Override
    public double calculatePrice(int numOfChairs) {
        double totalPrice = super.calculatePrice(numOfChairs);

        if (this.getHasDiscount()) {
            double discount = this.getDiscountAmount() * numOfChairs;
            return totalPrice - discount;
        }
        return totalPrice;
    }
}