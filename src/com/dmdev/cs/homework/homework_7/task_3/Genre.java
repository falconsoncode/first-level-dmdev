package com.dmdev.cs.homework.homework_7.task_3;

public enum Genre {
    COMEDY("Комедия"),
    THRILLER("Триллер"),
    HORROR("Ужасы");
    private final String genre;

    Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
