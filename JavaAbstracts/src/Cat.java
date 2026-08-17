public class Cat extends Animal{
    private String name;

    public Cat(String name) {
        super(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void greets(){
        System.out.println("Meow");
    }
}