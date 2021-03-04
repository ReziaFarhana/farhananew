package databaseconnection;

public class Movie {
    //step-1 : create Global variable
    private int id;
    private String title;
    private int releaseYear;
    private String genre;
    private String mpaRating;
    private String producer;


   //Step 2: create a method
    public Movie(){

    }

    //step-3:create parameterized method & connect local variable with local variable

    public Movie(int id, String title, int releaseYear, String genre, String mpaRating, String producer){

        this.id=id;
        this.title=title;
        this. releaseYear=releaseYear;
        this.genre=genre;
        this.mpaRating=mpaRating;
        this.producer=producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMpaRating() {
        return mpaRating;
    }

    public void setMpaRating(String mpaRating) {
        this.mpaRating = mpaRating;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
