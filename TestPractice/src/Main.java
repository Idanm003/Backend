import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ActionFigure actionFigure = new ActionFigure();
        SurpriseItem<ActionFigure> surpriseItemActionFigure = new SurpriseItem<>(actionFigure);

        Employee dani = new Employee(1, "dani", "levit", "givat shmuel", 4000, 4, surpriseItemActionFigure);
        Employee jeremy = new Employee(2, "jeremy", "komarov", "givat shmuel", 4000, 2, null);
        ArrayList<Employee> pizzaDominosEmployees = new ArrayList<>();
        pizzaDominosEmployees.add(dani);
        pizzaDominosEmployees.add(jeremy);


        Employee levi = new Employee(2, "levi", "sdsd", "givat shmuel", 1500, 4, null);
        Employee katz = new Employee(2, "katz", "sdsdsd", "givat shmuel", 3000, 2, null);

        levi.setPizzaRank(4);
        ArrayList<Employee> pizzaHutEmployees = new ArrayList<>();
        pizzaHutEmployees.add(levi);
        pizzaHutEmployees.add(katz);


        PizzaDomino pizzaDominos = new PizzaDomino(1, "dominos", "israel", pizzaDominosEmployees, "435435345");
        PizzaHut pizzaHut = new PizzaHut(1, "hut", "israel", pizzaHutEmployees, "435435345");


        System.out.println(pizzaDominos.getRank());
        System.out.println(pizzaHut.getRank());


        pizzaHut.calculateRangedRank(4);


        dani.getSurpriseItem().activateSurprise();
    }
}