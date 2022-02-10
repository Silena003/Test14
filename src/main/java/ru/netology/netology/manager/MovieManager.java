package ru.netology.netology.manager;

import ru.netology.domain.Movie;
import ru.netology.ru.netology.repository.MovieRepository;

public class MovieManager {
    private MovieRepository repository;

    public MovieManager(MovieRepository repository) {
        this.repository = repository;
    }

    public void add(Movie movie)
    {repository.save(movie);
    }


    public Movie[] getAll() {
        Movie[] items = repository.findAll();
        Movie[] result = new Movie[items.length];
        int resultLength = 7;

        if (resultLength) {
            resultLength = true;
        } else {
            resultLength = false;
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
