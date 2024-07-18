package Assignment2;

public class InternationalMovie extends Movie {
    String country;
    String language;

    public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
                              String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + ", Country: " + country + ", Language: " + language;
    }
}
