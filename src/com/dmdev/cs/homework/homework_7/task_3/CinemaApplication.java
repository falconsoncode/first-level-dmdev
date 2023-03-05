package com.dmdev.cs.homework.homework_7.task_3;

import java.util.*;

public class CinemaApplication {
    public static void main(String[] args) {

        Cinema cinema = new Cinema(new LinkedHashMap<>());

        Movie movie1 = new Movie(1, 1900, 1, "Ужасы", 6);
        Movie movie2 = new Movie(2, 1900, 2, "Комедия", 7);
        Movie movie3 = new Movie(3, 1900, 3, "Триллер", 2);
        Movie movie4 = new Movie(4, 1930, 4, "Комедия", 10);
        Movie movie5 = new Movie(5, 1930, 5, "Триллер", 7);
        Movie movie6 = new Movie(6, 1930, 6, "Ужасы", 8);
        Movie movie7 = new Movie(7, 1950, 7, "Триллер", 9);
        Movie movie8 = new Movie(8, 1950, 8, "Ужасы", 3);
        Movie movie9 = new Movie(9, 1950, 9, "Триллер", 6);
        Movie movie10 = new Movie(10, 1970, 10, "Ужасы", 5);
        Movie movie11 = new Movie(11, 1970, 11, "Комедия", 3);
        Movie movie12 = new Movie(12, 1990, 12, "Ужасы", 5);
        Movie movie13 = new Movie(13, 1990, 1, "Триллер", 10);
        Movie movie14 = new Movie(14, 1990, 2, "Комедия", 5);
        Movie movie15 = new Movie(15, 1990, 2, "Комедия", 5);
        Movie movie16 = new Movie(16, 1990, 2, "Комедия", 5);

        System.out.println("Добавляем фильмы");
        cinema.addMovie(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11,
                movie12, movie13, movie14, movie16, movie15);
        System.out.println();

        System.out.println("Количесвто элементов в treeMap = " + cinema.getMovies().size());
        for (Map.Entry<Integer, ArrayList<Movie>> entry :cinema.getMovies().entrySet()){
            System.out.println(entry.getKey() + ", количество фильмов = " + entry.getValue().size());
        }
        System.out.println();

        System.out.println("Фильмы по году");
        List<Movie> moviesByYear = cinema.getMoviesByYear(1990);
        moviesByYear.forEach(x -> System.out.println(x.toString()));
        System.out.println();

        System.out.println("Фильмы по году и месяцу");
        List<Movie> moviesByYearAndMonths = cinema.getMoviesByYearAndMonths(1990, 2);
        moviesByYearAndMonths.forEach(x -> System.out.println(x.toString()));
        System.out.println();

        System.out.println("Фильмы по жанру");
        List<Movie> moviesMoviesByGenres = cinema.getMoviesByGenre(Genre.COMEDY.getGenre());
        moviesMoviesByGenres.forEach(x -> System.out.println(x.toString()));
        System.out.println();

        System.out.println("Топ 10 фильмов");
        List<Movie> topTen = cinema.getTopTen();
        topTen.forEach(x -> System.out.println(x.toString()));
        System.out.println();
    }
}
