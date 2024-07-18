package Assignment2;

public class Moviedemo{
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        // Store objects of Movie, SpecialMovie, and InternationalMovie
        movies[0] = new Movie("Inception", "Christopher Nolan");
        movies[1] = new SpecialMovie("Avatar", "James Cameron", "svrr", 29,2018,"Action","Dolby", "2D");
        movies[2] = new InternationalMovie("Parasite", "Bong Joon-ho", "raj", 30, 2002,"Drama","India","Hindi");

        // Display information of each movie
        for (Movie movie : movies) {
            movie.showDetails();
            System.out.println();
        }
    }
}
