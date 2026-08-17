public class Dog extends Animal {
    private String name;

    public Dog(String name) {
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
        System.out.println("Woof");
    }

    public void greets(Dog dog){
        System.out.println("Woooof");
    }

}