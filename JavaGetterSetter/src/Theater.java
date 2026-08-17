public class Theater {
    String theaterName;
    int seats;
    boolean isDolbyAtmos;
    Movie[] movies;
    Customer[] customers;
    int seatsCounter = 0;

    public Theater() {}

    public Theater(String theaterName, int seats, boolean isDolbyAtmos, Movie[] movies) {
        this.theaterName = theaterName;
        this.seats = seats;
        this.isDolbyAtmos = isDolbyAtmos;
        this.movies = movies;
        this.customers = new Customer[seats];
    }

    public void printTheater() {
        System.out.println(this.theaterName);
        System.out.println(this.seats);
        System.out.println(this.isDolbyAtmos);
        System.out.println("Movies: ");
        for (int i = 0; i < movies.length - 1; i++) {
            if (movies[i] != null) {
                movies[i].printMovie();
            }
        }
        System.out.println("Customers: ");
        for (int i = 0; i < customers.length - 1; i++) {
            if (this.customers[i] != null) {
                this.customers[i].printCustomerDetails();
            }
        }
        System.out.println("Seats: " + this.seatsCounter);
    }

    public void seatCustomer(Customer customer, Movie movie) {

        //Checks if movie ID is what customer wants
        for (int i = 0; i < this.movies.length - 1; i++) {
            if (this.movies[i].id == movie.id) {
                break;
            }
            throw new RuntimeException("The movie you requested: " + movie.movieName + " is not available.");
        }

        //Checks age limit
        if (customer.age < movie.ageLimit) {
            throw new RuntimeException("You are underage! The age limit is " + movie.ageLimit);
        }

        //Checks if there are any seats available
        if (seatsCounter >= seats) {
            throw new RuntimeException("Sorry, no seat available! The seat count is " + seatsCounter);
        }

        //Adds seat in available seat
        this.customers[seatsCounter] = customer;
        this.seatsCounter++;
        System.out.println("You are now seated!");
    }

}
