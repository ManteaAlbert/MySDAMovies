import java.io.File;
import java.util.Scanner;

public class MyMovieColection {

    public static final Integer DEFAULT_SEGMENT_ZISE = 16;

    public Movie[] movies;
    public int size;

    public void readMoviesFromFile(String FilePath) {
        File file = new File(FilePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] split = line.split(",");

                Movie movie = new Movie();
                movie.id = Long.valueOf(split[0]);
                movie.name = split[1];
                movie.duration = Integer.valueOf(split[2]);
                movie.type = split[3];
                movie.genre = split[4];
                movie.score = Double.valueOf(split[5]);
                movie.year = Integer.valueOf(split[6]);

                add(movie);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MyMovieColection() {

        movies = new Movie[DEFAULT_SEGMENT_ZISE];
        size = 0;
    }

    public void add(Movie movie) {
        this.movies[size] = movie;
        size++;

    }

    public void showMovies() {
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i]);
        }
    }

    /*
     * Bubble sort
     * */
    public void sortMoviesByYear(){


    }

    /*
     * Select sort
     * */
    public void sortMoviesByDuration(){


    }

    /*
     * Insert sort
     * */
    public void sortMoviesByScore(){


    }

}
