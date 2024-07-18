package Assignment2;

public class Movie {
    String movieName;
    String producedBy;
    String directedBy;
    int duration;
    int year;
    String category;

    private static int moviesCount = 0;
    private final String movieId;

    public Movie(String movieName, String producedBy) {
        if(movieName == null || producedBy == null || movieName.isEmpty() || producedBy.isEmpty()) {
            throw new IllegalArgumentException("movieName and producedBy are mandatory fields");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;
        this.movieId = movieName + "_" + ++moviesCount;
    }

    public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String showDetails() {
        return "Movie name: " + movieName + ", Produced by: " + producedBy + ", Directed by: " + directedBy +
                ", Duration: " + duration + ", Year: " + year + ", Category: " + category + ", Movie ID: " + movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Kushi", "Vyjayanthi");
        Movie m2 = new Movie("Bahubali", "UV", "SSR", 180, 2015, "Action");
        System.out.println(m1.showDetails());
        System.out.println(m2.showDetails());
        System.out.println("Total movies created: " + Movie.getMoviesCount());

        Movie[] movies = new Movie[3];

        // Store objects of Movie, SpecialMovie, and InternationalMovie
        movies[0] = new Movie("Indra", "Noor");
        movies[1] = new SpecialMovie("Anandam", "Joseph", "James", 162, 2009, "Action", "Dolby", "3D");
        movies[2] = new InternationalMovie("kushiyam", "Bheema", "Murugam", 132, 2019, "Drama", "South Korea", "Korean");

        // Display information of each movie
        for (Movie movie : movies) {
            System.out.println(movie.showDetails());
        }
    }
}

