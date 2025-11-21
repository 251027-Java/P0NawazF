package com.animeapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "anime", schema = "myanimelist")
public class Anime {
    @Id
    private Integer animeId;
    private String title;
    private Integer totalEpisodes;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Integer avgRating;

    public Integer getId() {
        return animeId;
    }

    public String getTitle() {
        return title;
    }


    public Integer getTotalEpisodes() {
        return totalEpisodes;
    }

    public Status getStatus() {
        return status;
    }

    public void setId(Integer animeId) {
        this.animeId = animeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalEpisodes(Integer totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getAvgRatings() {
        return avgRating;
    }

    public void setAvgRatings(Integer avgRating) {
        this.avgRating = avgRating;
    }
}
