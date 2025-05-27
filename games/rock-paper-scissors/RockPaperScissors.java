import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        // JAVA ROCK-PAPER-SCISSORS SHOOT
        System.out.println("-------------------------");
        System.out.println("ROCK-PAPER-SCISSORS SHOOT");
        System.out.println("-------------------------");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare variables
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            // Get choice from the user
            System.out.print("Enter your choice (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock")
                    && !playerChoice.equals("paper")
                    && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice by the user!");
                continue;
            }

            // Get random choice from the computer (for this, we utilize our random object)
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer's choice: " + computerChoice);

            // Check win conditions
            if(playerChoice.equals(computerChoice)){
                System.out.println("It's a tie!");
            }
            else if((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (playerChoice.equals("paper") && computerChoice.equals("rock"))
                    || (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win");
            }
            else{
                System.out.println("You lose!");
            }

            // Ask for play again
            System.out.println();
            System.out.print("Do you want to play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("yes"));

        // Goodbye message
        System.out.println("----------------------------------");
        System.out.println("Thanks for playing! See you again!");
        System.out.println("----------------------------------");

        scanner.close();
        
    }
}
