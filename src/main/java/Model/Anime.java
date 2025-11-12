package Model;
import java.util.Date;


public class Anime {
    private int id;
    private String title;
    private String genre;
    private Date releaseDate;
    private int totalEpisodes;
    private Status status;

    public Anime(int id, String title, String genre, Date releaseDate, int totalEpisodes, Status status){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.totalEpisodes = totalEpisodes;
        this.status = status;
    }

    public int getId(){return this.id;}
    public String getTitle(){return this.title;}
    public String getGenre(){return this.genre;}
    public Date getReleaseDate(){return this.releaseDate;}
    public int getTotalEpisodes(){return this.totalEpisodes;}
    public Status getStatus(){return this.status;}




//    id (int) – unique identifier
//
//    title (String) – name of the anime
//
//    genre (String) – genre(s) of the anime
//
//    releaseDate (Date) – when it aired
//
//    totalEpisodes (int) – number of episodes
//
//    status (String) – "Ongoing" or "Completed"

}
