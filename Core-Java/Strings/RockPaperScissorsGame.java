import java.util.*;

public class RockPaperScissorsGame {

    // Step 1: Get random computer choice
    public static String getComputerChoice() {
        String[] options = {"rock", "paper", "scissors"};
        int randomIndex = (int)(Math.random() * 3);
        return options[randomIndex];
    }

    // Step 2: Determine winner
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }
        return "Computer";
    }

    // Step 3: Display results
    public static void displayResults(String[][] results, int userWins, int computerWins) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("----------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }

        int totalGames = results.length;
        double userWinPercent = (userWins * 100.0) / totalGames;
        double computerWinPercent = (computerWins * 100.0) / totalGames;

        System.out.println("\nSummary:");
        System.out.println("User Wins: " + userWins + ", Computer Wins: " + computerWins);
        System.out.println("User Win Percentage: " + Math.round(userWinPercent * 100.0) / 100.0 + "%");
        System.out.println("Computer Win Percentage: " + Math.round(computerWinPercent * 100.0) / 100.0 + "%");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games you want to play: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] results = new String[games][3]; // User, Computer, Winner
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = getWinner(user, computer);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;
        }

        displayResults(results, userWins, computerWins);
        sc.close();
    }
}
