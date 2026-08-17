public class Vehicle {
    String brand ="Ford";
    int numOfWheels = 2;

    public Vehicle() {}

    public Vehicle(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    void honk() {
        System.out.println("Honk Honk");
    }
}