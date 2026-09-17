class Movie {

    int id;
    String name;
    String time;

    Movie(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }
}

class MovieController {

    Movie movie;

    MovieController(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }
}

class MovieView {

    public void displayMovie(Movie movie) {

        System.out.println("Movie ID: " + movie.id);
        System.out.println("Movie Name: " + movie.name);
        System.out.println("Show Time: " + movie.time);
    }
}

public class Task4 {

    public static void main(String[] args) {

        Movie movie = new Movie(1, "Avengers", "7:00 PM");

        MovieController controller = new MovieController(movie);

        MovieView view = new MovieView();

        Movie m = controller.getMovie();

        view.displayMovie(m);
    }
}