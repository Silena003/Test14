package ru.netology.ru.netology.repository;

import ru.netology.domain.Movie;

public class MovieRepository {
    public static Movie[] items = new Movie[0];

    public static void save(Movie item) {
        int length = items.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Movie[] findAll() {
        return items;
    }

}
