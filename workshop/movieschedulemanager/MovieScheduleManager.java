package movieschedulemanager;
import java.util.ArrayList;
import java.util.List;
	// Custom Exception for Invalid Time Format
	class InvalidTimeFormatException extends Exception {
	    public InvalidTimeFormatException(String message) {
	        super(message);
	    }
	}
	public class MovieScheduleManager {
	    private List<String> movieTitles;
	    private List<String> showTimes;

	    public  MovieScheduleManager() {
	        movieTitles = new ArrayList<>();
	        showTimes = new ArrayList<>();
	    }

	    // Validate time format (HH:mm)
	    private boolean isValidTimeFormat(String time) {
	        if (!time.matches("\\d{2}:\\d{2}")) return false;
	        String[] parts = time.split(":");
	        int hour = Integer.parseInt(parts[0]);
	        int minute = Integer.parseInt(parts[1]);
	        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60;
	    }

	    // Add a movie with title and time
	    public void addMovie(String title, String time) throws InvalidTimeFormatException {
	        if (!isValidTimeFormat(time)) {
	            throw new InvalidTimeFormatException("Invalid time format: " + time);
	        }
	        movieTitles.add(title);
	        showTimes.add(time);
	    }

	    // Search for movies by keyword
	    public void searchMovie(String keyword) {
	        System.out.println("Search Results for \"" + keyword + "\":");
	        boolean found = false;
	        for (int i = 0; i < movieTitles.size(); i++) {
	            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
	                System.out.println(String.format("• %s at %s", movieTitles.get(i), showTimes.get(i)));
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No matching movies found.");
	        }
	    }
//	    search for move by time
	    public void searchMovieByTime(String time)
	    {
	    	boolean found=false;
	    	   System.out.println("Movie at  \"" + time + "\":");
	    	   for (int i = 0; i < showTimes.size(); i++) {
		            if (showTimes.get(i).toLowerCase().contains(time.toLowerCase())) {
		                System.out.println(String.format("• %s at %s", movieTitles.get(i), showTimes.get(i)));
		                found = true;
		            }
		        }
		        if (!found) {
		            System.out.println("No matching movies found.");
		        }
	    }

	    // Display all movies
	    public void displayAllMovies() {
	        System.out.println(" All Scheduled Movies:");
	        for (int i = 0; i < movieTitles.size(); i++) {
	            System.out.println(String.format("• %s at %s", movieTitles.get(i), showTimes.get(i)));
	        }
	    }

	    // Generate printable report (convert to array)
	    public void generateReport() {
	        System.out.println(" Printable Movie Report:");
	        String[] report = new String[movieTitles.size()];
	        for (int i = 0; i < movieTitles.size(); i++) {
	            report[i] = movieTitles.get(i) + " - " + showTimes.get(i);
	            System.out.println(report[i]);
	        }
	    }

	    // Main method for demonstration
	    public static void main(String[] args) {
	    	 MovieScheduleManager manager = new  MovieScheduleManager();

	        try {
	            manager.addMovie("Inception", "14:30");
	            manager.addMovie("Interstellar", "17:45");
	            manager.addMovie("The Matrix", "20:00");
	            // manager.addMovie("Invalid Movie", "25:99"); // Uncomment to test exception
	        } catch (InvalidTimeFormatException e) {
	            System.out.println(" Error: " + e.getMessage());
	        }

	        manager.displayAllMovies();
	        manager.searchMovie("stellar");
	        manager.searchMovieByTime("14:30");
	        manager.generateReport();
	    }
	}