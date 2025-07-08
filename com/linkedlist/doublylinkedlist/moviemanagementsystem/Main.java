package linkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();

        manager.addAtEnd("Inception", "Nolan", 2010, 9.0);
        manager.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        manager.addAtEnd("Parasite", "Bong Joon-ho", 2019, 8.6);
        manager.addAtPosition("Dangal", "Nitesh Tiwari", 2016, 8.4, 2);

        manager.displayForward();
        manager.displayBackward();

        manager.updateRatingByTitle("Parasite", 9.2);
        manager.searchByDirectorOrRating("Nolan");

        manager.removeByTitle("Dangal");
        manager.displayForward();
    }
}

