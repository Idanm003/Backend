public class Customer {
    String fullName;
    int age;

    public Customer() {}

    public Customer(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void printCustomerDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
    }
}
