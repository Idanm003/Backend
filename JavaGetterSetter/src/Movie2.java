public class Movie2 {
    private String name;
    private int ageLimit;
    private int id;
    private int maxSeats;
    private Customer2[] customers;
    private int counter = 0;

    public Movie2() {}

    public Movie2(String name, int ageLimit, int maxSeats) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.customers = new Customer2[maxSeats];
    }

    public String getName() {
        return name;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public int getId() {
        return id;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public Customer2[] getCustomers() {
        return customers;
    }

    public int getCounter() {
        return counter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgeLimit(int ageLimit) {
        int countryAgeLimit = 20;

        if (ageLimit > countryAgeLimit) {
            this.ageLimit = ageLimit;
        }

        this.ageLimit = ageLimit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public void setCustomers(Customer2[] customers) {
        this.customers = customers;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void seatCustomer (Customer2 customer){
        if (counter > maxSeats) {
            return;
        }

        if (customer.age < ageLimit) {
            return;
        }
        this.customers[counter] = customer;
        counter++;
    }
}
