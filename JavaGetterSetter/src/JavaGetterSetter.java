public class JavaGetterSetter {
    public static void main(String[] args) {

        Customer2 customer1 = new Customer2(35);
        Customer2 customer2 = new Customer2(11);

        Movie2 movie1 = new Movie2("scary movie", 18, 4);
        Movie2 movie2 = new Movie2("scary movie", 18, 4);

        System.out.println(movie1.getAgeLimit());
        movie1.setAgeLimit(17);
        System.out.println(movie1.getAgeLimit());


    }
}
