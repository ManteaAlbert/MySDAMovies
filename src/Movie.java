public class Movie {
    public long id;
    public String name;
    public Integer duration;
    public String type;
    public String genre;
    public Double score;
    public Integer year;


    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", type='" + type + '\'' +
                ", genre='" + genre + '\'' +
                ", score=" + score +
                ", year=" + year +
                '}';
    }
}
