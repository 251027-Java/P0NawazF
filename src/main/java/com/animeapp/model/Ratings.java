package com.animeapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ratings", schema = "myanimelist")public class Ratings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int animeId;
    private int score;
    private String review;

    public Ratings(int animeId, int userId, int score, String review) {
        this.animeId = animeId;
        this.userId = userId;
        this.score = score;
        this.review = review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAnimeId() {
        return animeId;
    }

    public void setAnimeId(int animeId) {
        this.animeId = animeId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
