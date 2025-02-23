import java.util.Scanner;
import java.util.Random;

public class rockpapaerscissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        int userscore = 0, computerscore = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("How many rounds would you like to play? ");
        int totalRounds = sc.nextInt();

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\nRound " + round);
            System.out.println("Choose your move: (0) Rock, (1) Paper, (2) Scissors");
            System.out.print("Your choice: ");
            int userChoice = sc.nextInt();

            while (userChoice < 0 || userChoice > 2) {
                System.out.print("Invalid choice. Please choose 0, 1, or 2: ");
                userChoice = sc.nextInt();
            }

            int computerChoice = r.nextInt(3);
            System.out.println("Computer chose: " + options[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win this round!");
                userscore++;
            } else {
                System.out.println("You Loss this round.");
                computerscore++;
            }
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + userscore + " | Computer: " + computerscore);
        if (userscore > computerscore) {
            System.out.println("Congratulations! You win the game!");
        } else if (userscore < computerscore) {
            System.out.println("Computer wins the game. Better luck next time!");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();
    }
}
