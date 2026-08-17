public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle(3);
        Bicycle bicycle3 = new Bicycle("BMX");
        Car car = new Car();

        bicycle.honk();
        car.honk();

        System.out.println(car.getHasRoof());
        System.out.println(bicycle.modelName);
        System.out.println(bicycle.numOfWheels);

        System.out.println("-------");

        OfficeChair officeChair = new OfficeChair("Trivia", 4, 1199.99,
                false, true, true, 300.00);

        officeChair.printChair();
    }
}
