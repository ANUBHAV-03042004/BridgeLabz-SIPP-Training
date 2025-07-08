package linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManager {
    Movie head, tail;

    // Add a movie at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position
    public void addAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }
        newMovie.next = current.next;
        newMovie.prev = current;
        current.next.prev = newMovie;
        current.next = newMovie;
    }

    // Remove a movie by title
    public void removeByTitle(String title) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;
                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev;
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }

    // Search movie by director or rating
    public void searchByDirectorOrRating(String key) {
        boolean found = false;
        Movie current = head;
        while (current != null) {
            if (current.director.equalsIgnoreCase(key) || String.valueOf(current.rating).equals(key)) {
                System.out.println(current.title + " | " + current.director + " | " + current.yearOfRelease + " | " + current.rating);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("No match found for \"" + key + "\".");
    }

    // Update movie rating by title
    public void updateRatingByTitle(String title, double newRating) {
        Movie current = head;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title)) {
                current.rating = newRating;
                System.out.println("Rating updated for \"" + title + "\".");
                return;
            }
            current = current.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }

    // Display movies in forward order
    public void displayForward() {
        Movie current = head;
        System.out.println("Movies (Forward):");
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.yearOfRelease + " | " + current.rating);
            current = current.next;
        }
    }

    // Display movies in reverse order
    public void displayBackward() {
        Movie current = tail;
        System.out.println("Movies (Backward):");
        while (current != null) {
            System.out.println(current.title + " | " + current.director + " | " + current.yearOfRelease + " | " + current.rating);
            current = current.prev;
        }
    }
}

