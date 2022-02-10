package ru.netology.domain;

public class Movie {
    private int id;
    private int movieId;
    private String movieName;

    public Movie(int id, int movieId, String movieName) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
    }
    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public static void main (String[] args) {
        String[] movie = {
                "Бладшот",
                "Вперед",
                "Отель Белград",
                "Джентльмены",
                "Человек-невидимка",
                "Тролли. Мировой тур",
                "Номер один"
        };
        String[] tmp = new String[movie.length];
    }

}
