public class Car {
    String type;
    String model;
    String color;
    int speed;

    public Car(){};

    public Car (String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public Car (String type, String model, String color, int speed) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
}
