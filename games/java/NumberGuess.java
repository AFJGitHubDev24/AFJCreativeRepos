import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);
        
        /*
            Guess the number in a certain range (min-max range). If the guess is right, you win. Else, try again!        
        */
        System.out.println("..........NUMBER GUESSING GAME..........");
        System.out.printf("Guess a number between %d-%d:\n ", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again!");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again!");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }

        }while(guess != randomNumber);

        System.out.println("You have won!");

        scanner.close();

    }
}
