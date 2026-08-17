import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

abstract public class PizzaStore {
    private Integer id, numOfEmployees, rank;
    private String name, address, phoneNumber;
    private ArrayList<Employee> employees;

    public PizzaStore(Integer id, String name, String address, ArrayList<Employee> employees, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numOfEmployees = employees.size();
        this.employees = employees;
        this.phoneNumber = phoneNumber;
    }


    public Integer getId() {
        return id;
    }
    public Integer getNumOfEmployees() {
        return numOfEmployees;
    }
    public Integer getRank() {
        return rank;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setNumOfEmployees() {
        this.numOfEmployees = numOfEmployees;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Integer calculateEmployeeExpenses(){
        Integer totalEmployeesSalary = 0;
        for (Employee employee : this.getEmployees()) {
            totalEmployeesSalary += employee.getSalary();
        }
        return totalEmployeesSalary;
    }

    public void hireEmployee(Employee newEmployee){
        for (Employee employee : this.getEmployees()) {
            if (Objects.equals(newEmployee.getId(), employee.getId())) {
                System.out.println("Employee with id: " + newEmployee.getId() + " is hired");
                return;
            }

            this.employees.add(newEmployee);
            newEmployee.setStartDate(LocalDate.now());
            this.setNumOfEmployees();

            System.out.println("Employee: " + employee.getId() + " is hired on: " + employee.getStartDate());
        }
    }

    public void fireEmployee(Employee employeeToFire){
        for (Employee employee : this.getEmployees()) {
            if (Objects.equals(employeeToFire.getId(), employee.getId())) {
                this.getEmployees().remove(employeeToFire);
                employeeToFire.setStartDate(null);
                this.setNumOfEmployees();

                System.out.println("Employee: " + employeeToFire.getId() + " has been fired");
                return;
            }
            System.out.println("Employee: " + employeeToFire.getId() + " cannot be fired");
        }
    }

    public Integer getTotalEmployeesRank(){
        Integer totalEmployeesRank = 0;
        for (Employee employee : this.getEmployees()) {
            totalEmployeesRank += employee.getPizzaRank();
        }
        return totalEmployeesRank;
    }

    abstract public void calculatePizzaRanking();

    public void calculateRangedRank(Integer range){
        LocalDate currentDate = LocalDate.now();
        LocalDate rangedDay = currentDate.minusDays(range);

        for (Employee employee : this.getEmployees()){
            boolean isValidRankedDate = employee.getPizzaRankDate().isAfter(rangedDay);
            if (!isValidRankedDate) {
                System.out.println("Employee: " + employee.getId() + " needs to rank again immediately");
            }
        }
    }

    public void giveSurpriseToEmployee(Employee wantedEmployee, SurpriseItem surpriseItem){
        boolean isEmployeeFound = false;
        for (Employee employee : this.getEmployees()) {
            if (Objects.equals(wantedEmployee.getId(), employee.getId())) {
                isEmployeeFound = true;
                break;
            }
            if (isEmployeeFound){
                wantedEmployee.setSurpriseItem(surpriseItem);
            }
        }
    }

    public void takeSurpriseFromEmployee(Employee wantedEmployee){
        boolean isEmployeeFound = false;
        for (Employee employee : this.getEmployees()) {
            if (Objects.equals(wantedEmployee.getId(), employee.getId())) {
                isEmployeeFound = true;
                break;
            }
            if (isEmployeeFound){
                wantedEmployee.setSurpriseItem(null);
            }
        }
    }
}