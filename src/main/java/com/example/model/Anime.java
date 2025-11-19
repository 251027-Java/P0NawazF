package model;

import java.util.Date;


public class Anime {
    private int id;
    private String title;
    private String genre;
    private Date releaseDate;
    private int totalEpisodes;
    private Status status;

    public Anime(String title, String genre, Date releaseDate, int totalEpisodes, Status status) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.totalEpisodes = totalEpisodes;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
