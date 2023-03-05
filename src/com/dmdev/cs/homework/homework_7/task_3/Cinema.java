package com.dmdev.cs.homework.homework_7.task_3;

import java.util.*;

public class Cinema {
    private TreeMap<Integer, ArrayList<Movie>> movies;

    public Cinema(TreeMap<Integer, ArrayList<Movie>> filmsByYear) {
        this.movies = filmsByYear;
    }

    public void addMovie(Movie... movies) {
        for (Movie movie : movies) {
            this.movies.computeIfAbsent(movie.getYear(), key -> new ArrayList<>()).add(movie);
        }
    }

    public List<Movie> getMoviesByYear(Integer year) {
        return this.movies.get(year);
    }

    public List<Movie> getMoviesByYearAndMonths(Integer year, Integer month) {
        List<Movie> movies = this.movies.get(year);

        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getMonth() != month) {
                iterator.remove();
            }
        }

        return movies;
    }

    public List<Movie> getMoviesByGenre(String genre) {
        List<Movie> movies = new ArrayList<>();

        for (ArrayList<Movie> movieList : this.movies.values()) {
            for (Movie movie : movieList) {
                if (movie.getGenre().equals(genre)) {
                    movies.add(movie);
                }
            }
        }
        return movies;
    }

    public List<Movie> getTopTen() {
        List<Movie> movies = new ArrayList<>();
        for (ArrayList<Movie> movieList : this.movies.values()) {
            movies.addAll(movieList);
        }

        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return Integer.compare(movie2.getRating(), movie1.getRating());
            }
        });

        return movies.subList(0, Math.min(10, movies.size()));
    }

    public TreeMap<Integer, ArrayList<Movie>> getMovies() {
        return movies;
    }
}
