import java.util.ArrayList;

public class PizzaHut extends PizzaStore{
    public PizzaHut(Integer id, String name, String address, ArrayList<Employee> employees, String phoneNumber) {
        super(id, name, address, employees, phoneNumber);
        this.calculatePizzaRanking();
    }


    public void calculateRank(){
        Integer totalRank = super.getTotalEmployeesRank();
        Integer averageRank = totalRank / super.getNumOfEmployees();
        super.setRank(averageRank);
    }

    @Override
    public void calculatePizzaRanking() {
        Integer totalRank = super.getTotalEmployeesRank();
        Integer averageRank = totalRank / super.getNumOfEmployees();
        super.setRank(averageRank);
    }
}
