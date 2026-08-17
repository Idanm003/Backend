public class BigDog extends Dog{
    private String name;

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog dog) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog bigDog) {
        System.out.println("Woooooooooow");
    }
}