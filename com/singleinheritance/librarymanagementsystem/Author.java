package singleinheritance.librarymanagementsystem;

public class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + "\nBio: " + bio);
    }
}
