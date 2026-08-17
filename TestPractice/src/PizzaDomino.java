import java.util.ArrayList;

public class PizzaDomino extends PizzaStore{
    public PizzaDomino(Integer id, String name, String address, ArrayList<Employee> employees, String phoneNumber) {
        super(id, name, address, employees, phoneNumber);
        this.calculatePizzaRanking();
    }


    @Override
    public void calculatePizzaRanking() {
        Integer totalRank = super.getTotalEmployeesRank();
        super.setRank(totalRank);
    }
}
