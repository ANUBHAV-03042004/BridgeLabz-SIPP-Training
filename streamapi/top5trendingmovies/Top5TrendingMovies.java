package top5trendingmovies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top5TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.0, 2024),
            new Movie("Movie C", 7.9, 2022),
            new Movie("Movie D", 8.8, 2023),
            new Movie("Movie E", 9.1, 2024),
            new Movie("Movie F", 8.6, 2024)
        );

        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                      .thenComparing(m -> m.releaseYear)
                      .reversed())
              .limit(5)
              .forEach(m -> System.out.println(m.title + " - " + m.rating + " (" + m.releaseYear + ")"));
    }
}