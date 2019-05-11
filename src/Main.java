public class Main {
    public static void main(String[] args) {
        String moviesPath="movies.txt";
        MyMovieColection myMovieColection = new MyMovieColection();
        myMovieColection.readMoviesFromFile(moviesPath);
        myMovieColection.showMovies();
        myMovieColection.sortMoviesByYear();
        myMovieColection.showMovies();
        myMovieColection.sortMoviesByScore();
        myMovieColection.showMovies();
        myMovieColection.sortMoviesByDuration();
        myMovieColection.showMovies();
    }
}
