import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args){

        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int balance;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // Display welcome message
        System.out.println("******************************");
        System.out.println("  🎰WELCOME TO JAVA SLOTS🎰  ");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("******************************");

        // Enter a base balance
        System.out.print("Enter an amount for putting the base balance (in $): ");
        balance = scanner.nextInt();

        // Play if balance > 0
        while(balance > 0){

            // Display current balance
            System.out.println("Current balance: $" + balance);

            // Enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            scanner.nextLine();

            // Verify if bet > balance
            if(bet > balance){
                System.out.println("INSUFFICIENT BALANCE!");
                continue;
            }
            // Verify if bet > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0!");
                continue;
            }
            // Subtract bet from balance
            else{
                balance -= bet;
            }

            // Spin row
            System.out.println("Spinning...");
            row = spinRow();

            // Print row
            printRow(row);

            // Get payout
            payout = getPayout(row, bet);
            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry! You lost this round!");
            }

            // Ask to play again
            System.out.println();
            System.out.print("Do you want to play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

            if(!playAgain.equals("yes")){
                break;
            }

        }

        // Display exit message
        System.out.println("You exited from the game!");
        System.out.println("Your final balance is $" + balance);
        System.out.println("THANK YOU! HAVE A NICE DAY!");

        scanner.close();

    }

    // Function to spin row
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i=0; i<3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // Function to print row
    static void printRow(String[] row){
        System.out.println("***********");
        System.out.println(" " + String.join("|", row));
        System.out.println("***********");
    }

    // Function to get payout
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[2]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
