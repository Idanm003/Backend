public class Bicycle extends Vehicle{
    public String modelName;

    public Bicycle(){}


    public Bicycle(String modelName){
        this.modelName = modelName;
    }

    public Bicycle(int numOfWheels){
        super(numOfWheels);
    }

    public Bicycle(String modelName, int numOfWheels){
        super(numOfWheels);
        this.modelName = modelName;
    }
    @Override
    void honk() {
        super.honk();
        System.out.println("Bling Bling");
    }
}
