package se.lexicon.Encapsulation;

// Exercise 13
public class Movie {
    private String title;
    private String director;
    private double duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getMovieDetails(){
        String details = "The movie is called %s and is directed by %s, it's %.2fm long.";
        return String.format(details, title, director, duration);
    }
}
