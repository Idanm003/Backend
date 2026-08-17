public class OfficeChair extends Chair {
    private boolean isAllowedAdjustments, isSpinning, hasDiscount;
    private double discountedAmount;

    public OfficeChair() {}

    public OfficeChair(String model, int numOfLegs, double price,
                       boolean isAllowedAdjustments,  boolean isSpinning, boolean hasDiscount,
                       double discountedAmount) {
        super(model, numOfLegs, price);
        this.isAllowedAdjustments = isAllowedAdjustments;
        this.isSpinning = isSpinning;
        this.discountedAmount = discountedAmount;
        this.hasDiscount = hasDiscount;
    }

    public boolean getIsAllowedAdjustments() {
        return isAllowedAdjustments;
    }
    public void setAllowedAdjustments(boolean allowedAdjustments) {
        isAllowedAdjustments = allowedAdjustments;
    }
    public boolean getIsSpinning() {
        return isSpinning;
    }
    public void setSpinning(boolean spinning) {
        isSpinning = spinning;
    }
    public boolean getHasDiscount() {
        return hasDiscount;
    }
    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }
    public double getDiscountedAmount() {
        return discountedAmount;
    }
    public void setDiscountedAmount(double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    @Override
    void printChair() {
        super.printChair();
        System.out.println("is AllowedAdjustments: " + this.getIsAllowedAdjustments());
        System.out.println("isSpinning: " + this.getIsSpinning());
        System.out.println("hasDiscount: " + this.getHasDiscount());
        System.out.println("discountedAmount: " + this.getDiscountedAmount());
    }

    @Override
    public double calculatePrice(int numOfChairs) {
        double totalPrice = super.calculatePrice(numOfChairs);

        if (this.getHasDiscount()) {
            double discount = this.getDiscountedAmount() * numOfChairs;
            return totalPrice - discount;
        }
        return totalPrice;
    }
}