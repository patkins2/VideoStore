
import java.text.DecimalFormat;
import java.util.Arrays;

public class Movie {

    
    String title;
    double price;
    String movieType;
    Rental rentalClass;
    String[] regularMovies = {"Terminator", "Matrix", "Godfather"};
    String[] childrenMovies = {"Finding Nemo", "Wizard Of Oz", "Lion King"};
    String[] newReleases = {"Wall Street", "Dallas Buyers Club"};
    double value;

    public Movie(String title, int numberOfDays) {

        this.title = title;
        this.movieType = getMovieType();
        this.price = getPricing(this.movieType);
        this.rentalClass = new Rental(numberOfDays, movieType);

    }

    public double getPricing(String movieType) {

        if (movieType.equals(regularMovies)) {
            value = 1.00;
        } else if (movieType.equals(childrenMovies)) {
            value = 0.75;
        } else if (movieType.equals(newReleases)) {
            value = 1.50;
        }

        return value;
    }

    public String getMovieType() {

        if (Arrays.asList(newReleases).contains(this.title)) {
            return "New Release";
        } else if (Arrays.asList(childrenMovies).contains(this.title)) {
            return "Children Movie";
        } else {
            return "Regular Movie";
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getRegularMovies() {
        return regularMovies;
    }

    public void setRegularMovies(String[] regularMovies) {
        this.regularMovies = regularMovies;
    }

    public String[] getChildrenMovies() {
        return childrenMovies;
    }

    public void setChildrenMovies(String[] childrenMovies) {
        this.childrenMovies = childrenMovies;
    }

    public String[] getNewReleases() {
        return newReleases;
    }

    public void setNewReleases(String[] newReleases) {
        this.newReleases = newReleases;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public Rental getRentalClass() {
        return rentalClass;
    }

    public void setRentalClass(Rental rentalClass) {
        this.rentalClass = rentalClass;
    }
}