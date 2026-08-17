public class Movie {
    int id;
    String movieName;
    int ageLimit;
    boolean is3d;
    int movieLength;

    public Movie() {};

    public Movie(int id, String movieName, int ageLimit, boolean is3d, int movieLength) {
        this.id = id;
        this.movieName = movieName;
        this.ageLimit = ageLimit;
        this.is3d = is3d;
        this.movieLength = movieLength;
    }

    public void printMovie() {
        System.out.println(this.id);
        System.out.println(this.movieName);
        System.out.println(this.ageLimit);
        System.out.println(this.is3d);
        System.out.println(this.movieLength);
    }

}
