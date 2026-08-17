import java.time.LocalDate;

public class Employee {
    private Integer id;
    private Integer salary;
    private Integer pizzaRank;
    private String firstName, lastName, address;
    private LocalDate startDate, pizzaRankDate;
    private SurpriseItem surpriseItem;

    public Employee(Integer id, String firstName, String lastName, String address, Integer salary, Integer pizzaRank, SurpriseItem surpriseItem) {
        this.id = id;
        this.salary = salary;
        this.pizzaRank = pizzaRank;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.startDate = LocalDate.now();
        this.pizzaRankDate = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }
    public Integer getSalary() {
        return salary;
    }
    public Integer getPizzaRank() {
        return pizzaRank;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getPizzaRankDate() {
        return pizzaRankDate;
    }
    public SurpriseItem getSurpriseItem() {
        return surpriseItem;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public void setPizzaRank(Integer pizzaRank) {
        this.pizzaRank = (int) (Math.random() * 100) + 1;
        this.setPizzaRankDate(LocalDate.now());
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setPizzaRankDate(LocalDate pizzaRankDate) {
        this.pizzaRankDate = pizzaRankDate;
    }
    public void setSurpriseItem(SurpriseItem surpriseItem) {
        this.surpriseItem = surpriseItem;
    }
}