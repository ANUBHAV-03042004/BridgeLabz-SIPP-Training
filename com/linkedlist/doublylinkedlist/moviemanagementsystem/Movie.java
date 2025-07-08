package linkedlist.doublylinkedlist.moviemanagementsystem;

public class Movie {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie next;
    Movie prev;

    Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
