package com.animeapp.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anime", schema = "myanimelist")
public class Anime {
    @Id
    private int id;
    private String title;
    private int totalEpisodes;
    private Status status;

    public Anime(String title, int totalEpisodes, Status status) {
        this.title = title;
        this.totalEpisodes = totalEpisodes;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public void setTotalEpisodes(int totalEpisodes) {
        this.totalEpisodes = totalEpisodes;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
