public class Chair {
    private String model;
    private int numOfLegs;
    private double price;

    public Chair() {}

    public Chair(String model, int numOfLegs, double price) {
        this.model = model;
        this.numOfLegs = numOfLegs;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getNumOfLegs() {
        return numOfLegs;
    }
    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    void printChair(){
        System.out.println("Chair Details: " +
                "The chair model is " + getModel() +
                " with " + getNumOfLegs() +
                " legs, " +
                "at a price of " + getPrice());
    }

    public double calculatePrice(int numOfChairs){
        return numOfChairs * this.getPrice();
    }
}